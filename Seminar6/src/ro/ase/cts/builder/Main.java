package ro.ase.cts.builder;

public class Main {

	public static void main(String[] args) {
		Rezervare r1 = new Rezervare(123,false,false,false,true,"Pop");
		Rezervare r2 = new RezervareBuilder().setCodRezervare(234).setAreBauturaInclusa(true)
				.setAreMancareInclusa(true).setAreMuzicaAmbientala(true).setAreScaunErgonomic(true)
				.setGenMuzical("Rock").build();
		Rezervare r3 = new RezervareBuilder(345).setAreMuzicaAmbientala(true)
				.setGenMuzical("Jazz").build();
		
		System.out.println(r1.toString());
		System.out.println(r2.toString());
		System.out.println(r3.toString());
		
		RezervareBuilder builder = new RezervareBuilder();
		Rezervare r4 = builder.setCodRezervare(456).build();
		Rezervare r5 = builder.setCodRezervare(567).build();
		
		System.out.println(r4.toString());
		System.out.println(r5.toString());

	}

}
