package ro.ase.cts.factorymethod;

public class FactoryAtacant implements Factory{

	@Override
	public Jucator creazaJucator(String numeJucator) {
		return new Atacant(numeJucator);
	}

}
