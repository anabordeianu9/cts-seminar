package ro.ase.cts.chain;

public abstract class Cont {
	private Cont next;
	private float sold;
	private String iban;
	
	public Cont(float sold, String iban) {
		super();
		this.next = null;
		this.sold = sold;
		this.iban = iban;
	}

	public Cont getNext() {
		return next;
	}

	public void setNext(Cont next) {
		this.next = next;
	}

	public float getSold() {
		return sold;
	}

	public void setSold(float sold) {
		this.sold = sold;
	}
	
	public abstract void plateste(float suma);
}
