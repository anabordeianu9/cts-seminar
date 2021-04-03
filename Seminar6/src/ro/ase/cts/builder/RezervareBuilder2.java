package ro.ase.cts.builder;

public class RezervareBuilder2 implements AbstractBuilder{

	private int codRezervare;
	private boolean areMancareInclusa;
	private boolean areBauturaInclusa;
	private boolean areScaunErgonomic;
	private boolean areMuzicaAmbientala;
	private String genMuzical;
	
	public RezervareBuilder2() {
		this.codRezervare=0;
		this.areBauturaInclusa=false;
		this.areMancareInclusa=false;
		this.areMuzicaAmbientala=false;
		this.areScaunErgonomic=false;
		this.genMuzical="";
	}
	
	
	
	public RezervareBuilder2 setCodRezervare(int codRezervare) {
		this.codRezervare = codRezervare;
		return this;
	}



	public RezervareBuilder2 setAreMancareInclusa(boolean areMancareInclusa) {
		this.areMancareInclusa = areMancareInclusa;
		return this;
	}



	public RezervareBuilder2 setAreBauturaInclusa(boolean areBauturaInclusa) {
		this.areBauturaInclusa = areBauturaInclusa;
		return this;
	}



	public RezervareBuilder2 setAreScaunErgonomic(boolean areScaunErgonomic) {
		this.areScaunErgonomic = areScaunErgonomic;
		return this;
	}



	public RezervareBuilder2 setAreMuzicaAmbientala(boolean areMuzicaAmbientala) {
		this.areMuzicaAmbientala = areMuzicaAmbientala;
		return this;
	}



	public RezervareBuilder2 setGenMuzical(String genMuzical) {
		this.genMuzical = genMuzical;
		return this;
	}



	@Override
	public Rezervare build() {
		return new Rezervare(codRezervare,areMancareInclusa,areBauturaInclusa,areScaunErgonomic,areMuzicaAmbientala, genMuzical);
	}
}
