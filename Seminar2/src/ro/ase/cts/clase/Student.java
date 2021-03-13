package src.ro.ase.cts.clase;

import java.util.Arrays;

public class Student extends Aplicant {
	protected String facultate;
	protected int an_studii;
	private static int sumaFinantata = 20;
	
	
	public String getFacultate() {
		return facultate;
	}
	public void setFacultate(String facultate) {
		this.facultate = facultate;
	}
	public int getAn_studii() {
		return an_studii;
	}
	public void setAn_studii(int an_studii) {
		this.an_studii = an_studii;
	}


	public Student() {
		super();
		
	}
	
	public Student(String nume, String prenume, int varsta, int punctaj, int nr_proiecte, String[] denumireProiect, String facultate, int an_studii) {
		super(nume,prenume,varsta,punctaj,nr_proiecte,denumireProiect);
		this.facultate = facultate;
		this.an_studii = an_studii;
	}
	@Override
	public String toString() {
		StringBuilder stringBuilder = new StringBuilder("Student: ");
		stringBuilder.append(super.toString())
		.append(" An studii ").append(this.an_studii)
		.append(" Facultate ").append(this.facultate);
		return stringBuilder.toString();	}
	
	
	public void afisareSumaFinantata() {
		System.out.println(super.compunereStringPentruSumaFinantata(this.sumaFinantata, "Studentul"));

	}
	
	
}
