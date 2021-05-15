package ro.ase.cts.memento;

public class MeciJucat {
	private String numeEchipaGazda;
	private String numeEchipaOaspeti;
	private int nrBileteVandute;
	private int nrSpectatori;
	private int numarJandarmi;
	private int numarStewarzi;
	
	public MeciJucat(String numeEchipaGazda, String numeEchipaOaspeti, int nrBileteVandute, int nrSpectatori,
			int numarJandarmi, int numarStewarzi) {
		super();
		this.numeEchipaGazda = numeEchipaGazda;
		this.numeEchipaOaspeti = numeEchipaOaspeti;
		this.nrBileteVandute = nrBileteVandute;
		this.nrSpectatori = nrSpectatori;
		this.numarJandarmi = numarJandarmi;
		this.numarStewarzi = numarStewarzi;
	}
	
	public void setNumeEchipaGazda(String numeEchipaGazda) {
		this.numeEchipaGazda = numeEchipaGazda;
	}

	public void setNumeEchipaOaspeti(String numeEchipaOaspeti) {
		this.numeEchipaOaspeti = numeEchipaOaspeti;
	}

	public void setNrBileteVandute(int nrBileteVandute) {
		this.nrBileteVandute = nrBileteVandute;
	}

	public void setNrSpectatori(int nrSpectatori) {
		this.nrSpectatori = nrSpectatori;
	}

	public void setNumarJandarmi(int numarJandarmi) {
		this.numarJandarmi = numarJandarmi;
	}

	public void setNumarStewarzi(int numarStewarzi) {
		this.numarStewarzi = numarStewarzi;
	}
	
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("MeciJucat [numeEchipaGazda=");
		builder.append(numeEchipaGazda);
		builder.append(", numeEchipaOaspeti=");
		builder.append(numeEchipaOaspeti);
		builder.append(", nrBileteVandute=");
		builder.append(nrBileteVandute);
		builder.append(", nrSpectatori=");
		builder.append(nrSpectatori);
		builder.append(", numarJandarmi=");
		builder.append(numarJandarmi);
		builder.append(", numarStewarzi=");
		builder.append(numarStewarzi);
		builder.append("]");
		return builder.toString();
	}

	public Memento creareMemento() {
		Memento memento = new Memento(this.numeEchipaGazda, this.numeEchipaOaspeti, this.nrSpectatori);
		return memento;
	}

	public void setMemento(Memento memento) {
		this.numeEchipaGazda = memento.getNumeEchipaGazda();
		this.numeEchipaOaspeti = memento.getNumeEchipaOaspeti();
		this.nrSpectatori = memento.getNrSpectatori();
	}
}
