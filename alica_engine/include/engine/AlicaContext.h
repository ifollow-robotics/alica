/**
 * @file
 * This file contains api interface of alica for applications.
 */

#pragma once

#include <assert.h>
#include <memory>
#include <string>
#include <type_traits>
#include <unordered_map>

#include "engine/IBehaviourCreator.h"
#include "engine/IConditionCreator.h"
#include "engine/IConstraintCreator.h"
#include "engine/IUtilityCreator.h"
#include "engine/constraintmodul/ISolver.h"

namespace alica
{

class AlicaEngine;
class IAlicaCommunication;
class AlicaTestEngineGetter;

/**
 * Alica options that can be set at runtime.
 * They are either not part of conf files or app might want to override them at runtime.
 */
enum class AlicaOption : int
{
    ALICA_THREADPOOL_SIZE,
    ALICA_ENGINE_FREQUENCY,
    ALICA_MIN_BROADCAST_FREQUENCY,
    ALICA_MAX_BROADCAST_FREQUENCY,
    ALICA_TEAM_TIMEOUT,
    ALICA_ASSIGNMENT_PROTECTION_TIME
    // More to come
};

/**
 * Alica creators that framework uses to instantiate various behaviours, utilities, conditions or constraints.
 */
struct AlicaCreators
{
    AlicaCreators(std::unique_ptr<IConditionCreator> cc, std::unique_ptr<IUtilityCreator> uc, std::unique_ptr<IConstraintCreator> crc,
            std::unique_ptr<IBehaviourCreator> bc)
            : conditionCreator(std::move(cc))
            , utilityCreator(std::move(uc))
            , constraintCreator(std::move(crc))
            , behaviourCreator(std::move(bc))
    {
        assert(conditionCreator && utilityCreator && constraintCreator && behaviourCreator);
    }

    std::unique_ptr<IConditionCreator> conditionCreator;
    std::unique_ptr<IUtilityCreator> utilityCreator;
    std::unique_ptr<IConstraintCreator> constraintCreator;
    std::unique_ptr<IBehaviourCreator> behaviourCreator;
};

/*
 * @class AlicaContext
 *
 * @brief AlicaContext class is an interface class to alica. AlicaContext object encapsulates all the global state
 * associated with this instance of framework. An application must instantiate and use this class to launch alica.
 */
class AlicaContext
{
public:
    /**
     * Get host (or agent) name for this process.
     *
     * @return The agent name under which the engine operates, a string
     */
    static std::string getRobotName();

    /**
     * Set host (or agent) name for this process.
     *
     * @param name Host name
     */
    static void setRobotName(const std::string& name);

    // TODO: better descriptive name for paths
    /**
     * Set root path for this process.
     *
     * @param path Root path
     */
    static void setRootPath(const std::string& path);

    /**
     * Set config path for this process.
     *
     * @param path Config path
     */
    static void setConfigPath(const std::string& path);

    /**
     * Get version of Alica engine.
     *
     * @param[out] major Version major
     * @param[out] minor Version minor
     * @param[out] patch Version patch
     */
    static void getVersion(int& major, int& minor, int& patch);

    /**
     * Creates AlicaContext object.
     *
     * @param roleSetName Name for roleset
     * @param masterPlanName Name for the main plan
     * @param stepEngine (?)
     *
     * @note This is the main alica api class
     */
    AlicaContext(const std::string& roleSetName, const std::string& masterPlanName, bool stepEngine);

    /**
     * Destroys AlicaContext object.
     */
    ~AlicaContext();

    AlicaContext(const AlicaContext& other) = delete;
    AlicaContext& operator=(const AlicaContext& other) = delete;

    /**
     * Initialize alica framework and related modules.
     *
     * @param creatorCtx Creator functions for utility, behaviour, constraint and condition
     *
     * @return Return code '0' stands for success, any other for corresponding error
     *
     * @see AlicaCreators
     */
    int init(AlicaCreators& creatorCtx);

    /**
     * Terminate alica framework and related modules. This function must be called for safe termination before
     * deleting Context.
     *
     * @param creatorCtx Creator functions for utility, behaviour, constraint and condition
     *
     * @return Return code '0' stands for success, any other for corresponding error
     */
    int terminate();

    /**
     * Set communicator to be used by this alica framework instance.
     * Example usage: setCommunicator<alicaDummyProxy::AlicaDummyCommunication>();
     *
     * @note CommunicatorType must be a derived class of IAlicaCommunication
     * @note This must be called before initializing context
     *
     * @param args Arguments to be forwarded to constructor of communicator. Might be empty.
     */
    template <class CommunicatorType, class... Args>
    void setCommunicator(Args&&... args);

    /**
     * Get communicator being used by this alica instance.
     *
     * @return A reference to communicator object being used by context
     */
    const IAlicaCommunication& getCommunicator() const
    {
        assert(_communicator.get());
        return *_communicator;
    }

    /**
     * Add a solver to be used by this alica instance.
     * Example usage: addSolver<alica::reasoner::ConstraintTestPlanDummySolver>();
     *
     * @note SolverType must be a derived class of ISolverBase
     *
     * @param args Arguments to be forwarded to constructor of solver. Might be empty.
     */
    template <class SolverType, class... Args>
    void addSolver(Args&&... args);

    /**
     * Get a particular solver from alica instance.
     * Example usage: getSolver<alica::reasoner::ConstraintTestPlanDummySolver>();
     *
     * @note If in doubt, check whether solver exists with existSolver() method
     *
     * @return A reference to requested solver instance
     */
    template <class SolverType>
    SolverType& getSolver() const;

    /**
     * Check whether a particular solver is associated with this alica instance.
     * Example usage: existSolver<alica::reasoner::ConstraintTestPlanDummySolver>();
     *
     * @return True if the solver exist, false otherwise
     */
    template <class SolverType>
    bool existSolver() const;

    /**
     * Check whether object is a valid AlicaContext.
     *
     * @return True if object is a valid context, false otherwise
     */
    bool isValid();

    // TODO: Implement
    template <class T>
    int set(AlicaOption option, T optval);
    template <class T>
    T get(AlicaOption option) const;

private:
    friend class AlicaTestEngineGetter;

    uint32_t _validTag;
    std::unique_ptr<AlicaEngine> _engine;
    std::unique_ptr<IAlicaCommunication> _communicator;
    std::unordered_map<size_t, std::unique_ptr<ISolverBase>> _solvers;
};

template <class CommunicatorType, class... Args>
void AlicaContext::setCommunicator(Args&&... args)
{
    static_assert(std::is_base_of<IAlicaCommunication, CommunicatorType>::value, "Must be derived from IAlicaCommunication");
    _communicator = std::make_unique<CommunicatorType>(_engine.get(), std::forward<Args>(args)...);
}

template <class SolverType, class... Args>
void AlicaContext::addSolver(Args&&... args)
{
    static_assert(std::is_base_of<ISolverBase, SolverType>::value, "Must be derived from ISolverBase");
    _solvers.emplace(typeid(SolverType).hash_code(), std::make_unique<SolverType>(_engine.get(), std::forward<Args>(args)...));
}

template <class SolverType>
SolverType& AlicaContext::getSolver() const
{
    auto cit = _solvers.find(typeid(SolverType).hash_code());
    assert(cit != _solvers.end());
    return static_cast<SolverType&>(*(cit->second));
}

template <class SolverType>
bool AlicaContext::existSolver() const
{
    auto cit = _solvers.find(typeid(SolverType).hash_code());
    return (cit != _solvers.end());
}
}
