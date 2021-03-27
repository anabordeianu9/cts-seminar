package ro.ase.cts.factorymethod;

public class Mijlocas extends Jucator{
	public Mijlocas(String numeJucator) {
		super(numeJucator);
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Mijlocas nume = ");
		builder.append(super.toString());
		return builder.toString();
	}
}
