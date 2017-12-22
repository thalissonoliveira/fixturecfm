package examples.code;

import java.util.HashSet;
import java.util.Set;

import fixture.owl.factory.SPLConceptFactory;
import fixture.owl.model.SPL;
import fixture.owl.model.element.Attribute;
import fixture.owl.model.element.Feature;
import fixture.owl.model.element.RootFeature;
import fixture.owl.model.intefaces.Element;
import fixture.owl.parser.FeaToOntoFixture;
import fixture.owl.utils.Utils;

//	var featToOntoFixture := new Native('fixture.owl.parser.FeaToOntoFixture');
//	var factoryFixture := featToOntoFixture.getSplConceptFactory();
//	var splFixture = factoryFixture.createSpl(lps.nome);
//	
//	splFixture = construirObjetoSPL(lps, factoryFixture, splFixture, featToOntoFixture);
//	featToOntoFixture.run(splFixture);
public class SimuladorLogicaDoEwl {
	
	private static class LPS implements Nameable {
		
		private String id;
		private String name;
		private CaracteristicaRaiz sistema;
		private Set<Elemento> elementos;
		public LPS(String id, String name) {
			setId(id);
			setName(name);
			setElementos(new HashSet<SimuladorLogicaDoEwl.Elemento>());
		}
		public String getId() {
			return id;
		}
		public void setId(String id) {
			this.id = id;
		}
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public CaracteristicaRaiz getSistema() {
			return sistema;
		}
		public void setSistema(CaracteristicaRaiz sistema) {
			this.sistema = sistema;
		}
		public Set<Elemento> getElementos() {
			return elementos;
		}
		public void setElementos(Set<Elemento> elementos) {
			this.elementos = elementos;
		}
	}
	
	private static interface Nameable {
		String getId();
		String getName();
	}
	
	private static class Atributo implements Elemento {
		private String id;
		private String name;
		private Caracteristica pai;
		public Atributo(String id, String name) {
			setId(id);
			setName(name);
		}
		public String getId() {
			return id;
		}
		public void setId(String id) {
			this.id = id;
		}
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public Caracteristica getPai() {
			return pai;
		}
		public void setPai(Caracteristica pai) {
			this.pai = pai;
		}
		
		public boolean isAtributo() {
			// TODO Auto-generated method stub
			return true;
		}
		
		public boolean isCaracteristicaMandatoria() {
			// TODO Auto-generated method stub
			return false;
		}
		
		public boolean isCaracteristicaOpcional() {
			// TODO Auto-generated method stub
			return false;
		}
		
		public boolean isCaracteristicaRaiz() {
			// TODO Auto-generated method stub
			return false;
		}
	}
	
	private interface Elemento extends Nameable {
		boolean isAtributo();
		boolean isCaracteristicaMandatoria();
		boolean isCaracteristicaOpcional();
		boolean isCaracteristicaRaiz();
	}
	
	
	private static abstract class Caracteristica implements Elemento {
		private String id;
		private String name;
		private Caracteristica pai;
		private Set<Caracteristica> filhos;
		private Set<Atributo> atributos;
		
		
		public Caracteristica(String id, String name) {
			setId(id);
			setName(name);
			filhos = new HashSet<SimuladorLogicaDoEwl.Caracteristica>();
			atributos = new HashSet<SimuladorLogicaDoEwl.Atributo>();
		}
		public String getId() {
			return id;
		}
		public void setId(String id) {
			this.id = id;
		}
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public Caracteristica getPai() {
			return pai;
		}
		public void setPai(Caracteristica pai) {
			this.pai = pai;
		}
		public Set<Caracteristica> getFilhos() {
			return filhos;
		}
		public void setFilhos(Set<Caracteristica> filhos) {
			this.filhos = filhos;
		}
		public Set<Atributo> getAtributos() {
			return atributos;
		}
		public void setAtributos(Set<Atributo> atributos) {
			this.atributos = atributos;
		}
	}
	
	private static class CaracteristicaRaiz extends Caracteristica {
		public CaracteristicaRaiz(String id, String name) {
			super(id, name);
		}

		
		public boolean isAtributo() {
			return false;
		}

		
		public boolean isCaracteristicaMandatoria() {
			return false;
		}

		
		public boolean isCaracteristicaOpcional() {
			return false;
		}

		
		public boolean isCaracteristicaRaiz() {
			return true;
		}
	}
	
	private static class CaracteristicaMandatoria extends Caracteristica {
		public CaracteristicaMandatoria(String id, String name) {
			super(id, name);
		}

		
		public boolean isAtributo() {
			return false;
		}

		
		public boolean isCaracteristicaMandatoria() {
			// TODO Auto-generated method stub
			return true;
		}

		
		public boolean isCaracteristicaOpcional() {
			// TODO Auto-generated method stub
			return false;
		}

		
		public boolean isCaracteristicaRaiz() {
			// TODO Auto-generated method stub
			return false;
		}
	}

	private static class CaracteristicaOpcional extends Caracteristica {
		public CaracteristicaOpcional(String id, String name) {
			super(id, name);
		}

		
		public boolean isAtributo() {
			// TODO Auto-generated method stub
			return false;
		}

		
		public boolean isCaracteristicaMandatoria() {
			// TODO Auto-generated method stub
			return false;
		}

		
		public boolean isCaracteristicaOpcional() {
			// TODO Auto-generated method stub
			return true;
		}

		
		public boolean isCaracteristicaRaiz() {
			// TODO Auto-generated method stub
			return false;
		}
	}	
	
	public static void main(String[] args) {
		go();
	}

	private static void go() {
		
		LPS lps = new LPS("\\", "Nome");
		CaracteristicaRaiz raiz = new CaracteristicaRaiz("\\\\@elemento.0", "Raiz");
		CaracteristicaMandatoria mand1 = new CaracteristicaMandatoria("\\\\@elemento.1", "Mand1");
		CaracteristicaMandatoria mand2 = new CaracteristicaMandatoria("\\\\@elemento.2", "Mand2");
		CaracteristicaOpcional opc1 = new CaracteristicaOpcional("\\\\@elemento.3", "Opc1");
		CaracteristicaOpcional opc2 = new CaracteristicaOpcional("\\\\@elemento.4", "Opc2");
		CaracteristicaOpcional opc3 = new CaracteristicaOpcional("\\\\@elemento.5", "Opc3");
		
		Atributo at1 = new Atributo("\\\\@elemento.6", "At1");
		Atributo at2 = new Atributo("\\\\@elemento.7", "At2");
		mand2.getAtributos().add(at1);
		mand2.getAtributos().add(at2);
		at1.setPai(mand2);
		at2.setPai(mand2);
		
		
		raiz.getFilhos().add(mand1);
		raiz.getFilhos().add(opc1);
		mand2.setPai(raiz);
		opc1.setPai(raiz);
		
		mand1.getFilhos().add(opc2);
		mand1.getFilhos().add(mand2);
		opc2.setPai(mand1);
		mand2.setPai(mand1);
		
		opc1.getFilhos().add(opc3);
		opc3.setPai(opc1);
		
		lps.setSistema(raiz);
		lps.getElementos().add(raiz);
		lps.getElementos().add(mand1);
		lps.getElementos().add(mand2);
		lps.getElementos().add(opc1);
		lps.getElementos().add(opc2);
		lps.getElementos().add(opc3);
		lps.getElementos().add(at1);
		lps.getElementos().add(at2);
		
		
		FeaToOntoFixture fixture = new FeaToOntoFixture();
		SPLConceptFactory splConceptFactory = fixture.getSplConceptFactory();
		SPL spl = splConceptFactory.createSpl("\\", "SPL");
		
		spl = construirObjeto(lps, splConceptFactory, spl, fixture);
		
		Utils.printSPLInfo(spl);
		
		fixture.run(spl);
		
	}

	private static SPL construirObjeto(LPS lps, SPLConceptFactory factory, SPL spl, FeaToOntoFixture fixture) {
		CaracteristicaRaiz raiz = lps.getSistema();
		
	 	RootFeature rootFixture = (RootFeature) instanciarElemento(raiz, factory);
	 	
	 	fixture.addToFixtureOracle(spl);
		
		spl.setSystem(rootFixture);
		Element element = null;
		
		for (Elemento elemento : lps.getElementos()) {
			element = instanciarElemento(elemento, factory);
			spl.getElements().add(element);
			fixture.addToFixtureOracle(element);
		}
		
		preencherElementosCaracteristicaLpsFixture(raiz, factory, spl, fixture);
		
		return spl;
		
	}

	private static Element instanciarElemento(Elemento elemento, SPLConceptFactory factory) {
		Element element = null;
		if (elemento.isAtributo()) {
			element = factory.createAttribute(elemento.getId(), elemento.getName());
		} else if (elemento.isCaracteristicaMandatoria()) {
			element = factory.createMandatoryFeature(elemento.getId(), elemento.getName());
		} else if (elemento.isCaracteristicaOpcional()) {
			element = factory.createOptionalFeature(elemento.getId(), elemento.getName());
		} else if (elemento.isCaracteristicaRaiz()) {
			element = factory.createRootFeature(elemento.getId(), elemento.getName());
		}
		
		return element;
	}
	
	
	private static FeaToOntoFixture preencherElementosCaracteristicaLpsFixture(Caracteristica caracteristicaRaiz, SPLConceptFactory factory, SPL spl, FeaToOntoFixture fixture) {
		
		Feature feature = (Feature) fixture.getOracle().get(caracteristicaRaiz.getId());
		Feature childFeature = null;
		Attribute attributeFixture = null;
		
		for (Atributo atributo : caracteristicaRaiz.getAtributos()) {
			attributeFixture = (Attribute) fixture.getOracle().get(atributo.getId());
			feature.addAttribute(attributeFixture);
		}
		
		for (Caracteristica caracteristicaFilha : caracteristicaRaiz.getFilhos()) {
			childFeature = (Feature) fixture.getOracle().get(caracteristicaFilha.getId());
			feature.addChild(childFeature);
			
			for (Atributo atributo : caracteristicaFilha.getAtributos()) {
				attributeFixture = (Attribute) fixture.getOracle().get(atributo.getId());
				childFeature.addAttribute(attributeFixture);
			}
			
			if (!caracteristicaFilha.getFilhos().isEmpty()) {
				fixture = preencherElementosCaracteristicaLpsFixture(caracteristicaFilha, factory, spl, fixture);
			}
			
		}
		return fixture;
		
	}
	
	private static Feature criarNovaCaracteristicaFixture(Caracteristica caracteristica, SPLConceptFactory factory) {
		if (caracteristica instanceof CaracteristicaMandatoria) {
			return factory.createMandatoryFeature(caracteristica.getId(), caracteristica.getName());
		} else if (caracteristica instanceof CaracteristicaOpcional) {
			return factory.createOptionalFeature(caracteristica.getId(), caracteristica.getName());
		} else {
			System.out.println("[ERROR] - Erro ao criar nova Feature pela Fixture: característica do modelo é inválida.");
			return null;
		}
	}

}
