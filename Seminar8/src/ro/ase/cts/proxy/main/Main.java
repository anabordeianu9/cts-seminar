package ro.ase.cts.proxy.main;

import ro.ase.cts.proxy.OperatorRezervari;
import ro.ase.cts.proxy.ProxyOperatorRezervari;

public class Main {

	public static void main(String[] args) {
		
		OperatorRezervari operator = new OperatorRezervari();
		operator.realizeazaRezervare("Andrei", 1);
		
		ProxyOperatorRezervari proxy = new ProxyOperatorRezervari(operator, 4);
		proxy.realizeazaRezervare("Matei", 1);
		proxy.realizeazaRezervare("Mihai", 5);
	}

}
