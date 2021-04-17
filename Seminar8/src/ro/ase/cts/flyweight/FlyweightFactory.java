package ro.ase.cts.flyweight;

import java.util.HashMap;

public class FlyweightFactory {
	private HashMap<String, Client> map;

	public FlyweightFactory() {
		super();
		this.map = new HashMap<>();
	}
	
	public Client getClient(String nrTelefon) {
		Client client;
		client = map.get(nrTelefon);
		if(map.get(nrTelefon) == null) {
			client = new Client("Ion", nrTelefon, "ion@gmail.com");
			map.put(nrTelefon, client);
		}
		return client;
	}
}
