package ro.ase.cts.factorymethod;

public class FactoryFundas implements Factory{
	
	@Override
	public Jucator creazaJucator(String numeJucator) {
		return new Fundas(numeJucator);
	}

}
