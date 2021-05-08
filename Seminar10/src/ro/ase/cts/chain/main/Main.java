package ro.ase.cts.chain.main;

import ro.ase.cts.chain.Cont;
import ro.ase.cts.chain.ContCredit;
import ro.ase.cts.chain.ContCurent;
import ro.ase.cts.chain.ContEconomii;

public class Main {

	public static void main(String[] args) {
		
		Cont economii	 = new ContEconomii(1000, "RO9876");
		Cont curent	 = new ContCurent(1200, "RO9877");
		Cont credit	 = new ContCredit(2000, "RO9878");
		
		curent.setNext(economii);
		economii.setNext(credit);
		
		curent.plateste(400);
		curent.plateste(700);
		curent.plateste(2000);
		curent.plateste(700);
		curent.plateste(700);
		
	}

}
