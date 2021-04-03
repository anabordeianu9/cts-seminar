package ro.ase.cts.adapter;

public class Main {
	public static void rezervaSiVindeBiletLaCasa(Bilet bilet) {
		bilet.rezerva();
		bilet.vinde();
	}
	
	public static void rezervaSiVindeBiletPePlatforma(BiletOnline bilet) {
		bilet.rezervaBiletOnline();
		bilet.vindeBiletOnline();
	}

	public static void main(String[] args) {
		Bilet bilet = new Bilet(20);
		rezervaSiVindeBiletLaCasa(bilet);
		
		BiletAdapter biletAdapter = new BiletAdapter(30);
		rezervaSiVindeBiletPePlatforma(biletAdapter);
		
		BiletOnline biletOnline = new AdapterObiecteBilet(bilet);
		rezervaSiVindeBiletPePlatforma(biletOnline);

	}

}
