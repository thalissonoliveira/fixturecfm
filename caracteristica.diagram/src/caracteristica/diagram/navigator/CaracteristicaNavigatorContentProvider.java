/*
 * 
 */
package caracteristica.diagram.navigator;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.edit.domain.AdapterFactoryEditingDomain;
import org.eclipse.emf.transaction.TransactionalEditingDomain;
import org.eclipse.emf.workspace.util.WorkspaceSynchronizer;
import org.eclipse.gmf.runtime.emf.core.GMFEditingDomainFactory;
import org.eclipse.gmf.runtime.notation.Diagram;
import org.eclipse.gmf.runtime.notation.Edge;
import org.eclipse.gmf.runtime.notation.Node;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.jface.viewers.Viewer;
import org.eclipse.ui.IMemento;
import org.eclipse.ui.navigator.ICommonContentExtensionSite;
import org.eclipse.ui.navigator.ICommonContentProvider;

import caracteristica.diagram.edit.parts.AtributoEditPart;
import caracteristica.diagram.edit.parts.CaracteristicaAgrupadaEditPart;
import caracteristica.diagram.edit.parts.CaracteristicaAtributoEditPart;
import caracteristica.diagram.edit.parts.CaracteristicaCaracteristicaFilhaEditPart;
import caracteristica.diagram.edit.parts.CaracteristicaElementosExternosEditPart;
import caracteristica.diagram.edit.parts.CaracteristicaMandatoriaEditPart;
import caracteristica.diagram.edit.parts.CaracteristicaOpcionalEditPart;
import caracteristica.diagram.edit.parts.CaracteristicaRaizEditPart;
import caracteristica.diagram.edit.parts.CaracteristicaVariacoesEditPart;
import caracteristica.diagram.edit.parts.LPSEditPart;
import caracteristica.diagram.edit.parts.VariacaoDoisEditPart;
import caracteristica.diagram.edit.parts.VariacaoVariantesEditPart;
import caracteristica.diagram.part.CaracteristicaVisualIDRegistry;
import caracteristica.diagram.part.Messages;

/**
 * @generated
 */
public class CaracteristicaNavigatorContentProvider implements ICommonContentProvider {

	/**
	 * @generated
	 */
	private static final Object[] EMPTY_ARRAY = new Object[0];

	/**
	 * @generated
	 */
	private Viewer myViewer;

	/**
	 * @generated
	 */
	private AdapterFactoryEditingDomain myEditingDomain;

	/**
	 * @generated
	 */
	private WorkspaceSynchronizer myWorkspaceSynchronizer;

	/**
	 * @generated
	 */
	private Runnable myViewerRefreshRunnable;

	/**
	 * @generated
	 */
	@SuppressWarnings({ "unchecked", "serial", "rawtypes" })
	public CaracteristicaNavigatorContentProvider() {
		TransactionalEditingDomain editingDomain = GMFEditingDomainFactory.INSTANCE.createEditingDomain();
		myEditingDomain = (AdapterFactoryEditingDomain) editingDomain;
		myEditingDomain.setResourceToReadOnlyMap(new HashMap() {
			public Object get(Object key) {
				if (!containsKey(key)) {
					put(key, Boolean.TRUE);
				}
				return super.get(key);
			}
		});
		myViewerRefreshRunnable = new Runnable() {
			public void run() {
				if (myViewer != null) {
					myViewer.refresh();
				}
			}
		};
		myWorkspaceSynchronizer = new WorkspaceSynchronizer(editingDomain, new WorkspaceSynchronizer.Delegate() {
			public void dispose() {
			}

			public boolean handleResourceChanged(final Resource resource) {
				unloadAllResources();
				asyncRefresh();
				return true;
			}

			public boolean handleResourceDeleted(Resource resource) {
				unloadAllResources();
				asyncRefresh();
				return true;
			}

			public boolean handleResourceMoved(Resource resource, final URI newURI) {
				unloadAllResources();
				asyncRefresh();
				return true;
			}
		});
	}

	/**
	 * @generated
	 */
	public void dispose() {
		myWorkspaceSynchronizer.dispose();
		myWorkspaceSynchronizer = null;
		myViewerRefreshRunnable = null;
		myViewer = null;
		unloadAllResources();
		((TransactionalEditingDomain) myEditingDomain).dispose();
		myEditingDomain = null;
	}

	/**
	 * @generated
	 */
	public void inputChanged(Viewer viewer, Object oldInput, Object newInput) {
		myViewer = viewer;
	}

	/**
	 * @generated
	 */
	void unloadAllResources() {
		for (Resource nextResource : myEditingDomain.getResourceSet().getResources()) {
			nextResource.unload();
		}
	}

	/**
	 * @generated
	 */
	void asyncRefresh() {
		if (myViewer != null && !myViewer.getControl().isDisposed()) {
			myViewer.getControl().getDisplay().asyncExec(myViewerRefreshRunnable);
		}
	}

	/**
	 * @generated
	 */
	public Object[] getElements(Object inputElement) {
		return getChildren(inputElement);
	}

	/**
	 * @generated
	 */
	public void restoreState(IMemento aMemento) {
	}

	/**
	 * @generated
	 */
	public void saveState(IMemento aMemento) {
	}

	/**
	 * @generated
	 */
	public void init(ICommonContentExtensionSite aConfig) {
	}

	/**
	 * @generated
	 */
	public Object[] getChildren(Object parentElement) {
		if (parentElement instanceof IFile) {
			IFile file = (IFile) parentElement;
			URI fileURI = URI.createPlatformResourceURI(file.getFullPath().toString(), true);
			Resource resource = myEditingDomain.getResourceSet().getResource(fileURI, true);
			ArrayList<CaracteristicaNavigatorItem> result = new ArrayList<CaracteristicaNavigatorItem>();
			ArrayList<View> topViews = new ArrayList<View>(resource.getContents().size());
			for (EObject o : resource.getContents()) {
				if (o instanceof View) {
					topViews.add((View) o);
				}
			}
			result.addAll(createNavigatorItems(selectViewsByType(topViews, LPSEditPart.MODEL_ID), file, false));
			return result.toArray();
		}

		if (parentElement instanceof CaracteristicaNavigatorGroup) {
			CaracteristicaNavigatorGroup group = (CaracteristicaNavigatorGroup) parentElement;
			return group.getChildren();
		}

		if (parentElement instanceof CaracteristicaNavigatorItem) {
			CaracteristicaNavigatorItem navigatorItem = (CaracteristicaNavigatorItem) parentElement;
			if (navigatorItem.isLeaf() || !isOwnView(navigatorItem.getView())) {
				return EMPTY_ARRAY;
			}
			return getViewChildren(navigatorItem.getView(), parentElement);
		}

		/*
		* Due to plugin.xml restrictions this code will be called only for views representing
		* shortcuts to this diagram elements created on other diagrams. 
		*/
		if (parentElement instanceof IAdaptable) {
			View view = (View) ((IAdaptable) parentElement).getAdapter(View.class);
			if (view != null) {
				return getViewChildren(view, parentElement);
			}
		}

		return EMPTY_ARRAY;
	}

	/**
	 * @generated
	 */
	private Object[] getViewChildren(View view, Object parentElement) {
		switch (CaracteristicaVisualIDRegistry.getVisualID(view)) {

		case LPSEditPart.VISUAL_ID: {
			LinkedList<CaracteristicaAbstractNavigatorItem> result = new LinkedList<CaracteristicaAbstractNavigatorItem>();
			result.addAll(getForeignShortcuts((Diagram) view, parentElement));
			Diagram sv = (Diagram) view;
			CaracteristicaNavigatorGroup links = new CaracteristicaNavigatorGroup(
					Messages.NavigatorGroupName_LPS_1000_links, "icons/linksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getChildrenByType(Collections.singleton(sv),
					CaracteristicaVisualIDRegistry.getType(CaracteristicaOpcionalEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					CaracteristicaVisualIDRegistry.getType(CaracteristicaAgrupadaEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					CaracteristicaVisualIDRegistry.getType(VariacaoDoisEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					CaracteristicaVisualIDRegistry.getType(CaracteristicaRaizEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					CaracteristicaVisualIDRegistry.getType(CaracteristicaMandatoriaEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					CaracteristicaVisualIDRegistry.getType(AtributoEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getDiagramLinksByType(Collections.singleton(sv),
					CaracteristicaVisualIDRegistry.getType(CaracteristicaCaracteristicaFilhaEditPart.VISUAL_ID));
			links.addChildren(createNavigatorItems(connectedViews, links, false));
			connectedViews = getDiagramLinksByType(Collections.singleton(sv),
					CaracteristicaVisualIDRegistry.getType(CaracteristicaVariacoesEditPart.VISUAL_ID));
			links.addChildren(createNavigatorItems(connectedViews, links, false));
			connectedViews = getDiagramLinksByType(Collections.singleton(sv),
					CaracteristicaVisualIDRegistry.getType(CaracteristicaAtributoEditPart.VISUAL_ID));
			links.addChildren(createNavigatorItems(connectedViews, links, false));
			connectedViews = getDiagramLinksByType(Collections.singleton(sv),
					CaracteristicaVisualIDRegistry.getType(VariacaoVariantesEditPart.VISUAL_ID));
			links.addChildren(createNavigatorItems(connectedViews, links, false));
			if (!links.isEmpty()) {
				result.add(links);
			}
			return result.toArray();
		}

		case CaracteristicaOpcionalEditPart.VISUAL_ID: {
			LinkedList<CaracteristicaAbstractNavigatorItem> result = new LinkedList<CaracteristicaAbstractNavigatorItem>();
			Node sv = (Node) view;
			CaracteristicaNavigatorGroup incominglinks = new CaracteristicaNavigatorGroup(
					Messages.NavigatorGroupName_CaracteristicaOpcional_2001_incominglinks,
					"icons/incomingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			CaracteristicaNavigatorGroup outgoinglinks = new CaracteristicaNavigatorGroup(
					Messages.NavigatorGroupName_CaracteristicaOpcional_2001_outgoinglinks,
					"icons/outgoingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					CaracteristicaVisualIDRegistry.getType(CaracteristicaCaracteristicaFilhaEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews, incominglinks, true));
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					CaracteristicaVisualIDRegistry.getType(CaracteristicaCaracteristicaFilhaEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews, outgoinglinks, true));
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					CaracteristicaVisualIDRegistry.getType(CaracteristicaVariacoesEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews, outgoinglinks, true));
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					CaracteristicaVisualIDRegistry.getType(CaracteristicaAtributoEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews, outgoinglinks, true));
			if (!incominglinks.isEmpty()) {
				result.add(incominglinks);
			}
			if (!outgoinglinks.isEmpty()) {
				result.add(outgoinglinks);
			}
			return result.toArray();
		}

		case VariacaoDoisEditPart.VISUAL_ID: {
			LinkedList<CaracteristicaAbstractNavigatorItem> result = new LinkedList<CaracteristicaAbstractNavigatorItem>();
			Node sv = (Node) view;
			CaracteristicaNavigatorGroup incominglinks = new CaracteristicaNavigatorGroup(
					Messages.NavigatorGroupName_VariacaoDois_2002_incominglinks,
					"icons/incomingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			CaracteristicaNavigatorGroup outgoinglinks = new CaracteristicaNavigatorGroup(
					Messages.NavigatorGroupName_VariacaoDois_2002_outgoinglinks,
					"icons/outgoingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					CaracteristicaVisualIDRegistry.getType(CaracteristicaCaracteristicaFilhaEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews, incominglinks, true));
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					CaracteristicaVisualIDRegistry.getType(CaracteristicaCaracteristicaFilhaEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews, outgoinglinks, true));
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					CaracteristicaVisualIDRegistry.getType(CaracteristicaVariacoesEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews, outgoinglinks, true));
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					CaracteristicaVisualIDRegistry.getType(CaracteristicaAtributoEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews, outgoinglinks, true));
			if (!incominglinks.isEmpty()) {
				result.add(incominglinks);
			}
			if (!outgoinglinks.isEmpty()) {
				result.add(outgoinglinks);
			}
			return result.toArray();
		}

		case CaracteristicaRaizEditPart.VISUAL_ID: {
			LinkedList<CaracteristicaAbstractNavigatorItem> result = new LinkedList<CaracteristicaAbstractNavigatorItem>();
			Node sv = (Node) view;
			CaracteristicaNavigatorGroup incominglinks = new CaracteristicaNavigatorGroup(
					Messages.NavigatorGroupName_CaracteristicaRaiz_2003_incominglinks,
					"icons/incomingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			CaracteristicaNavigatorGroup outgoinglinks = new CaracteristicaNavigatorGroup(
					Messages.NavigatorGroupName_CaracteristicaRaiz_2003_outgoinglinks,
					"icons/outgoingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					CaracteristicaVisualIDRegistry.getType(CaracteristicaCaracteristicaFilhaEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews, incominglinks, true));
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					CaracteristicaVisualIDRegistry.getType(CaracteristicaCaracteristicaFilhaEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews, outgoinglinks, true));
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					CaracteristicaVisualIDRegistry.getType(CaracteristicaVariacoesEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews, outgoinglinks, true));
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					CaracteristicaVisualIDRegistry.getType(CaracteristicaAtributoEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews, outgoinglinks, true));
			if (!incominglinks.isEmpty()) {
				result.add(incominglinks);
			}
			if (!outgoinglinks.isEmpty()) {
				result.add(outgoinglinks);
			}
			return result.toArray();
		}

		case CaracteristicaMandatoriaEditPart.VISUAL_ID: {
			LinkedList<CaracteristicaAbstractNavigatorItem> result = new LinkedList<CaracteristicaAbstractNavigatorItem>();
			Node sv = (Node) view;
			CaracteristicaNavigatorGroup incominglinks = new CaracteristicaNavigatorGroup(
					Messages.NavigatorGroupName_CaracteristicaMandatoria_2004_incominglinks,
					"icons/incomingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			CaracteristicaNavigatorGroup outgoinglinks = new CaracteristicaNavigatorGroup(
					Messages.NavigatorGroupName_CaracteristicaMandatoria_2004_outgoinglinks,
					"icons/outgoingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					CaracteristicaVisualIDRegistry.getType(CaracteristicaCaracteristicaFilhaEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews, incominglinks, true));
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					CaracteristicaVisualIDRegistry.getType(CaracteristicaCaracteristicaFilhaEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews, outgoinglinks, true));
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					CaracteristicaVisualIDRegistry.getType(CaracteristicaVariacoesEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews, outgoinglinks, true));
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					CaracteristicaVisualIDRegistry.getType(CaracteristicaAtributoEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews, outgoinglinks, true));
			if (!incominglinks.isEmpty()) {
				result.add(incominglinks);
			}
			if (!outgoinglinks.isEmpty()) {
				result.add(outgoinglinks);
			}
			return result.toArray();
		}

		case AtributoEditPart.VISUAL_ID: {
			LinkedList<CaracteristicaAbstractNavigatorItem> result = new LinkedList<CaracteristicaAbstractNavigatorItem>();
			Node sv = (Node) view;
			CaracteristicaNavigatorGroup incominglinks = new CaracteristicaNavigatorGroup(
					Messages.NavigatorGroupName_Atributo_2017_incominglinks, "icons/incomingLinksNavigatorGroup.gif", //$NON-NLS-1$
					parentElement);
			Collection<View> connectedViews;
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					CaracteristicaVisualIDRegistry.getType(CaracteristicaAtributoEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews, incominglinks, true));
			if (!incominglinks.isEmpty()) {
				result.add(incominglinks);
			}
			return result.toArray();
		}

		case CaracteristicaAgrupadaEditPart.VISUAL_ID: {
			LinkedList<CaracteristicaAbstractNavigatorItem> result = new LinkedList<CaracteristicaAbstractNavigatorItem>();
			Node sv = (Node) view;
			CaracteristicaNavigatorGroup incominglinks = new CaracteristicaNavigatorGroup(
					Messages.NavigatorGroupName_CaracteristicaAgrupada_2033_incominglinks,
					"icons/incomingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			CaracteristicaNavigatorGroup outgoinglinks = new CaracteristicaNavigatorGroup(
					Messages.NavigatorGroupName_CaracteristicaAgrupada_2033_outgoinglinks,
					"icons/outgoingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					CaracteristicaVisualIDRegistry.getType(CaracteristicaCaracteristicaFilhaEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews, incominglinks, true));
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					CaracteristicaVisualIDRegistry.getType(CaracteristicaCaracteristicaFilhaEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews, outgoinglinks, true));
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					CaracteristicaVisualIDRegistry.getType(CaracteristicaVariacoesEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews, outgoinglinks, true));
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					CaracteristicaVisualIDRegistry.getType(CaracteristicaAtributoEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews, outgoinglinks, true));
			if (!incominglinks.isEmpty()) {
				result.add(incominglinks);
			}
			if (!outgoinglinks.isEmpty()) {
				result.add(outgoinglinks);
			}
			return result.toArray();
		}

		case CaracteristicaCaracteristicaFilhaEditPart.VISUAL_ID: {
			LinkedList<CaracteristicaAbstractNavigatorItem> result = new LinkedList<CaracteristicaAbstractNavigatorItem>();
			Edge sv = (Edge) view;
			CaracteristicaNavigatorGroup target = new CaracteristicaNavigatorGroup(
					Messages.NavigatorGroupName_CaracteristicaCaracteristicaFilha_4002_target,
					"icons/linkTargetNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			CaracteristicaNavigatorGroup source = new CaracteristicaNavigatorGroup(
					Messages.NavigatorGroupName_CaracteristicaCaracteristicaFilha_4002_source,
					"icons/linkSourceNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					CaracteristicaVisualIDRegistry.getType(CaracteristicaOpcionalEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target, true));
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					CaracteristicaVisualIDRegistry.getType(CaracteristicaAgrupadaEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target, true));
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					CaracteristicaVisualIDRegistry.getType(VariacaoDoisEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target, true));
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					CaracteristicaVisualIDRegistry.getType(CaracteristicaRaizEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target, true));
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					CaracteristicaVisualIDRegistry.getType(CaracteristicaMandatoriaEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target, true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					CaracteristicaVisualIDRegistry.getType(CaracteristicaOpcionalEditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source, true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					CaracteristicaVisualIDRegistry.getType(CaracteristicaAgrupadaEditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source, true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					CaracteristicaVisualIDRegistry.getType(VariacaoDoisEditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source, true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					CaracteristicaVisualIDRegistry.getType(CaracteristicaRaizEditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source, true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					CaracteristicaVisualIDRegistry.getType(CaracteristicaMandatoriaEditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source, true));
			if (!target.isEmpty()) {
				result.add(target);
			}
			if (!source.isEmpty()) {
				result.add(source);
			}
			return result.toArray();
		}

		case CaracteristicaVariacoesEditPart.VISUAL_ID: {
			LinkedList<CaracteristicaAbstractNavigatorItem> result = new LinkedList<CaracteristicaAbstractNavigatorItem>();
			Edge sv = (Edge) view;
			CaracteristicaNavigatorGroup source = new CaracteristicaNavigatorGroup(
					Messages.NavigatorGroupName_CaracteristicaVariacoes_4003_source,
					"icons/linkSourceNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					CaracteristicaVisualIDRegistry.getType(CaracteristicaOpcionalEditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source, true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					CaracteristicaVisualIDRegistry.getType(CaracteristicaAgrupadaEditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source, true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					CaracteristicaVisualIDRegistry.getType(VariacaoDoisEditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source, true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					CaracteristicaVisualIDRegistry.getType(CaracteristicaRaizEditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source, true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					CaracteristicaVisualIDRegistry.getType(CaracteristicaMandatoriaEditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source, true));
			if (!source.isEmpty()) {
				result.add(source);
			}
			return result.toArray();
		}

		case CaracteristicaAtributoEditPart.VISUAL_ID: {
			LinkedList<CaracteristicaAbstractNavigatorItem> result = new LinkedList<CaracteristicaAbstractNavigatorItem>();
			Edge sv = (Edge) view;
			CaracteristicaNavigatorGroup target = new CaracteristicaNavigatorGroup(
					Messages.NavigatorGroupName_CaracteristicaAtributo_4004_target,
					"icons/linkTargetNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			CaracteristicaNavigatorGroup source = new CaracteristicaNavigatorGroup(
					Messages.NavigatorGroupName_CaracteristicaAtributo_4004_source,
					"icons/linkSourceNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					CaracteristicaVisualIDRegistry.getType(AtributoEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target, true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					CaracteristicaVisualIDRegistry.getType(CaracteristicaOpcionalEditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source, true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					CaracteristicaVisualIDRegistry.getType(CaracteristicaAgrupadaEditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source, true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					CaracteristicaVisualIDRegistry.getType(VariacaoDoisEditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source, true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					CaracteristicaVisualIDRegistry.getType(CaracteristicaRaizEditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source, true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					CaracteristicaVisualIDRegistry.getType(CaracteristicaMandatoriaEditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source, true));
			if (!target.isEmpty()) {
				result.add(target);
			}
			if (!source.isEmpty()) {
				result.add(source);
			}
			return result.toArray();
		}
		}
		return EMPTY_ARRAY;
	}

	/**
	 * @generated
	 */
	private Collection<View> getLinksSourceByType(Collection<Edge> edges, String type) {
		LinkedList<View> result = new LinkedList<View>();
		for (Edge nextEdge : edges) {
			View nextEdgeSource = nextEdge.getSource();
			if (type.equals(nextEdgeSource.getType()) && isOwnView(nextEdgeSource)) {
				result.add(nextEdgeSource);
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	private Collection<View> getLinksTargetByType(Collection<Edge> edges, String type) {
		LinkedList<View> result = new LinkedList<View>();
		for (Edge nextEdge : edges) {
			View nextEdgeTarget = nextEdge.getTarget();
			if (type.equals(nextEdgeTarget.getType()) && isOwnView(nextEdgeTarget)) {
				result.add(nextEdgeTarget);
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	private Collection<View> getOutgoingLinksByType(Collection<? extends View> nodes, String type) {
		LinkedList<View> result = new LinkedList<View>();
		for (View nextNode : nodes) {
			result.addAll(selectViewsByType(nextNode.getSourceEdges(), type));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private Collection<View> getIncomingLinksByType(Collection<? extends View> nodes, String type) {
		LinkedList<View> result = new LinkedList<View>();
		for (View nextNode : nodes) {
			result.addAll(selectViewsByType(nextNode.getTargetEdges(), type));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private Collection<View> getChildrenByType(Collection<? extends View> nodes, String type) {
		LinkedList<View> result = new LinkedList<View>();
		for (View nextNode : nodes) {
			result.addAll(selectViewsByType(nextNode.getChildren(), type));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private Collection<View> getDiagramLinksByType(Collection<Diagram> diagrams, String type) {
		ArrayList<View> result = new ArrayList<View>();
		for (Diagram nextDiagram : diagrams) {
			result.addAll(selectViewsByType(nextDiagram.getEdges(), type));
		}
		return result;
	}

	// TODO refactor as static method
	/**
	 * @generated
	 */
	private Collection<View> selectViewsByType(Collection<View> views, String type) {
		ArrayList<View> result = new ArrayList<View>();
		for (View nextView : views) {
			if (type.equals(nextView.getType()) && isOwnView(nextView)) {
				result.add(nextView);
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	private boolean isOwnView(View view) {
		return LPSEditPart.MODEL_ID.equals(CaracteristicaVisualIDRegistry.getModelID(view));
	}

	/**
	 * @generated
	 */
	private Collection<CaracteristicaNavigatorItem> createNavigatorItems(Collection<View> views, Object parent,
			boolean isLeafs) {
		ArrayList<CaracteristicaNavigatorItem> result = new ArrayList<CaracteristicaNavigatorItem>(views.size());
		for (View nextView : views) {
			result.add(new CaracteristicaNavigatorItem(nextView, parent, isLeafs));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private Collection<CaracteristicaNavigatorItem> getForeignShortcuts(Diagram diagram, Object parent) {
		LinkedList<View> result = new LinkedList<View>();
		for (Iterator<View> it = diagram.getChildren().iterator(); it.hasNext();) {
			View nextView = it.next();
			if (!isOwnView(nextView) && nextView.getEAnnotation("Shortcut") != null) { //$NON-NLS-1$
				result.add(nextView);
			}
		}
		return createNavigatorItems(result, parent, false);
	}

	/**
	 * @generated
	 */
	public Object getParent(Object element) {
		if (element instanceof CaracteristicaAbstractNavigatorItem) {
			CaracteristicaAbstractNavigatorItem abstractNavigatorItem = (CaracteristicaAbstractNavigatorItem) element;
			return abstractNavigatorItem.getParent();
		}
		return null;
	}

	/**
	 * @generated
	 */
	public boolean hasChildren(Object element) {
		return element instanceof IFile || getChildren(element).length > 0;
	}

}
