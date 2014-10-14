#include <gtest/gtest.h>
#include <engine/AlicaEngine.h>
#include <engine/IAlicaClock.h>
#include "engine/IAlicaCommunication.h"
#include "engine/model/State.h"
#include "TestBehaviourCreator.h"
#include "engine/model/Behaviour.h"
#include "engine/PlanRepository.h"
#include "engine/BasicBehaviour.h"
#include "engine/IBehaviourPool.h"
#include "engine/PlanBase.h"
#include <clock/AlicaROSClock.h>
#include <communication/AlicaRosCommunication.h>
#include  "engine/DefaultUtilityFunction.h"
#include  "engine/ITeamObserver.h"
#include "engine/model/Plan.h"
#include "engine/model/RuntimeCondition.h"
#include "TestConditionCreator.h"
#include "TestConstraintCreator.h"
#include "TestUtilityFunctionCreator.h"
#include "Attack.h"
#include "MidFieldStandard.h"
#include "engine/Assignment.h"
#include "engine/collections/AssignmentCollection.h"
#include "engine/collections/StateCollection.h"
#include "SimpleTestPlan1412252439925.h"

using namespace alicaAutogenerated;

class AlicaSimplePlan : public ::testing::Test
{
protected:
	supplementary::SystemConfig* sc;
	alica::AlicaEngine* ae;
	alicaTests::TestBehaviourCreator* bc;
	alicaTests::TestConditionCreator* cc;
	alicaTests::TestUtilityFunctionCreator* uc;
	alicaTests::TestConstraintCreator* crc;

	virtual void SetUp()
	{
		// determine the path to the test config
		string path = supplementary::FileSystem::getSelfPath();
		int place = path.rfind("devel");
		path = path.substr(0, place);
		path = path + "src/alica/alica_test/src/test";

		// bring up the SystemConfig with the corresponding path
		sc = supplementary::SystemConfig::getInstance();
		sc->setRootPath(path);
		sc->setConfigPath(path + "/etc");
		sc->setHostname("nase");

		// setup the engine
		ae = new alica::AlicaEngine();
		bc = new alicaTests::TestBehaviourCreator();
		cc = new alicaTests::TestConditionCreator();
		uc = new alicaTests::TestUtilityFunctionCreator();
		crc = new alicaTests::TestConstraintCreator();
		ae->setIAlicaClock(new alicaRosProxy::AlicaROSClock());
		ae->setCommunicator(new alicaRosProxy::AlicaRosCommunication(ae));
	}

	virtual void TearDown()
	{

		ae->shutdown();
		sc->shutdown();
		delete ae->getIAlicaClock();
		delete ae->getCommunicator();
		delete cc;
		delete bc;
		delete uc;
		delete crc;
	}
};
/**
 * Tests whether it is possible to run a behaviour in a primitive plan.
 */
TEST_F(AlicaSimplePlan, runBehaviourInSimplePlan)
{

	EXPECT_TRUE(ae->init(bc, cc, uc, crc, "Roleset", "SimpleTestPlan", ".", false))
			<< "Unable to initialise the Alica Engine!";

	ae->start();

	unsigned int sleepTime = 1;
	sleep(sleepTime);

	//Check whether RC can be called
	EXPECT_TRUE(ae->getPlanBase()->getRootNode()->evalRuntimeCondition());
	//Check wheter RC has been called
	EXPECT_GE(((RunTimeCondition1412781693884*)&*ae->getPlanBase()->getRootNode()->getPlan()->getRuntimeCondition()->getBasicCondition())->called, 1);

	//Check final state
	EXPECT_EQ(ae->getPlanBase()->getRootNode()->getActiveState()->getId(), 1412761855746);
	//Check execution of final state behaviour
	EXPECT_EQ((*ae->getPlanBase()->getRootNode()->getChildren().begin())->getBasicBehaviour()->getName(),
				string("Attack"));
	//Assuming 30 Hz were 11 iterations are executed by MidFieldStandard, we expect at least 29*sleeptime-15 calls on Attack
	EXPECT_GT(
			((alicaTests::Attack* )&*(*ae->getPlanBase()->getRootNode()->getChildren().begin())->getBasicBehaviour())->callCounter,
			(sleepTime) * 29 - 15);
	EXPECT_GT(
			((alicaTests::Attack* )&*(*ae->getPlanBase()->getRootNode()->getChildren().begin())->getBasicBehaviour())->initCounter,
			0);

	//Check whether we have been in state1 to execute midfield standard
	for (auto iter : *ae->getBehaviourPool()->getAvailableBehaviours())
	{
		if (iter.second->getName() == "MidFieldStandard")
		{
			EXPECT_GT(((alicaTests::MidFieldStandard* )&*iter.second)->callCounter, 10);
		}
	}
}

