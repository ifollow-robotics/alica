#ifndef ConstraintTestPlanCONSTRAINT_H_
#define ConstraintTestPlan_H_
#include "engine/BasicConstraint.h"
#include <memory>

using namespace std;
using namespace alica;

namespace alica
{
    class ProblemDescriptor;
    class RunningPlan;
}

namespace alicaAutogenerated
{

    class Constraint1414068566297 : public BasicConstraint
    {
        void getConstraint(shared_ptr<ProblemDescriptor> c, shared_ptr<RunningPlan>);
    };

} /* namespace alica */

#endif /* ConstraintTestPlanCONSTRAINT_H_ */
