package ro.ase.cts.command;

public class ContBancar {
	private String iban;
	private float sold;
	
	public ContBancar(String iban, float sold) {
		super();
		this.iban = iban;
		this.sold = sold;
	}
	
	public void constituire(float sumaInitiala) {
		this.sold = sumaInitiala;
		System.out.println("S-a constiuit contul cu suma "+this.sold);
	}
	
	public void retragere(float sumaDeRetras) {
		if(this.sold >= sumaDeRetras) {
			this.sold-=sumaDeRetras;
			System.out.println("S-a realizat o retragere in valoare de "+sumaDeRetras);
		} else {
			System.out.println("Fonduri insuficiente!");
		}
	}
	
	public void depunere(float suma) {
		this.sold+=suma;
		System.out.println("Fonduri curente "+this.sold);
	}

}
