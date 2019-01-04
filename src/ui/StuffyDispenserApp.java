package ui;

import business.Stuffy;
import db.StuffyDB;
import util.Console;

import java.util.ArrayList;

public class StuffyDispenserApp {

	public static void main(String[] args) {
		StuffyDB stuffyDB = new StuffyDB();
		stuffyDB.populateStuffies();

		ArrayList<Integer> stuffyIDs = new ArrayList<>();
		int highestID = 0;
		for (int i =0; i < stuffyDB.getStuffyListSize(); i++) {
			stuffyIDs.add(i + 1);
			highestID++;
		}

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
					int listSize = stuffyDB.getStuffyListSize();
					if (listSize == 0) {
						Console.displayLine("There are no stuffies in the dispenser.\n" +
								"Some stuffies must be added before any can be grabbed.");
						break;
					} else {
						int size = stuffyIDs.size();
						int stuffyIndex = (int)((Math.random() * size)-1);
						int stuffyID = stuffyIDs.remove(stuffyIndex);
						stuffyDB.grabStuffy(stuffyID);
						break;
					}
				case 2:
					// Add Stuffy
					Console.displayLine("New Stuffy...");
					highestID++;
					String type = Console.getString("Type?    ");
					String size = Console.getString("Size?    ");
					String color = Console.getString("Color?   ");
					Stuffy stuffy = new Stuffy(highestID, type, size, color);
					stuffyDB.addStuffy(stuffy);
					stuffyIDs.add(highestID);
					break;
				case 3:
					break;
			}
			
		} while (option != 3);
		Console.displayLine("\nBye!");
	}
}
