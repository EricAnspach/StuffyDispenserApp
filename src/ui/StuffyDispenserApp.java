package ui;

import business.Stuffy;
import db.StuffyDB;
import util.Console;

public class StuffyDispenserApp {

	public static void main(String[] args) {
		StuffyDB stuffyDB = new StuffyDB();
		stuffyDB.populateStuffies();

		Console.displayLine("Welcome to the Stuffy Dispenser Application!\n");
		int option;

		do {
			Console.displayLine("\nMenu");
			Console.displayLine("1 - Grab Stuffy");
			Console.displayLine("2 - Add Stuffy");
			Console.displayLine("3 - Exit\n");

			option = Console.getInt("Enter option: ", 0, 4);

			switch (option) {
				case 1:
					// Grab stuffy
					// need to change method to get random id, rather than index
					int listSize = stuffyDB.getStuffyListSize();
					int stuffyID = (int)(Math.random() * listSize);
					stuffyDB.grabStuffy(stuffyID);
					break;
				case 2:
					// Add Stuffy
					Console.displayLine("New Stuffy...");
					String type = Console.getString("Type?    ");
					String size = Console.getString("Size?    ");
					String color = Console.getString("Color?   ");
					Stuffy stuffy = new Stuffy(stuffyDB.getLastID(), type, size, color);
					stuffyDB.addStuffy(stuffy);
					break;
				case 3:
					break;
			}

		} while (option != 3);
		Console.displayLine("\nBye!");
	}

}
