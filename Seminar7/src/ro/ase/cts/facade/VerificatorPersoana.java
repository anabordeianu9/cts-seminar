package ro.ase.cts.facade;

public class VerificatorPersoana {
	
	public static boolean verificaPersoana(Persoana persoana) {
		if(persoana.getVarsta()>=18) {
			if(!Politie.esteUrmarit(persoana)) {
				BirouDeCredite birou = new BirouDeCredite();
				if(!birou.areCredite(persoana)) {
					return true;
				}
			}
		}
		return false;
	}

}
