package ro.ase.cts.clase.readers;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import ro.ase.cts.clase.Aplicant;
import ro.ase.cts.clase.Elev;

public class ReaderElev extends ReaderAplicanti {


	public ReaderElev(String fileName) {
		super(fileName);
		// TODO Auto-generated constructor stub
	}

	@Override
	public List<Aplicant> readAplicanti() throws FileNotFoundException {
		Scanner input2 = new Scanner(new File(super.fileName));
		input2.useDelimiter(",|\n");
		List<Aplicant> elevi = new ArrayList<Aplicant>();

		while (input2.hasNext()) {
			Elev elev = new Elev();
			super.citesteAplicant(input2, elev);
			int clasa = input2.nextInt();
			String tutore = input2.next();
			elevi.setClasa(clasa);
			elevi.setTutore(tutore);
			elevi.add(elev);
		}

		input2.close();
		return elevi;
	}

	@Override
	public List<Aplicant> readAplicanti(String fileName) throws FileNotFoundException {
		// TODO Auto-generated method stub
		return null;
	}
	}


