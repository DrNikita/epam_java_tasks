package by.epam.final_tasks.email;

import java.util.ArrayList;

public class Network {
	private static ArrayList<Email> network = new ArrayList<Email>();

	public Network() {
	}

	public Network(Email email) {
		this.network.add(email);
	}

	public static ArrayList<Email> getNetwork() {
		return network;
	}

	public static void setNetwork(ArrayList<Email> network) {
		Network.network = network;
	}
}
