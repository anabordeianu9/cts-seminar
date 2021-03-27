package ro.ase.cts.simplefactory;

public class Atacant extends Jucator{
	public Atacant(String numeJucator) {
		super(numeJucator);
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Atacant nume = ");
		builder.append(super.toString());
		return builder.toString();
	}
	
	
}
