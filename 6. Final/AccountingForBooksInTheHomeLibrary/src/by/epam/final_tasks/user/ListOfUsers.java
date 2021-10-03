package by.epam.final_tasks.user;

import java.util.ArrayList;
import java.io.File;
import java.io.PrintWriter;
import java.io.FileNotFoundException;

public class ListOfUsers {
	private static ArrayList<User> listOfUsers = new ArrayList<User>();

	public ListOfUsers() {
	}

	public ListOfUsers(User user) throws FileNotFoundException {
		listOfUsers.add(user);
		String stringUserData = "";

		stringUserData += "User " + user.getId() + "\nName: " + user.getName() + "\nEmail adress: "
				+ user.getEmailAdress() + "\n";

		File userData = new File("UserData");
		PrintWriter pw = new PrintWriter(userData);
		pw.print(stringUserData);
		pw.close();
	}

	public static ArrayList<User> getListOfUsers() {
		return listOfUsers;
	}

	public static void setListOfUsers(ArrayList<User> listOfUsers) {
		ListOfUsers.listOfUsers = listOfUsers;
	}
}
