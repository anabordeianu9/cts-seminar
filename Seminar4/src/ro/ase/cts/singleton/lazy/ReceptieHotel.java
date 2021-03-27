package ro.ase.cts.singleton.lazy;

public class ReceptieHotel {
	private String numeReceptioner;
	private int etaj;
	private String numeHotel;
	//lazy initialization
	private static ReceptieHotel instanta = null;
	
	//trebuie sa avem constructorii privati - clasa singleton
	public ReceptieHotel(String numeReceptioner, int etaj, String numeHotel) {
		super();
		this.numeReceptioner = numeReceptioner;
		this.etaj = etaj;
		this.numeHotel = numeHotel;
	}
	
	public void setNumeReceptioner(String numeReceptioner) {
		this.numeReceptioner = numeReceptioner;
	}
	public void setEtaj(int etaj) {
		this.etaj = etaj;
	}
	public void setNumeHotel(String numeHotel) {
		this.numeHotel = numeHotel;
	}

	//returneaza instanta initializata la inceput
	public static synchronized ReceptieHotel getInstanta(String numeReceptioner, int etaj, String numeHotel) {
		if(instanta == null) {
			instanta =  new ReceptieHotel(numeReceptioner,etaj,numeHotel);
		}
		return instanta;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("ReceptieHotel [numeReceptioner=");
		builder.append(numeReceptioner);
		builder.append(", etaj=");
		builder.append(etaj);
		builder.append(", numeHotel=");
		builder.append(numeHotel);
		builder.append("]");
		return builder.toString();
	}

}
