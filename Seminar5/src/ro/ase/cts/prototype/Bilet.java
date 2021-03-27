package ro.ase.cts.prototype;

public class Bilet implements Copiator{
	private int cod;
	private String numeEchipaA;
	private String numeEchipaB;
	private String ora;
	
	public Bilet() {
		super();
	}

	public Bilet(int cod, String numeEchipaA, String numeEchipaB, String ora) {
		super();
		this.cod = cod;
		this.numeEchipaA = numeEchipaA;
		this.numeEchipaB = numeEchipaB;
		this.ora = ora;
	}

	public int getCod() {
		return cod;
	}

	public void setCod(int cod) {
		this.cod = cod;
	}

	@Override
	public Copiator copiaza() {
		Bilet bilet = new Bilet();
		bilet.cod = this.cod;
		bilet.numeEchipaA = this.numeEchipaA;
		bilet.numeEchipaB = this.numeEchipaB;
		bilet.ora = this.ora;
		return bilet;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Bilet [cod=");
		builder.append(cod);
		builder.append(", numeEchipaA=");
		builder.append(numeEchipaA);
		builder.append(", numeEchipaB=");
		builder.append(numeEchipaB);
		builder.append(", ora=");
		builder.append(ora);
		builder.append("]");
		return builder.toString();
	}
	
	
}
