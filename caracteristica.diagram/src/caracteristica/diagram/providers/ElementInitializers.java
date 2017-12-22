/*
 * 
 */
package caracteristica.diagram.providers;

import caracteristica.diagram.part.CaracteristicaDiagramEditorPlugin;

/**
 * @generated
 */
public class ElementInitializers {

	protected ElementInitializers() {
		// use #getInstance to access cached instance
	}

	/**
	 * @generated
	 */
	public static ElementInitializers getInstance() {
		ElementInitializers cached = CaracteristicaDiagramEditorPlugin.getInstance().getElementInitializers();
		if (cached == null) {
			CaracteristicaDiagramEditorPlugin.getInstance().setElementInitializers(cached = new ElementInitializers());
		}
		return cached;
	}
}
