package ro.ase.cts.command;

public class ComandaDepunere implements ICommand{
	private ContBancar cont;
	private float sumaDepusa;
	
	public ComandaDepunere(ContBancar cont, float sumaInitiala) {
		super();
		this.cont = cont;
		this.sumaDepusa = sumaInitiala;
	}

	@Override
	public void executa() {
		cont.depunere(sumaDepusa);
	}
}
