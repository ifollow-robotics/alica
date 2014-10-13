/*
 * MultiAgentTestPlan1413200862180.h
 *
 *  Created on: Oct 13, 2014
 *      Author: Stefan Jakob
 */

#ifndef ALICA_ALICA_TEST_INCLUDE_MULTIAGENTTESTPLAN1413200862180_H_
#define ALICA_ALICA_TEST_INCLUDE_MULTIAGENTTESTPLAN1413200862180_H_

#include "engine/BasicCondition.h"
#include "engine/BasicUtilityFunction.h"
#include "engine/UtilityFunction.h"
#include "engine/DefaultUtilityFunction.h"

using namespace alica;

namespace alicaAutogenerated
{

	class UtilityFunction1413200862180 : public BasicUtilityFunction
	{
		shared_ptr<UtilityFunction> getUtilityFunction(Plan* plan);
	};

	class TransitionCondition1413201052549 : public BasicCondition
	{
		bool evaluate(shared_ptr<RunningPlan> rp);
	};

	class TransitionCondition1413201367990 : public BasicCondition
	{
		bool evaluate(shared_ptr<RunningPlan> rp);
	};

	class TransitionCondition1413201370590 : public BasicCondition
	{
		bool evaluate(shared_ptr<RunningPlan> rp);
	};
} /* namespace alica */

#endif /* ALICA_ALICA_TEST_INCLUDE_MULTIAGENTTESTPLAN1413200862180_H_ */