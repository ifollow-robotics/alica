/*
 * BehaviourPool.h
 *
 *  Created on: Jun 13, 2014
 *      Author: Stephan Opfer
 */

#ifndef BEHAVIOURPOOL_H_
#define BEHAVIOURPOOL_H_

using namespace std;

#include <map>
#include <typeindex>
#include <iostream>
#include <memory>

#include <engine/IBehaviourPool.h>

namespace alica
{

	class BehaviourConfiguration;
	class BasicBehaviour;

	/**
	 * Manages the connection between the domain specific implementation (BasicBehaviours) of Behaviours.
	 * It creates used BasicBehaviours with its given BehaviourCreator and starts and stops the Behaviours.
	 */
	class BehaviourPool : public IBehaviourPool
	{

	public:
		BehaviourPool();
		virtual ~BehaviourPool();
		void stopAll();
		bool init(IBehaviourCreator* bc);
		void stopBehaviour(shared_ptr<RunningPlan> rp);
		void startBehaviour(shared_ptr<RunningPlan> rp);
	private:
		/**
		 * Manages behaviours used by the running ALICA program.
		 * The key of the map is the behaviour configuration, which is created through the plan designer.
		 * The value is the basic behaviour, which is the implementation of that behaviour.
		 */
		map<BehaviourConfiguration*, shared_ptr<BasicBehaviour> >* availableBehaviours;

		IBehaviourCreator* behaviourCreator;

	};

} /* namespace alica */

#endif /* BEHAVIOURPOOL_H_ */
