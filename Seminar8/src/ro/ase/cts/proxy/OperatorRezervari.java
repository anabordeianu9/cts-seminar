package ro.ase.cts.proxy;

public class OperatorRezervari implements IOperatorRezervari{

	@Override
	public void realizeazaRezervare(String numeClient, int nrPersoane) {
		System.out.println("A fost facuta rezervarea pentru " + nrPersoane + " pe numele " + numeClient);
		
	}
}
