package ro.ase.cts.state2.main;

import ro.ase.cts.state2.Masa;

public class Main {

	public static void main(String[] args) {
		Masa masa = new Masa(10);
		masa.elibereazaMasa();
		masa.ocupaMasa();
		masa.rezervaMasa();
		//masa.setStare(new StareLibera());
		//masa.rezervaMasa();
		masa.elibereazaMasa();
	}

}
