package ro.ase.cts.prototype;

public class Client implements Copiator{
	private String nume;
	private int varsta;
	
	public Client(String nume, int varsta) {
		super();
		//se fac validari pentru nume si varsta
		this.nume = nume;
		this.varsta = varsta;
	}
	
	private Client() {
		super();
	}

	@Override
	public Copiator copiaza() {
		Client client = new Client();
		client.nume = this.nume;
		client.varsta = this.varsta;
		return client;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Client [nume=");
		builder.append(nume);
		builder.append(", varsta=");
		builder.append(varsta);
		builder.append("]");
		return builder.toString();
	}
	
	

}
