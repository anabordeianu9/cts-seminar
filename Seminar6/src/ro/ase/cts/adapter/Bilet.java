package ro.ase.cts.adapter;

public class Bilet {
	private int pret;

	public Bilet(int pret) {
		super();
		this.pret = pret;
	}
	
	public void vinde() {
		System.out.println("S-a vandut biletul cu pretul "+this.pret);
	}
	
	public void rezerva() {
		System.out.println("S-a rezervat biletul cu pretul "+this.pret);
	}


	
}
