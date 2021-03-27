package ro.ase.cts.factorymethod;

public class Fundas extends Jucator{
	public Fundas(String numeJucator) {
		super(numeJucator);
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Fundas nume = ");
		builder.append(super.toString());
		return builder.toString();
	}
	
	
}
