package ro.ase.cts.composite;

public class Filiala implements Sediu{
	private String nume;

	public Filiala(String nume) {
		super();
		this.nume = nume;
	}

	@Override
	public void descriere() {
		System.out.println("Filiala "+nume);
	}

	@Override
	public void adaugaSediu(Sediu sediu) throws Exception {
		throw new Exception();
	}

	@Override
	public void stergeSediu(Sediu sediu) throws Exception {
		throw new Exception();
	}

	@Override
	public void getSediu(int pozitie) throws Exception {
		throw new Exception();
	}

}
