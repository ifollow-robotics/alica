#include "Plans/RuntimeConditionPlan1418042806575.h"
using namespace alica;
/*PROTECTED REGION ID(eph1418042806575) ENABLED START*/ //Add additional using directives here
#include "DistXContour.h"
#include "engine/USummand.h"
#include "TestConstantValueSummand.h"
#include "TestWorldModel.h"
/*PROTECTED REGION END*/
namespace alicaAutogenerated
{
    //Plan:RuntimeConditionPlan

    //Check of RuntimeCondition - (Name): NewRuntimeCondition, (ConditionString): , (Comment) :  

    /* 
     * Available Vars:
     */
    bool RunTimeCondition1418042967134::evaluate(shared_ptr<RunningPlan> rp)
    {
        /*PROTECTED REGION ID(1418042967134) ENABLED START*/
    	return alicaTests::TestWorldModel::getOne()->isRuntimeCondition1418042967134();
        /*PROTECTED REGION END*/
    }

    /* generated comment
     
     Task: DefaultTask  -> EntryPoint-ID: 1418042806577

     */
    shared_ptr<UtilityFunction> UtilityFunction1418042806575::getUtilityFunction(Plan* plan)
    {
        /*PROTECTED REGION ID(1418042806575) ENABLED START*/

    	TestConstantValueSummand* us = new TestConstantValueSummand(0.5, "RuntimeConditionPlan", 1, 1.0);
		list<USummand*> utilSummands;
		utilSummands.push_back(us);
		shared_ptr<UtilityFunction> function = make_shared<UtilityFunction>("RuntimeConitionTestUtilSummand", utilSummands, 0.5, 0.1, plan);

		return function;
        /*PROTECTED REGION END*/
    }

//State: RuntimeConditionTest in Plan: RuntimeConditionPlan

}
