package ro.ase.cts.decorator.program;

import ro.ase.cts.decorator.Card;
import ro.ase.cts.decorator.Decorator;
import ro.ase.cts.decorator.DecoratorContactlessTelefon;

public class Main {

	public static void main(String[] args) {
		Card visa = new Card("Maria",3000);
		visa.realizeazaPlataOnline(200);
		visa.realizeazaPlataNormala(300);
		
		Decorator cardNou = new Decorator(visa);
		cardNou.platesteContactless(400);
		cardNou.realizeazaPlataNormala(200);
		cardNou.realizeazaPlataOnline(100);
		
		DecoratorContactlessTelefon cardTelefon = new DecoratorContactlessTelefon(visa);
		cardTelefon.platesteContactless(100);

	}

}
