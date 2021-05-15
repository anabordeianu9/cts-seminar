package ro.ase.cts.memento.main;

import ro.ase.cts.memento.ManagerMemento;
import ro.ase.cts.memento.MeciJucat;
import ro.ase.cts.memento.Memento;

public class Main {

	public static void main(String[] args) {
		MeciJucat meci1 = new MeciJucat("Echipa1","Echipa2", 150,120,30,50);
		Memento memento = meci1.creareMemento();
		ManagerMemento manager = new ManagerMemento();
		manager.adaugaMemento(memento);
		
		meci1.setNrSpectatori(7500);
		meci1.setNrBileteVandute(2780);
		meci1.setNumeEchipaGazda("Barcelona");
		meci1.setNumeEchipaOaspeti("Real");
		
		manager.adaugaMemento(meci1.creareMemento());
		System.out.println(meci1.toString());
		meci1.setMemento(manager.getMemento(0));
		System.out.println(meci1.toString());
		meci1.setMemento(manager.getLastMemento());
		System.out.println(meci1.toString());

	}

}
