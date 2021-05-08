package ro.ase.cts.command.main;

import ro.ase.cts.command.ComandaConstituire;
import ro.ase.cts.command.ComandaDepunere;
import ro.ase.cts.command.ComandaRetragere;
import ro.ase.cts.command.ContBancar;
import ro.ase.cts.command.ManagerComenzi;

public class Main {

	public static void main(String[] args) {
		
		try {
			ManagerComenzi managerComenzi = new ManagerComenzi();
			ContBancar cont = new ContBancar("RO4567", 0);
			
			managerComenzi.invoca(new ComandaConstituire(cont, 1000));
			managerComenzi.invoca(new ComandaDepunere(cont, 500));
			
			managerComenzi.executaComanda();
			
			managerComenzi.invoca(new ComandaRetragere(cont, 900));
			managerComenzi.invoca(new ComandaRetragere(cont, 700));
			
			managerComenzi.executaComenzi();
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
