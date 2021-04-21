package ro.ase.cts.observer.main;

import ro.ase.cts.observer.Client;
import ro.ase.cts.observer.Restaurant;

public class Main {

	public static void main(String[] args) {
		
		Restaurant restaurant = new Restaurant("restaurant", "bucuresti");
		Client c1 = new Client("Ion");
		Client c2 = new Client("Ioana");
		Client c3 = new Client("Matei");
		
		restaurant.adaugaObserver(c1);
		restaurant.adaugaObserver(c2);
		
		restaurant.realizareOfertaPret();
		
		restaurant.stergeObserver(c2);
		restaurant.adaugaObserver(c3);
		
		restaurant.introducereMeniu();
	}

}
