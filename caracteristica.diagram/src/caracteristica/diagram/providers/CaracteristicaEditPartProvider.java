/*
 * 
 */
package caracteristica.diagram.providers;

import org.eclipse.gmf.tooling.runtime.providers.DefaultEditPartProvider;

import caracteristica.diagram.edit.parts.CaracteristicaEditPartFactory;
import caracteristica.diagram.edit.parts.LPSEditPart;
import caracteristica.diagram.part.CaracteristicaVisualIDRegistry;

/**
 * @generated
 */
public class CaracteristicaEditPartProvider extends DefaultEditPartProvider {

	/**
	 * @generated
	 */
	public CaracteristicaEditPartProvider() {
		super(new CaracteristicaEditPartFactory(), CaracteristicaVisualIDRegistry.TYPED_INSTANCE, LPSEditPart.MODEL_ID);
	}

}
