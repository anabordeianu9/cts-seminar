package ro.ase.cts.template;

public class Masa extends TemplateOcupareMasa {

	public Masa(int codMasa) {
		super(codMasa);
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public void curataMasa() {
		System.out.println("Masa cu codul "+this.codMasa+" este curatata");
	}

	@Override
	public void aseazaServetele() {
		System.out.println("Pe masa cu codul "+this.codMasa+" s-au asezat servetelele");
	}
	
	@Override
	public void aseazaTacamuri() {
		System.out.println("Pe masa cu codul "+this.codMasa+" s-au asezat tacamurile");
	}
	
	@Override
	public void invitaPersoane() {
		System.out.println("La masa cu codul "+this.codMasa+" au fst invitate persoanele");
	}
}
