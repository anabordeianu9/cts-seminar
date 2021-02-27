package ro.ase.cts;

import classes.Animal;
import classes.Girafa;
import classes.Zebra;
import classes.Zoo;

public class Main {

	public static void main(String[] args) {
		Zoo zoo = new Zoo();
		Animal z1 = new Zebra("Monica");
		Animal z2 = new Zebra("Costel");
		Animal g1 = new Girafa("Ionica");
		Animal g2 = new Girafa("Marcel",400);
		
		zoo.adaugareAnimal(z1);
		zoo.adaugareAnimal(z2);
		zoo.adaugareAnimal(g1);
		zoo.adaugareAnimal(g2);
		
		zoo.feedAnimals();

	}

}
