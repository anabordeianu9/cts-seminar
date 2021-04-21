package ro.ase.cts.state2;

public class StareOcupata implements State{

	@Override
	public void modificaStare(Masa masa) {
		if(!(masa.getStare() instanceof StareOcupata)) {
			System.out.println("Masa cu codul "+masa.getCod()+" a fost ocupata!");
			masa.setStare(this);
		} else {
			System.out.println("Masa nu poate fi ocupata!");
		}
	}

}
