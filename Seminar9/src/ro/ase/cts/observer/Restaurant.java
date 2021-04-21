package ro.ase.cts.observer;

import java.util.List;

public class Restaurant implements Observabil{
	private List<Observer> observerList;
	private String nume;
	private String adresa;

	public Restaurant(String nume, String adresa) {
		super();
		this.nume = nume;
		this.adresa = adresa;
	}

	@Override
	public void adaugaObserver(Observer observer) {
		this.observerList.add(observer);
	}

	@Override
	public void stergeObserver(Observer observer) {
		this.observerList.remove(observer);
	}

	@Override
	public void trimiteMesaj(String mesaj) {
		for(Observer observer: this.observerList) {
			observer.primesteMesaj("Restaurantul "+this.nume+" de la adresa "+this.adresa+" va trimite urmatorul mesaj: "+mesaj);
		}
	}
	
	public void realizareOfertaPret() {
		trimiteMesaj("S-a realizat o oferta de pret");
	}
	
	public void introducereMeniu() {
		trimiteMesaj("S-a introdus un nou meniu");
	}

}
