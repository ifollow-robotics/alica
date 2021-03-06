#include "engine/IRoleAssignment.h"

#include "engine/AlicaEngine.h"

namespace alica
{
IRoleAssignment::IRoleAssignment()
        : _ownRole(nullptr)
{
}

const Role* IRoleAssignment::getRole(AgentIDConstPtr robotId) const
{
    auto iter = _robotRoleMapping.find(robotId);
    if (iter != _robotRoleMapping.end()) {
        return iter->second;
    } else {
        std::stringstream ss;
        ss << "RA: There is no role assigned for robot: " << *robotId << std::endl;
        AlicaEngine::abort(ss.str());
        return nullptr;
    }
}

} /* namespace alica */
