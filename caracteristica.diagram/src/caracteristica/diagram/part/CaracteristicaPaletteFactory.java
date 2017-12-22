/*
 * 
 */
package caracteristica.diagram.part;

import java.util.Collections;
import java.util.List;

import org.eclipse.gef.Tool;
import org.eclipse.gef.palette.PaletteContainer;
import org.eclipse.gef.palette.PaletteDrawer;
import org.eclipse.gef.palette.PaletteRoot;
import org.eclipse.gef.palette.ToolEntry;
import org.eclipse.gmf.runtime.diagram.ui.tools.UnspecifiedTypeConnectionTool;
import org.eclipse.gmf.runtime.diagram.ui.tools.UnspecifiedTypeCreationTool;
import org.eclipse.gmf.runtime.emf.type.core.IElementType;

import org.eclipse.gmf.tooling.runtime.part.DefaultLinkToolEntry;
import org.eclipse.gmf.tooling.runtime.part.DefaultNodeToolEntry;
import caracteristica.diagram.providers.CaracteristicaElementTypes;

/**
 * @generated
 */
public class CaracteristicaPaletteFactory {

	/**
	 * @generated
	 */
	public void fillPalette(PaletteRoot paletteRoot) {
		paletteRoot.add(createObjects1Group());
		paletteRoot.add(createConnections2Group());
	}

	/**
	 * Creates "Objects" palette tool group
	 * @generated
	 */
	private PaletteContainer createObjects1Group() {
		PaletteDrawer paletteContainer = new PaletteDrawer(Messages.Objects1Group_title);
		paletteContainer.setId("createObjects1Group"); //$NON-NLS-1$
		paletteContainer.add(createAtributo1CreationTool());
		paletteContainer.add(createCaracteristicaAgrupada2CreationTool());
		paletteContainer.add(createCaracteristicaMandatoria3CreationTool());
		paletteContainer.add(createCaracteristicaOpcional4CreationTool());
		paletteContainer.add(createCaracteristicaRaiz5CreationTool());
		paletteContainer.add(createVariacaoDois6CreationTool());
		return paletteContainer;
	}

	/**
	 * Creates "Connections" palette tool group
	 * @generated
	 */
	private PaletteContainer createConnections2Group() {
		PaletteDrawer paletteContainer = new PaletteDrawer(Messages.Connections2Group_title);
		paletteContainer.setId("createConnections2Group"); //$NON-NLS-1$
		paletteContainer.add(createAtributo1CreationTool());
		paletteContainer.add(createCaracteristicaFilha2CreationTool());
		paletteContainer.add(createVariacoes3CreationTool());
		paletteContainer.add(createVariantes4CreationTool());
		return paletteContainer;
	}

	/**
	* @generated
	*/
	private ToolEntry createAtributo1CreationTool() {
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(Messages.Atributo1CreationTool_title,
				Messages.Atributo1CreationTool_desc,
				Collections.singletonList(CaracteristicaElementTypes.Atributo_2017));
		entry.setId("createAtributo1CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(CaracteristicaElementTypes.getImageDescriptor(CaracteristicaElementTypes.Atributo_2017));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createCaracteristicaAgrupada2CreationTool() {
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(Messages.CaracteristicaAgrupada2CreationTool_title,
				Messages.CaracteristicaAgrupada2CreationTool_desc,
				Collections.singletonList(CaracteristicaElementTypes.CaracteristicaAgrupada_2033));
		entry.setId("createCaracteristicaAgrupada2CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(
				CaracteristicaElementTypes.getImageDescriptor(CaracteristicaElementTypes.CaracteristicaAgrupada_2033));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createCaracteristicaMandatoria3CreationTool() {
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(Messages.CaracteristicaMandatoria3CreationTool_title,
				Messages.CaracteristicaMandatoria3CreationTool_desc,
				Collections.singletonList(CaracteristicaElementTypes.CaracteristicaMandatoria_2004));
		entry.setId("createCaracteristicaMandatoria3CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(CaracteristicaElementTypes
				.getImageDescriptor(CaracteristicaElementTypes.CaracteristicaMandatoria_2004));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createCaracteristicaOpcional4CreationTool() {
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(Messages.CaracteristicaOpcional4CreationTool_title,
				Messages.CaracteristicaOpcional4CreationTool_desc,
				Collections.singletonList(CaracteristicaElementTypes.CaracteristicaOpcional_2001));
		entry.setId("createCaracteristicaOpcional4CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(
				CaracteristicaElementTypes.getImageDescriptor(CaracteristicaElementTypes.CaracteristicaOpcional_2001));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createCaracteristicaRaiz5CreationTool() {
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(Messages.CaracteristicaRaiz5CreationTool_title,
				Messages.CaracteristicaRaiz5CreationTool_desc,
				Collections.singletonList(CaracteristicaElementTypes.CaracteristicaRaiz_2003));
		entry.setId("createCaracteristicaRaiz5CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(
				CaracteristicaElementTypes.getImageDescriptor(CaracteristicaElementTypes.CaracteristicaRaiz_2003));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	* @generated
	*/
	private ToolEntry createVariacaoDois6CreationTool() {
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(Messages.VariacaoDois6CreationTool_title,
				Messages.VariacaoDois6CreationTool_desc,
				Collections.singletonList(CaracteristicaElementTypes.VariacaoDois_2002));
		entry.setId("createVariacaoDois6CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(CaracteristicaElementTypes.getImageDescriptor(CaracteristicaElementTypes.VariacaoDois_2002));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createAtributo1CreationTool() {
		DefaultLinkToolEntry entry = new DefaultLinkToolEntry(Messages.Atributo1CreationTool_title,
				Messages.Atributo1CreationTool_desc,
				Collections.singletonList(CaracteristicaElementTypes.CaracteristicaAtributo_4004));
		entry.setId("createAtributo1CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(
				CaracteristicaElementTypes.getImageDescriptor(CaracteristicaElementTypes.CaracteristicaAtributo_4004));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createCaracteristicaFilha2CreationTool() {
		DefaultLinkToolEntry entry = new DefaultLinkToolEntry(Messages.CaracteristicaFilha2CreationTool_title,
				Messages.CaracteristicaFilha2CreationTool_desc,
				Collections.singletonList(CaracteristicaElementTypes.CaracteristicaCaracteristicaFilha_4002));
		entry.setId("createCaracteristicaFilha2CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(CaracteristicaElementTypes
				.getImageDescriptor(CaracteristicaElementTypes.CaracteristicaCaracteristicaFilha_4002));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	* @generated
	*/
	private ToolEntry createVariacoes3CreationTool() {
		DefaultLinkToolEntry entry = new DefaultLinkToolEntry(Messages.Variacoes3CreationTool_title,
				Messages.Variacoes3CreationTool_desc,
				Collections.singletonList(CaracteristicaElementTypes.CaracteristicaVariacoes_4003));
		entry.setId("createVariacoes3CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(
				CaracteristicaElementTypes.getImageDescriptor(CaracteristicaElementTypes.CaracteristicaVariacoes_4003));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	* @generated
	*/
	private ToolEntry createVariantes4CreationTool() {
		DefaultLinkToolEntry entry = new DefaultLinkToolEntry(Messages.Variantes4CreationTool_title,
				Messages.Variantes4CreationTool_desc,
				Collections.singletonList(CaracteristicaElementTypes.VariacaoVariantes_4005));
		entry.setId("createVariantes4CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(
				CaracteristicaElementTypes.getImageDescriptor(CaracteristicaElementTypes.VariacaoVariantes_4005));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}
}
