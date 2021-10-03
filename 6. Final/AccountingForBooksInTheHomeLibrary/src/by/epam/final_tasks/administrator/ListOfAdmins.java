package by.epam.final_tasks.administrator;

import java.util.ArrayList;

public class ListOfAdmins {
	private static ArrayList<Admin> listOfAdmins = new ArrayList<Admin>();

	public ListOfAdmins() {
	}

	public ListOfAdmins(Admin admin) {
		listOfAdmins.add(admin);
	}

	public static ArrayList<Admin> getListOfAdmins() {
		return listOfAdmins;
	}

	public static void setListOfAdmins(ArrayList<Admin> listOfAdmins) {
		ListOfAdmins.listOfAdmins = listOfAdmins;
	}
}
