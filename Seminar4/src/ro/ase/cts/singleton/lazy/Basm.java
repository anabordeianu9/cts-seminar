package ro.ase.cts.singleton.lazy;

public class Basm {
	private String autor;
	private int anAparitie;
	private String titlu;
	private static Basm instanta = null;
	
	private Basm(String autor, int anAparitie, String titlu) {
		super();
		this.autor = autor;
		this.anAparitie = anAparitie;
		this.titlu = titlu;
	}
	public void setAutor(String autor) {
		this.autor = autor;
	}
	public void setAnAparitie(int anAparitie) {
		this.anAparitie = anAparitie;
	}
	public void setTitlu(String titlu) {
		this.titlu = titlu;
	}
	
	public static synchronized Basm getInstanta(String numeAutor, int an, String titlu) {
		if(instanta == null) {
			instanta =  new Basm(numeAutor, an, titlu);
		}
		return instanta;
	}
	
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Basm [autor=");
		builder.append(autor);
		builder.append(", anAparitie=");
		builder.append(anAparitie);
		builder.append(", titlu=");
		builder.append(titlu);
		builder.append("]");
		return builder.toString();
	}
	
}
