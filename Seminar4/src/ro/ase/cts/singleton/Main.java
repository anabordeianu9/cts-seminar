package ro.ase.cts.singleton;

import ro.ase.cts.singleton.lazy.ReceptieHotel;
import ro.ase.cts.singleton.lazy.Basm;


public class Main {

	public static void main(String[] args) {
		
		Basm basm1 = Basm.getInstanta("Creanga", 123, "HarapAlb");
		Basm basm2 = Basm.getInstanta("Necunoscut", 456, "IleanaCosanzeana");

		
		System.out.println(basm1.toString());
		System.out.println(basm2.toString());
		
		basm1.setAutor("Andreea");
		basm2.setAnAparitie(4);

		System.out.println(basm1.toString());
		System.out.println(basm2.toString());
	}

}
