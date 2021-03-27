package ro.ase.cts.factorymethod.main;

import ro.ase.cts.factorymethod.Factory;
import ro.ase.cts.factorymethod.FactoryFundas;
import ro.ase.cts.factorymethod.FactoryMijlocas;
import ro.ase.cts.factorymethod.FactoryPortar;
import ro.ase.cts.factorymethod.Jucator;

public class Main {
	
	private static void afiseazaJucator(Factory factory, String numeJucator) {
		Jucator jucator = factory.creazaJucator(numeJucator);
		System.out.println(jucator.toString());
	} 

	public static void main(String[] args) {
		afiseazaJucator(new FactoryPortar(), "Matei");
		afiseazaJucator(new FactoryFundas(), "Georgel");
		afiseazaJucator(new FactoryMijlocas(), "Marin");

	}

}
