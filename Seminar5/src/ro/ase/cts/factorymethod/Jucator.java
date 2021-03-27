package ro.ase.cts.factorymethod;

public abstract class Jucator {
	private String numeJucator;

	public Jucator(String numeJucator) {
		super();
		this.numeJucator = numeJucator;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Jucator [numeJucator=");
		builder.append(numeJucator);
		builder.append("]");
		return builder.toString();
	}

}
