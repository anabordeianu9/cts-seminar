package ro.ase.cts.factory.main;

import ro.ase.cts.factory.Factory;
import ro.ase.cts.factory.Jucator;
import ro.ase.cts.factory.Portar;
import ro.ase.cts.factory.TipJucator;
import ro.ase.cts.factory.Fundas;
import ro.ase.cts.factory.Atacant;

public class Main {

	public static void main(String[] args) {
		Factory factory = new Factory();
		Jucator portar = factory.getJucator(TipJucator.Portar,"Alexandru");
		Jucator fundas = factory.getJucator(TipJucator.Fundas,"Alexandru");
		
		System.out.println(portar.toString());
		System.out.println(fundas.toString());

	}

}
