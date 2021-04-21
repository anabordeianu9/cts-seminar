package ro.ase.cts.template;

public class MasaBar extends Masa{

	public MasaBar(int codMasa) {
		super(codMasa);
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public void aseazaTacamuri() {
		System.out.println("Pe masa cu codul "+this.codMasa+" s-au asezat tacamurile");
	}
	

}
