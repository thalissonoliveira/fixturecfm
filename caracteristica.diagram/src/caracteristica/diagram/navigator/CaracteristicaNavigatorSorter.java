/*
 * 
 */
package caracteristica.diagram.navigator;

import org.eclipse.jface.viewers.ViewerSorter;

import caracteristica.diagram.part.CaracteristicaVisualIDRegistry;

/**
 * @generated
 */
public class CaracteristicaNavigatorSorter extends ViewerSorter {

	/**
	 * @generated
	 */
	private static final int GROUP_CATEGORY = 4007;

	/**
	 * @generated
	 */
	private static final int SHORTCUTS_CATEGORY = 4006;

	/**
	 * @generated
	 */
	public int category(Object element) {
		if (element instanceof CaracteristicaNavigatorItem) {
			CaracteristicaNavigatorItem item = (CaracteristicaNavigatorItem) element;
			if (item.getView().getEAnnotation("Shortcut") != null) { //$NON-NLS-1$
				return SHORTCUTS_CATEGORY;
			}
			return CaracteristicaVisualIDRegistry.getVisualID(item.getView());
		}
		return GROUP_CATEGORY;
	}

}
