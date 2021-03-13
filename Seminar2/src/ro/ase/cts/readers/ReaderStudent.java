package ro.ase.cts.clase.readers;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import ro.ase.cts.clase.Aplicant;
import ro.ase.cts.clase.Student;

public class ReaderStudent extends ReaderAplicanti {
	
	
	public ReaderStudent(String fileName) {
		super(fileName);
		// TODO Auto-generated constructor stub
	}

	@Override
	public List<Aplicant> readAplicanti() throws FileNotFoundException {
		Scanner input = new Scanner(new File(super.fileName));
		input.useDelimiter(",|\n");
		List<Aplicant> studenti = new ArrayList<Aplicant>();

		while (input.hasNext()) {
			Student student = new Student();
			super.citesteAplicant(input, studenti);
			int an_studii = input.nextInt();
			String facultate = (input.next()).toString();
			studenti.setAn_studii(an_studii);
			studenti.setFacultate(facultate);
			studenti.add(student);
		}
		input.close();
		return studenti;
	}

	@Override
	public List<Aplicant> readAplicanti(String fileName) throws FileNotFoundException {
		// TODO Auto-generated method stub
		return null;
	}

	}



