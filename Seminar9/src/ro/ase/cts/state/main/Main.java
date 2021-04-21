package ro.ase.cts.state.main;

import ro.ase.cts.state.Masa;

public class Main {

	public static void main(String[] args) {
		Masa masa = new Masa(10);
	
		masa.elibereazaMasa();
		masa.rezervareMasa();
		masa.ridicaRezervare();
		masa.elibereazaMasa();
		
		
	}

}
