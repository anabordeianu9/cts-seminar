package ro.ase.cts.command;

public class ComandaRetragere implements ICommand{
	private ContBancar cont;
	private float sumaRetrasa;
	
	public ComandaRetragere(ContBancar cont, float sumaInitiala) {
		super();
		this.cont = cont;
		this.sumaRetrasa = sumaInitiala;
	}

	@Override
	public void executa() {
		cont.retragere(sumaRetrasa);
	}
}
