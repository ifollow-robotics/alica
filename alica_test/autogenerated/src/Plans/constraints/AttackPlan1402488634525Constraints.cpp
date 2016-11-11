#include "Plans/constraints/AttackPlan1402488634525Constraints.h"
using namespace std;
using namespace alica;
/*PROTECTED REGION ID(ch1402488634525) ENABLED START*/
//Add additional using directives here
/*PROTECTED REGION END*/

namespace alicaAutogenerated
{
//Plan:AttackPlan

/*		
 * Tasks: 
 * - EP:1402488646221 : DefaultTask (1225112227903)
 *
 * States:
 * - Attack (1402488646220)
 * - Shoot (1402489396914)
 *
 * Vars:				
 * - TestVar1 (1403772778288) 				
 * - VarTest2 (1403772797469) 				
 * - NewVar (1403772816953) 				
 * - ABC (1403772834750) 
 */

// State: Attack

/*		
 * Transition: 
 * - Name: MISSING_NAME
 * - ConditionString: 
 *
 * Plans in State: 				
 * - Plan - (Name): Tackle, (PlanID): 1402489318663 				
 * - Plan - (Name): AttackOppDefault, (PlanID): 1402489366699 
 * Static Variables: [ABC, TestVar1]
 * Domain Variables:

 * forall agents in AttackPlan let v = [X, Y] 

 * forall agents in Attack let v = [A, B] 

 * forall agents in Shoot let v = [another one] 

 * forall agents in MISSING_NAME let v = [TaskQuantifier] 

 */
void Constraint1402489460549::getConstraint(shared_ptr<ProblemDescriptor> c, shared_ptr<RunningPlan>)
{
  /*PROTECTED REGION ID(cc1402489460549) ENABLED START*/
  //Proteced
  /*PROTECTED REGION END*/
}

// State: Attack

// State: Shoot

/*		
 * Transition: 
 * - Name: Condition-Name-Shoot-Attack
 * - ConditionString: Some nice comment!
 *
 * Plans in State: 				
 * - Plan - (Name): AttackDefault, (PlanID): 1402488866727 
 * Static Variables: [TestVar1, VarTest2, NewVar, ABC]
 * Domain Variables:

 */
void Constraint1402489462088::getConstraint(shared_ptr<ProblemDescriptor> c, shared_ptr<RunningPlan>)
{
  /*PROTECTED REGION ID(cc1402489462088) ENABLED START*/
  //Proteced
  /*PROTECTED REGION END*/
}

// State: Shoot

}
