#ifndef Defend_H_
#define Defend_H_

#include "DomainCondition.h"
#include "engine/BasicUtilityFunction.h"
#include "engine/UtilityFunction.h"
#include "engine/DefaultUtilityFunction.h"
/*PROTECTED REGION ID(incl1402488893641) ENABLED START*/
//Add inlcudes here
/*PROTECTED REGION END*/
using namespace alica;

namespace alicaAutogenerated
{
/*PROTECTED REGION ID(meth1402488893641) ENABLED START*/
//Add other things here
/*PROTECTED REGION END*/
class UtilityFunction1402488893641 : public BasicUtilityFunction
{
  shared_ptr<UtilityFunction> getUtilityFunction(Plan* plan);
};

class TransitionCondition1402488993122 : public DomainCondition
{
  bool evaluate(shared_ptr<RunningPlan> rp);
};

class TransitionCondition1402488991641 : public DomainCondition
{
  bool evaluate(shared_ptr<RunningPlan> rp);
};

class TransitionCondition1402489065962 : public DomainCondition
{
  bool evaluate(shared_ptr<RunningPlan> rp);
};

class TransitionCondition1402489073613 : public DomainCondition
{
  bool evaluate(shared_ptr<RunningPlan> rp);
};

} /* namespace alica */

#endif
