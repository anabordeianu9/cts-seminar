package ro.ase.cts.template;

public abstract class TemplateOcupareMasa {
	
	int codMasa;
	
	public abstract void curataMasa();
	public abstract void aseazaServetele();
	public abstract void aseazaTacamuri();
	public abstract void invitaPersoane();
	
	public final void ocupaMasa() {
		curataMasa();
		aseazaServetele();
		aseazaTacamuri();
		invitaPersoane();
	}
}
