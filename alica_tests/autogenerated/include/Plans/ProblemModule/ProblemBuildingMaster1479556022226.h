#ifndef ProblemBuildingMaster_H_
#define ProblemBuildingMaster_H_

#include "DomainCondition.h"
#include "engine/BasicUtilityFunction.h"
#include "engine/UtilityFunction.h"
#include "engine/DefaultUtilityFunction.h"
/*PROTECTED REGION ID(incl1479556022226) ENABLED START*/
// Add inlcudes here
/*PROTECTED REGION END*/
using namespace alica;

namespace alicaAutogenerated {
/*PROTECTED REGION ID(meth1479556022226) ENABLED START*/
// Add other things here
/*PROTECTED REGION END*/
class UtilityFunction1479556022226 : public BasicUtilityFunction {
    shared_ptr<UtilityFunction> getUtilityFunction(Plan* plan);
};

class TransitionCondition1479557592662 : public DomainCondition {
    bool evaluate(shared_ptr<RunningPlan> rp);
};

}  // namespace alicaAutogenerated

#endif
