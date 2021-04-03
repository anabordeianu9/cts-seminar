package ro.ase.cts.builder;

public class RezervareBuilder implements AbstractBuilder{

	private Rezervare rezervare;
	
	public RezervareBuilder() {
		super();
		this.rezervare = new Rezervare(0,false,false,false,false,"");
	}
	
	public RezervareBuilder(int cod) {
		this.rezervare = new Rezervare(cod,false,false,false,false,"");
		// sau constructor fara parametri si apelam setter
	}
	
	public RezervareBuilder setCodRezervare(int codRezervare) {
		rezervare.setCodRezervare(codRezervare);
		return this;
	}


	public RezervareBuilder setAreMancareInclusa(boolean areMancareInclusa) {
		rezervare.setAreMancareInclusa(areMancareInclusa);
		return this;
	}


	public RezervareBuilder setAreBauturaInclusa(boolean areBauturaInclusa) {
		rezervare.setAreBauturaInclusa(areBauturaInclusa);
		return this; 
	}


	public RezervareBuilder setAreScaunErgonomic(boolean areScaunErgonomic) {
		rezervare.setAreScaunErgonomic(areScaunErgonomic);
		return this;
	}


	public RezervareBuilder setAreMuzicaAmbientala(boolean areMuzicaAmbientala) {
		rezervare.setAreMuzicaAmbientala(areMuzicaAmbientala);
		return this;
	}


	public RezervareBuilder setGenMuzical(String genMuzical) {
		rezervare.setGenMuzical(genMuzical);
		return this;
	}
	

	@Override
	public Rezervare build() {
		
		return this.rezervare;
	}

}
