package ro.ase.cts.chain;

public class ContCredit extends Cont{

	public ContCredit(float sold, String iban) {
		super(sold, iban);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void plateste(float suma) {
		if(super.getSold()>=suma) {
			super.setSold(super.getSold()-suma);
			System.out.println("S-a realizat plata in valoare de "+suma+" din contul de credit");
		} else {
			if(super.getNext()!=null) {
				super.getNext().plateste(suma);
			} else {
				System.out.println("Plata refuzata");
			}
		}
	}

}
