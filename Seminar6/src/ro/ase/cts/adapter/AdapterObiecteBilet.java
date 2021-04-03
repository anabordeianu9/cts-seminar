package ro.ase.cts.adapter;

public class AdapterObiecteBilet implements BiletOnline{
	private Bilet bilet;
	
	
	
	public AdapterObiecteBilet(Bilet bilet) {
		super();
		this.bilet = bilet;
	}

	@Override
	public void vindeBiletOnline() {
		
		this.bilet.vinde();
	}

	@Override
	public void rezervaBiletOnline() {
		
		this.bilet.rezerva();
	} 

}
