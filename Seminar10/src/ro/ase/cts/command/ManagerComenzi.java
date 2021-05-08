package ro.ase.cts.command;

import java.util.ArrayList;
import java.util.List;

public class ManagerComenzi {
	List<ICommand> comenzi;

	public ManagerComenzi() {
		super();
		comenzi = new ArrayList<ICommand>();
	}
	
	public void invoca(ICommand comanda) {
		comenzi.add(comanda);
	}
	
	public void executaComanda() throws Exception {
		if(comenzi.size()>0) {
			comenzi.get(0).executa();
			comenzi.remove(0);
		} else {
			throw new Exception();
		}
		
	}
	
	public void executaComenzi() {
		for(ICommand c: comenzi) {
			c.executa();
		}
		comenzi.clear();
	}
}
