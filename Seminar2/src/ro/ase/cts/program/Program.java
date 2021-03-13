package src.ro.ase.cts.program;

import java.io.FileNotFoundException;
import java.util.List;


import src.ro.ase.cts.clase.Aplicant;
import src.ro.ase.cts.readers.ReaderAngajat;
import src.ro.ase.cts.readers.ReaderAplicanti;


public class Program {
	
	public static List<Aplicant> citesteAplicanti(ReaderAplicanti reader) throws FileNotFoundException{
		List<Aplicant> listaAplicanti=reader.readAplicanti();
		return listaAplicanti;
	}
	

	public static void main(String[] args) {
		List<Aplicant> listaAplicanti;
		try {
			listaAplicanti = citesteAplicanti(new ReaderAngajat("angajati.txt"));
			for(Aplicant aplicant:listaAplicanti) {
				System.out.println(aplicant.toString());
				aplicant.afisareSumaFinantata();
			}
				
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
