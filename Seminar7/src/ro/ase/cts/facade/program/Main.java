package ro.ase.cts.facade.program;

import ro.ase.cts.facade.BirouDeCredite;
import ro.ase.cts.facade.Persoana;
import ro.ase.cts.facade.Politie;
import ro.ase.cts.facade.VerificatorPersoana;

public class Main {

	public static void main(String[] args) {
		
		Persoana persoana = new Persoana("Gigel","1990412125711");
		
		if(persoana.getVarsta()>=18) {
			if(!Politie.esteUrmarit(persoana)) {
				BirouDeCredite birou = new BirouDeCredite();
				if(!birou.areCredite(persoana)) {
					System.out.println("S-a creat contul");
				}
			}
		}
		
		Persoana persoana2 = new Persoana("Marian","1990022123113");
		if(VerificatorPersoana.verificaPersoana(persoana2)) {
			System.out.println("s-a creat contul");
		}else {
			System.out.println("ne pare rau :(!");
		}

	}

}
