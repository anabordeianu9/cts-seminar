package ro.ase.cts.simplefactory;

public class Factory {
	
	public Jucator getJucator(TipJucator tipJucator, String numeJucator) {
		switch(tipJucator) {
		case Portar:
			{
				return new Portar(numeJucator);
			}
		case Fundas:
			{
				return new Fundas(numeJucator);
			}
		case Atacant:
			{
				return new Atacant(numeJucator);
			}
		default:
			{
				throw new IllegalArgumentException();
			}
		}
	}
}
