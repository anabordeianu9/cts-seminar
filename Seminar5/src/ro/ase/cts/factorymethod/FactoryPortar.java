package ro.ase.cts.factorymethod;

public class FactoryPortar implements Factory{
	
	@Override
	public Jucator creazaJucator(String numeJucator) {
		return new Portar(numeJucator);
	}

}
