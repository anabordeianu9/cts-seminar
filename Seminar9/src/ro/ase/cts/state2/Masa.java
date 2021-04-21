package ro.ase.cts.state2;

public class Masa {
	private State stare;
	private int cod;
	
	public Masa(int cod) {
		super();
		this.cod = cod;
		this.stare = new StareLibera();
	}
	
	State getStare() {
		return stare;
	}
	void setStare(State stare) {
		this.stare = stare;
	}
	int getCod() {
		return cod;
	}
	void setCod(int cod) {
		this.cod = cod;
	}
	
	public void rezervaMasa() {
		StareRezervata stareRezervata = new StareRezervata();
		stareRezervata.modificaStare(this);
	}
	
	public void ocupaMasa() {
		StareOcupata stareOcupata = new StareOcupata();
		stareOcupata.modificaStare(this);
	}
	
	public void elibereazaMasa() {
		StareLibera stareLibera = new StareLibera();
		stareLibera.modificaStare(this);
	}
	
	public void ridicaRezervare() {
		ocupaMasa();
	}
	
}
