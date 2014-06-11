/*
 * PlanType.h
 *
 *  Created on: Mar 5, 2014
 *      Author: Stephan Opfer
 */

#ifndef PLANTYPE_H_
#define PLANTYPE_H_

using namespace std;

#include <string>
#include <sstream>
#include <list>

#include "AbstractPlan.h"
#include "Plan.h"
#include "Parametrisation.h"


namespace alica
{

	class PlanType : public AbstractPlan
	{
	public:
		PlanType();
		virtual ~PlanType();

		const virtual string& getFileName() const;
		string toString();

		const list<Parametrisation*>& getParametrisation() const;
		void setParametrisation(const list<Parametrisation*>& parametrisation);
		list<Plan*>& getPlans() ;
		void setPlans(const list<Plan*>& plans);

	protected:
		list<Plan*> plans;
		list<Parametrisation*> parametrisation;
	};

} /* namespace Alica */

#endif /* PLANTYPE_H_ */
