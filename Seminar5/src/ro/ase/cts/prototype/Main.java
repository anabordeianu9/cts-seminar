package ro.ase.cts.prototype;

public class Main {

	public static void main(String[] args) {
		Client client1 = new Client("Marcel", 27);
		Client client2 = (Client) client1.copiaza();
		Copiator client3 = client2.copiaza();
		
		System.out.println(client1);
		System.out.println(client2);
		System.out.println(client3);
		
		Bilet bilet1 = new Bilet(23, "echipaA", "echipaB", "12:00");
		Bilet bilet2 = (Bilet) bilet1.copiaza();
		bilet2.setCod(24);
		Bilet bilet3= (Bilet) bilet1.copiaza();
		bilet3.setCod(25);
		
		System.out.println(bilet1);
		System.out.println(bilet2);
		System.out.println(bilet3);

	}

}
