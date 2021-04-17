package ro.ase.cts.strategy;

public class Client {
	private String nume;
	private ModPlata modPlata;
	
	public Client(String nume, ModPlata modPlata) {
		super();
		this.nume = nume;
		this.modPlata = modPlata;
	}

	public void setModPlata(ModPlata modPlata) {
		this.modPlata = modPlata;
	}
	
	public void platesteNota(int suma) {
		modPlata.realizeazaPlata(suma);
	}
}
