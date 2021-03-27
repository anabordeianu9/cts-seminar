package ro.ase.cts.factorymethod;

public class FactoryMijlocas implements Factory {

	@Override
	public Jucator creazaJucator(String numeJucator) {
		return new Mijlocas(numeJucator);
	}

}
