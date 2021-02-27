package classes;

public class Girafa extends Animal{

	private int inaltime;
	
	public Girafa(String nume) {
		super(nume);
		this.inaltime=100;
	}

	public Girafa(String nume, int inaltime) {
		super(nume);
		this.inaltime = inaltime;
	}

	public int getInaltime() {
		return inaltime;
	}

	public void setInaltime(int inaltime) {
		this.inaltime = inaltime;
	}
	
	@Override
	public void merge() {
		System.out.println("Girafa merge cu capul pe sus");
	}

}
