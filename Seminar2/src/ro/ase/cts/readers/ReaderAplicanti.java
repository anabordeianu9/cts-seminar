package ro.ase.cts.clase.readers;

import java.io.FileNotFoundException;
import java.util.List;

import ro.ase.cts.clase.Aplicant;

public abstract class ReaderAplicanti {
	protected String fileName;
	
          public ReaderAplicanti(String fileName) {
		super();
		this.fileName = fileName;
	}
		public abstract List<Aplicant>readAplicanti(String fileName) throws FileNotFoundException;
		public List<Aplicant> readAplicanti() throws FileNotFoundException {
			// TODO Auto-generated method stub
			return null;
		}
      
}
