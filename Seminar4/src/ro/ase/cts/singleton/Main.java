package ro.ase.cts.singleton;

import ro.ase.cts.singleton.lazy.ReceptieHotel;

public class Main {

	public static void main(String[] args) {
		
		ReceptieHotel receptie1 = ReceptieHotel.getInstanta("Ion",4,"adb");
		ReceptieHotel receptie2 = ReceptieHotel.getInstanta("Matei",1,"asd");
		
		System.out.println(receptie1.toString());
		System.out.println(receptie2.toString());
		
		receptie1.setNumeReceptioner("Andreea");
		receptie2.setEtaj(4);

		System.out.println(receptie1.toString());
		System.out.println(receptie2.toString());
	}

}
