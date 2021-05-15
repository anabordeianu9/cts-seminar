package ro.ase.cts.memento;

public class Memento {
	private String numeEchipaGazda;
	private String numeEchipaOaspeti;
	private int nrSpectatori;
	
	public Memento(String numeEchipaGazda, String numeEchipaOaspeti, int nrSpectatori) {
		super();
		this.numeEchipaGazda = numeEchipaGazda;
		this.numeEchipaOaspeti = numeEchipaOaspeti;
		this.nrSpectatori = nrSpectatori;
	}
	
	public String getNumeEchipaGazda() {
		return numeEchipaGazda;
	}
	public String getNumeEchipaOaspeti() {
		return numeEchipaOaspeti;
	}
	public int getNrSpectatori() {
		return nrSpectatori;
	}
	
	
}
