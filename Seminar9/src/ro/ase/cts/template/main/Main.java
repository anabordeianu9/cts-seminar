package ro.ase.cts.template.main;

import ro.ase.cts.template.Masa;
import ro.ase.cts.template.MasaBar;
import ro.ase.cts.template.TemplateOcupareMasa;

public class Main {

	public static void main(String[] args) {
		TemplateOcupareMasa masa = new Masa(22);
		masa.ocupaMasa();
		TemplateOcupareMasa masa2 = new MasaBar(25);
		masa.aseazaTacamuri();
		
	}

}
