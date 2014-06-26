/**
 */
package de.uni_kassel.vs.cn.planDesigner.alica.provider;

import java.util.ArrayList;
import java.util.Collection;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.Notifier;
import org.eclipse.emf.edit.provider.ChangeNotifier;
import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.ComposedAdapterFactory;
import org.eclipse.emf.edit.provider.IChangeNotifier;
import org.eclipse.emf.edit.provider.IDisposable;
import org.eclipse.emf.edit.provider.IEditingDomainItemProvider;
import org.eclipse.emf.edit.provider.IItemLabelProvider;
import org.eclipse.emf.edit.provider.IItemPropertySource;
import org.eclipse.emf.edit.provider.INotifyChangedListener;
import org.eclipse.emf.edit.provider.IStructuredItemContentProvider;
import org.eclipse.emf.edit.provider.ITreeItemContentProvider;

import de.uni_kassel.vs.cn.planDesigner.alica.util.AlicaAdapterFactory;

/**
 * This is the factory that is used to provide the interfaces needed to support Viewers.
 * The adapters generated by this factory convert EMF adapter notifications into calls to {@link #fireNotifyChanged fireNotifyChanged}.
 * The adapters also support Eclipse property sheets.
 * Note that most of the adapters are shared among multiple instances.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class AlicaItemProviderAdapterFactory extends AlicaAdapterFactory implements ComposeableAdapterFactory, IChangeNotifier, IDisposable {
	/**
	 * This keeps track of the root adapter factory that delegates to this adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ComposedAdapterFactory parentAdapterFactory;

	/**
	 * This is used to implement {@link org.eclipse.emf.edit.provider.IChangeNotifier}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IChangeNotifier changeNotifier = new ChangeNotifier();

	/**
	 * This keeps track of all the supported types checked by {@link #isFactoryForType isFactoryForType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Collection<Object> supportedTypes = new ArrayList<Object>();

	/**
	 * This constructs an instance.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AlicaItemProviderAdapterFactory() {
		supportedTypes.add(IEditingDomainItemProvider.class);
		supportedTypes.add(IStructuredItemContentProvider.class);
		supportedTypes.add(ITreeItemContentProvider.class);
		supportedTypes.add(IItemLabelProvider.class);
		supportedTypes.add(IItemPropertySource.class);
	}

	/**
	 * This keeps track of the one adapter used for all {@link de.uni_kassel.vs.cn.planDesigner.alica.Transition} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TransitionItemProvider transitionItemProvider;

	/**
	 * This creates an adapter for a {@link de.uni_kassel.vs.cn.planDesigner.alica.Transition}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createTransitionAdapter() {
		if (transitionItemProvider == null) {
			transitionItemProvider = new TransitionItemProvider(this);
		}

		return transitionItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link de.uni_kassel.vs.cn.planDesigner.alica.PreCondition} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PreConditionItemProvider preConditionItemProvider;

	/**
	 * This creates an adapter for a {@link de.uni_kassel.vs.cn.planDesigner.alica.PreCondition}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createPreConditionAdapter() {
		if (preConditionItemProvider == null) {
			preConditionItemProvider = new PreConditionItemProvider(this);
		}

		return preConditionItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link de.uni_kassel.vs.cn.planDesigner.alica.EntryPoint} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EntryPointItemProvider entryPointItemProvider;

	/**
	 * This creates an adapter for a {@link de.uni_kassel.vs.cn.planDesigner.alica.EntryPoint}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createEntryPointAdapter() {
		if (entryPointItemProvider == null) {
			entryPointItemProvider = new EntryPointItemProvider(this);
		}

		return entryPointItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link de.uni_kassel.vs.cn.planDesigner.alica.SuccessState} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SuccessStateItemProvider successStateItemProvider;

	/**
	 * This creates an adapter for a {@link de.uni_kassel.vs.cn.planDesigner.alica.SuccessState}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createSuccessStateAdapter() {
		if (successStateItemProvider == null) {
			successStateItemProvider = new SuccessStateItemProvider(this);
		}

		return successStateItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link de.uni_kassel.vs.cn.planDesigner.alica.FailureState} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected FailureStateItemProvider failureStateItemProvider;

	/**
	 * This creates an adapter for a {@link de.uni_kassel.vs.cn.planDesigner.alica.FailureState}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createFailureStateAdapter() {
		if (failureStateItemProvider == null) {
			failureStateItemProvider = new FailureStateItemProvider(this);
		}

		return failureStateItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link de.uni_kassel.vs.cn.planDesigner.alica.Behaviour} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected BehaviourItemProvider behaviourItemProvider;

	/**
	 * This creates an adapter for a {@link de.uni_kassel.vs.cn.planDesigner.alica.Behaviour}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createBehaviourAdapter() {
		if (behaviourItemProvider == null) {
			behaviourItemProvider = new BehaviourItemProvider(this);
		}

		return behaviourItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link de.uni_kassel.vs.cn.planDesigner.alica.State} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected StateItemProvider stateItemProvider;

	/**
	 * This creates an adapter for a {@link de.uni_kassel.vs.cn.planDesigner.alica.State}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createStateAdapter() {
		if (stateItemProvider == null) {
			stateItemProvider = new StateItemProvider(this);
		}

		return stateItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link de.uni_kassel.vs.cn.planDesigner.alica.Plan} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PlanItemProvider planItemProvider;

	/**
	 * This creates an adapter for a {@link de.uni_kassel.vs.cn.planDesigner.alica.Plan}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createPlanAdapter() {
		if (planItemProvider == null) {
			planItemProvider = new PlanItemProvider(this);
		}

		return planItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link de.uni_kassel.vs.cn.planDesigner.alica.PlanType} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PlanTypeItemProvider planTypeItemProvider;

	/**
	 * This creates an adapter for a {@link de.uni_kassel.vs.cn.planDesigner.alica.PlanType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createPlanTypeAdapter() {
		if (planTypeItemProvider == null) {
			planTypeItemProvider = new PlanTypeItemProvider(this);
		}

		return planTypeItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link de.uni_kassel.vs.cn.planDesigner.alica.Rating} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RatingItemProvider ratingItemProvider;

	/**
	 * This creates an adapter for a {@link de.uni_kassel.vs.cn.planDesigner.alica.Rating}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createRatingAdapter() {
		if (ratingItemProvider == null) {
			ratingItemProvider = new RatingItemProvider(this);
		}

		return ratingItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link de.uni_kassel.vs.cn.planDesigner.alica.PostCondition} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PostConditionItemProvider postConditionItemProvider;

	/**
	 * This creates an adapter for a {@link de.uni_kassel.vs.cn.planDesigner.alica.PostCondition}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createPostConditionAdapter() {
		if (postConditionItemProvider == null) {
			postConditionItemProvider = new PostConditionItemProvider(this);
		}

		return postConditionItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link de.uni_kassel.vs.cn.planDesigner.alica.RuntimeCondition} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RuntimeConditionItemProvider runtimeConditionItemProvider;

	/**
	 * This creates an adapter for a {@link de.uni_kassel.vs.cn.planDesigner.alica.RuntimeCondition}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createRuntimeConditionAdapter() {
		if (runtimeConditionItemProvider == null) {
			runtimeConditionItemProvider = new RuntimeConditionItemProvider(this);
		}

		return runtimeConditionItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link de.uni_kassel.vs.cn.planDesigner.alica.Task} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TaskItemProvider taskItemProvider;

	/**
	 * This creates an adapter for a {@link de.uni_kassel.vs.cn.planDesigner.alica.Task}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createTaskAdapter() {
		if (taskItemProvider == null) {
			taskItemProvider = new TaskItemProvider(this);
		}

		return taskItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link java.util.Map.Entry} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EStringToEStringMapEntryItemProvider eStringToEStringMapEntryItemProvider;

	/**
	 * This creates an adapter for a {@link java.util.Map.Entry}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createEStringToEStringMapEntryAdapter() {
		if (eStringToEStringMapEntryItemProvider == null) {
			eStringToEStringMapEntryItemProvider = new EStringToEStringMapEntryItemProvider(this);
		}

		return eStringToEStringMapEntryItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link de.uni_kassel.vs.cn.planDesigner.alica.BehaviourConfiguration} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected BehaviourConfigurationItemProvider behaviourConfigurationItemProvider;

	/**
	 * This creates an adapter for a {@link de.uni_kassel.vs.cn.planDesigner.alica.BehaviourConfiguration}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createBehaviourConfigurationAdapter() {
		if (behaviourConfigurationItemProvider == null) {
			behaviourConfigurationItemProvider = new BehaviourConfigurationItemProvider(this);
		}

		return behaviourConfigurationItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link de.uni_kassel.vs.cn.planDesigner.alica.Role} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RoleItemProvider roleItemProvider;

	/**
	 * This creates an adapter for a {@link de.uni_kassel.vs.cn.planDesigner.alica.Role}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createRoleAdapter() {
		if (roleItemProvider == null) {
			roleItemProvider = new RoleItemProvider(this);
		}

		return roleItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link de.uni_kassel.vs.cn.planDesigner.alica.RoleSet} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RoleSetItemProvider roleSetItemProvider;

	/**
	 * This creates an adapter for a {@link de.uni_kassel.vs.cn.planDesigner.alica.RoleSet}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createRoleSetAdapter() {
		if (roleSetItemProvider == null) {
			roleSetItemProvider = new RoleSetItemProvider(this);
		}

		return roleSetItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link java.util.Map.Entry} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ELongToDoubleMapEntryItemProvider eLongToDoubleMapEntryItemProvider;

	/**
	 * This creates an adapter for a {@link java.util.Map.Entry}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createELongToDoubleMapEntryAdapter() {
		if (eLongToDoubleMapEntryItemProvider == null) {
			eLongToDoubleMapEntryItemProvider = new ELongToDoubleMapEntryItemProvider(this);
		}

		return eLongToDoubleMapEntryItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link de.uni_kassel.vs.cn.planDesigner.alica.RoleDefinitionSet} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RoleDefinitionSetItemProvider roleDefinitionSetItemProvider;

	/**
	 * This creates an adapter for a {@link de.uni_kassel.vs.cn.planDesigner.alica.RoleDefinitionSet}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createRoleDefinitionSetAdapter() {
		if (roleDefinitionSetItemProvider == null) {
			roleDefinitionSetItemProvider = new RoleDefinitionSetItemProvider(this);
		}

		return roleDefinitionSetItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link de.uni_kassel.vs.cn.planDesigner.alica.RoleTaskMapping} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RoleTaskMappingItemProvider roleTaskMappingItemProvider;

	/**
	 * This creates an adapter for a {@link de.uni_kassel.vs.cn.planDesigner.alica.RoleTaskMapping}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createRoleTaskMappingAdapter() {
		if (roleTaskMappingItemProvider == null) {
			roleTaskMappingItemProvider = new RoleTaskMappingItemProvider(this);
		}

		return roleTaskMappingItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link de.uni_kassel.vs.cn.planDesigner.alica.Characteristic} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CharacteristicItemProvider characteristicItemProvider;

	/**
	 * This creates an adapter for a {@link de.uni_kassel.vs.cn.planDesigner.alica.Characteristic}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createCharacteristicAdapter() {
		if (characteristicItemProvider == null) {
			characteristicItemProvider = new CharacteristicItemProvider(this);
		}

		return characteristicItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link de.uni_kassel.vs.cn.planDesigner.alica.TaskGraph} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TaskGraphItemProvider taskGraphItemProvider;

	/**
	 * This creates an adapter for a {@link de.uni_kassel.vs.cn.planDesigner.alica.TaskGraph}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createTaskGraphAdapter() {
		if (taskGraphItemProvider == null) {
			taskGraphItemProvider = new TaskGraphItemProvider(this);
		}

		return taskGraphItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link de.uni_kassel.vs.cn.planDesigner.alica.Edge} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EdgeItemProvider edgeItemProvider;

	/**
	 * This creates an adapter for a {@link de.uni_kassel.vs.cn.planDesigner.alica.Edge}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createEdgeAdapter() {
		if (edgeItemProvider == null) {
			edgeItemProvider = new EdgeItemProvider(this);
		}

		return edgeItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link de.uni_kassel.vs.cn.planDesigner.alica.TaskWrapper} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TaskWrapperItemProvider taskWrapperItemProvider;

	/**
	 * This creates an adapter for a {@link de.uni_kassel.vs.cn.planDesigner.alica.TaskWrapper}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createTaskWrapperAdapter() {
		if (taskWrapperItemProvider == null) {
			taskWrapperItemProvider = new TaskWrapperItemProvider(this);
		}

		return taskWrapperItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link de.uni_kassel.vs.cn.planDesigner.alica.InternalRoleTaskMapping} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected InternalRoleTaskMappingItemProvider internalRoleTaskMappingItemProvider;

	/**
	 * This creates an adapter for a {@link de.uni_kassel.vs.cn.planDesigner.alica.InternalRoleTaskMapping}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createInternalRoleTaskMappingAdapter() {
		if (internalRoleTaskMappingItemProvider == null) {
			internalRoleTaskMappingItemProvider = new InternalRoleTaskMappingItemProvider(this);
		}

		return internalRoleTaskMappingItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link de.uni_kassel.vs.cn.planDesigner.alica.Node} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected NodeItemProvider nodeItemProvider;

	/**
	 * This creates an adapter for a {@link de.uni_kassel.vs.cn.planDesigner.alica.Node}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createNodeAdapter() {
		if (nodeItemProvider == null) {
			nodeItemProvider = new NodeItemProvider(this);
		}

		return nodeItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link de.uni_kassel.vs.cn.planDesigner.alica.TaskRepository} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TaskRepositoryItemProvider taskRepositoryItemProvider;

	/**
	 * This creates an adapter for a {@link de.uni_kassel.vs.cn.planDesigner.alica.TaskRepository}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createTaskRepositoryAdapter() {
		if (taskRepositoryItemProvider == null) {
			taskRepositoryItemProvider = new TaskRepositoryItemProvider(this);
		}

		return taskRepositoryItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link de.uni_kassel.vs.cn.planDesigner.alica.Synchronisation} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SynchronisationItemProvider synchronisationItemProvider;

	/**
	 * This creates an adapter for a {@link de.uni_kassel.vs.cn.planDesigner.alica.Synchronisation}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createSynchronisationAdapter() {
		if (synchronisationItemProvider == null) {
			synchronisationItemProvider = new SynchronisationItemProvider(this);
		}

		return synchronisationItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link de.uni_kassel.vs.cn.planDesigner.alica.Variable} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected VariableItemProvider variableItemProvider;

	/**
	 * This creates an adapter for a {@link de.uni_kassel.vs.cn.planDesigner.alica.Variable}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createVariableAdapter() {
		if (variableItemProvider == null) {
			variableItemProvider = new VariableItemProvider(this);
		}

		return variableItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link de.uni_kassel.vs.cn.planDesigner.alica.Parametrisation} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ParametrisationItemProvider parametrisationItemProvider;

	/**
	 * This creates an adapter for a {@link de.uni_kassel.vs.cn.planDesigner.alica.Parametrisation}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createParametrisationAdapter() {
		if (parametrisationItemProvider == null) {
			parametrisationItemProvider = new ParametrisationItemProvider(this);
		}

		return parametrisationItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link de.uni_kassel.vs.cn.planDesigner.alica.AnnotatedPlan} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AnnotatedPlanItemProvider annotatedPlanItemProvider;

	/**
	 * This creates an adapter for a {@link de.uni_kassel.vs.cn.planDesigner.alica.AnnotatedPlan}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createAnnotatedPlanAdapter() {
		if (annotatedPlanItemProvider == null) {
			annotatedPlanItemProvider = new AnnotatedPlanItemProvider(this);
		}

		return annotatedPlanItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link de.uni_kassel.vs.cn.planDesigner.alica.ForallAgents} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ForallAgentsItemProvider forallAgentsItemProvider;

	/**
	 * This creates an adapter for a {@link de.uni_kassel.vs.cn.planDesigner.alica.ForallAgents}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createForallAgentsAdapter() {
		if (forallAgentsItemProvider == null) {
			forallAgentsItemProvider = new ForallAgentsItemProvider(this);
		}

		return forallAgentsItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link de.uni_kassel.vs.cn.planDesigner.alica.Capability} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CapabilityItemProvider capabilityItemProvider;

	/**
	 * This creates an adapter for a {@link de.uni_kassel.vs.cn.planDesigner.alica.Capability}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createCapabilityAdapter() {
		if (capabilityItemProvider == null) {
			capabilityItemProvider = new CapabilityItemProvider(this);
		}

		return capabilityItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link de.uni_kassel.vs.cn.planDesigner.alica.CapValue} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CapValueItemProvider capValueItemProvider;

	/**
	 * This creates an adapter for a {@link de.uni_kassel.vs.cn.planDesigner.alica.CapValue}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createCapValueAdapter() {
		if (capValueItemProvider == null) {
			capValueItemProvider = new CapValueItemProvider(this);
		}

		return capValueItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link de.uni_kassel.vs.cn.planDesigner.alica.CapabilityDefinitionSet} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CapabilityDefinitionSetItemProvider capabilityDefinitionSetItemProvider;

	/**
	 * This creates an adapter for a {@link de.uni_kassel.vs.cn.planDesigner.alica.CapabilityDefinitionSet}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createCapabilityDefinitionSetAdapter() {
		if (capabilityDefinitionSetItemProvider == null) {
			capabilityDefinitionSetItemProvider = new CapabilityDefinitionSetItemProvider(this);
		}

		return capabilityDefinitionSetItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link de.uni_kassel.vs.cn.planDesigner.alica.PlanningProblem} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PlanningProblemItemProvider planningProblemItemProvider;

	/**
	 * This creates an adapter for a {@link de.uni_kassel.vs.cn.planDesigner.alica.PlanningProblem}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createPlanningProblemAdapter() {
		if (planningProblemItemProvider == null) {
			planningProblemItemProvider = new PlanningProblemItemProvider(this);
		}

		return planningProblemItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link de.uni_kassel.vs.cn.planDesigner.alica.Planner} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PlannerItemProvider plannerItemProvider;

	/**
	 * This creates an adapter for a {@link de.uni_kassel.vs.cn.planDesigner.alica.Planner}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createPlannerAdapter() {
		if (plannerItemProvider == null) {
			plannerItemProvider = new PlannerItemProvider(this);
		}

		return plannerItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link de.uni_kassel.vs.cn.planDesigner.alica.Fluent} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected FluentItemProvider fluentItemProvider;

	/**
	 * This creates an adapter for a {@link de.uni_kassel.vs.cn.planDesigner.alica.Fluent}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createFluentAdapter() {
		if (fluentItemProvider == null) {
			fluentItemProvider = new FluentItemProvider(this);
		}

		return fluentItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link de.uni_kassel.vs.cn.planDesigner.alica.DomainDescription} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DomainDescriptionItemProvider domainDescriptionItemProvider;

	/**
	 * This creates an adapter for a {@link de.uni_kassel.vs.cn.planDesigner.alica.DomainDescription}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createDomainDescriptionAdapter() {
		if (domainDescriptionItemProvider == null) {
			domainDescriptionItemProvider = new DomainDescriptionItemProvider(this);
		}

		return domainDescriptionItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link de.uni_kassel.vs.cn.planDesigner.alica.Planners} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PlannersItemProvider plannersItemProvider;

	/**
	 * This creates an adapter for a {@link de.uni_kassel.vs.cn.planDesigner.alica.Planners}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createPlannersAdapter() {
		if (plannersItemProvider == null) {
			plannersItemProvider = new PlannersItemProvider(this);
		}

		return plannersItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link java.util.Map.Entry} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EStringToEObjectMapEntryItemProvider eStringToEObjectMapEntryItemProvider;

	/**
	 * This creates an adapter for a {@link java.util.Map.Entry}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createEStringToEObjectMapEntryAdapter() {
		if (eStringToEObjectMapEntryItemProvider == null) {
			eStringToEObjectMapEntryItemProvider = new EStringToEObjectMapEntryItemProvider(this);
		}

		return eStringToEObjectMapEntryItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link de.uni_kassel.vs.cn.planDesigner.alica.FluentParameters} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected FluentParametersItemProvider fluentParametersItemProvider;

	/**
	 * This creates an adapter for a {@link de.uni_kassel.vs.cn.planDesigner.alica.FluentParameters}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createFluentParametersAdapter() {
		if (fluentParametersItemProvider == null) {
			fluentParametersItemProvider = new FluentParametersItemProvider(this);
		}

		return fluentParametersItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link de.uni_kassel.vs.cn.planDesigner.alica.Constant} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ConstantItemProvider constantItemProvider;

	/**
	 * This creates an adapter for a {@link de.uni_kassel.vs.cn.planDesigner.alica.Constant}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createConstantAdapter() {
		if (constantItemProvider == null) {
			constantItemProvider = new ConstantItemProvider(this);
		}

		return constantItemProvider;
	}

	/**
	 * This returns the root adapter factory that contains this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ComposeableAdapterFactory getRootAdapterFactory() {
		return parentAdapterFactory == null ? this : parentAdapterFactory.getRootAdapterFactory();
	}

	/**
	 * This sets the composed adapter factory that contains this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setParentAdapterFactory(ComposedAdapterFactory parentAdapterFactory) {
		this.parentAdapterFactory = parentAdapterFactory;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object type) {
		return supportedTypes.contains(type) || super.isFactoryForType(type);
	}

	/**
	 * This implementation substitutes the factory itself as the key for the adapter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter adapt(Notifier notifier, Object type) {
		return super.adapt(notifier, this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object adapt(Object object, Object type) {
		if (isFactoryForType(type)) {
			Object adapter = super.adapt(object, type);
			if (!(type instanceof Class<?>) || (((Class<?>)type).isInstance(adapter))) {
				return adapter;
			}
		}

		return null;
	}

	/**
	 * This adds a listener.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void addListener(INotifyChangedListener notifyChangedListener) {
		changeNotifier.addListener(notifyChangedListener);
	}

	/**
	 * This removes a listener.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void removeListener(INotifyChangedListener notifyChangedListener) {
		changeNotifier.removeListener(notifyChangedListener);
	}

	/**
	 * This delegates to {@link #changeNotifier} and to {@link #parentAdapterFactory}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void fireNotifyChanged(Notification notification) {
		changeNotifier.fireNotifyChanged(notification);

		if (parentAdapterFactory != null) {
			parentAdapterFactory.fireNotifyChanged(notification);
		}
	}

	/**
	 * This disposes all of the item providers created by this factory. 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void dispose() {
		if (transitionItemProvider != null) transitionItemProvider.dispose();
		if (preConditionItemProvider != null) preConditionItemProvider.dispose();
		if (entryPointItemProvider != null) entryPointItemProvider.dispose();
		if (successStateItemProvider != null) successStateItemProvider.dispose();
		if (failureStateItemProvider != null) failureStateItemProvider.dispose();
		if (behaviourItemProvider != null) behaviourItemProvider.dispose();
		if (stateItemProvider != null) stateItemProvider.dispose();
		if (planItemProvider != null) planItemProvider.dispose();
		if (planTypeItemProvider != null) planTypeItemProvider.dispose();
		if (ratingItemProvider != null) ratingItemProvider.dispose();
		if (postConditionItemProvider != null) postConditionItemProvider.dispose();
		if (runtimeConditionItemProvider != null) runtimeConditionItemProvider.dispose();
		if (taskItemProvider != null) taskItemProvider.dispose();
		if (eStringToEStringMapEntryItemProvider != null) eStringToEStringMapEntryItemProvider.dispose();
		if (behaviourConfigurationItemProvider != null) behaviourConfigurationItemProvider.dispose();
		if (roleItemProvider != null) roleItemProvider.dispose();
		if (roleSetItemProvider != null) roleSetItemProvider.dispose();
		if (eLongToDoubleMapEntryItemProvider != null) eLongToDoubleMapEntryItemProvider.dispose();
		if (roleDefinitionSetItemProvider != null) roleDefinitionSetItemProvider.dispose();
		if (roleTaskMappingItemProvider != null) roleTaskMappingItemProvider.dispose();
		if (characteristicItemProvider != null) characteristicItemProvider.dispose();
		if (taskGraphItemProvider != null) taskGraphItemProvider.dispose();
		if (edgeItemProvider != null) edgeItemProvider.dispose();
		if (taskWrapperItemProvider != null) taskWrapperItemProvider.dispose();
		if (internalRoleTaskMappingItemProvider != null) internalRoleTaskMappingItemProvider.dispose();
		if (nodeItemProvider != null) nodeItemProvider.dispose();
		if (taskRepositoryItemProvider != null) taskRepositoryItemProvider.dispose();
		if (synchronisationItemProvider != null) synchronisationItemProvider.dispose();
		if (variableItemProvider != null) variableItemProvider.dispose();
		if (parametrisationItemProvider != null) parametrisationItemProvider.dispose();
		if (annotatedPlanItemProvider != null) annotatedPlanItemProvider.dispose();
		if (forallAgentsItemProvider != null) forallAgentsItemProvider.dispose();
		if (capabilityItemProvider != null) capabilityItemProvider.dispose();
		if (capValueItemProvider != null) capValueItemProvider.dispose();
		if (capabilityDefinitionSetItemProvider != null) capabilityDefinitionSetItemProvider.dispose();
		if (planningProblemItemProvider != null) planningProblemItemProvider.dispose();
		if (plannerItemProvider != null) plannerItemProvider.dispose();
		if (fluentItemProvider != null) fluentItemProvider.dispose();
		if (domainDescriptionItemProvider != null) domainDescriptionItemProvider.dispose();
		if (plannersItemProvider != null) plannersItemProvider.dispose();
		if (eStringToEObjectMapEntryItemProvider != null) eStringToEObjectMapEntryItemProvider.dispose();
		if (fluentParametersItemProvider != null) fluentParametersItemProvider.dispose();
		if (constantItemProvider != null) constantItemProvider.dispose();
	}

}