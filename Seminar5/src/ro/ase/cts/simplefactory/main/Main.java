package ro.ase.cts.simplefactory.main;

import ro.ase.cts.simplefactory.Factory;
import ro.ase.cts.simplefactory.Fundas;
import ro.ase.cts.simplefactory.Jucator;
import ro.ase.cts.simplefactory.Portar;
import ro.ase.cts.simplefactory.TipJucator;

public class Main {

	public static void main(String[] args) {
		Factory factory = new Factory();
		Jucator portar = factory.getJucator(TipJucator.Portar,"Alexandru");
		Jucator fundas = factory.getJucator(TipJucator.Fundas,"Alexandru");
		
		System.out.println(portar.toString());
		System.out.println(fundas.toString());

	}

}
