package ui;

import business.Stuffy;
import db.StuffyDB;
import util.Console;

import java.util.ArrayList;

public class StuffyDispenserApp {

	public static void main(String[] args) {

		Console.displayLine("Welcome to the Stuffy Dispenser Application!\n");

		ArrayList<Stuffy> stuffies = new ArrayList<>();



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
					int stuffyID = (int)(Math.random() * )

					break;
				case 2:
					// Add Stuffy

					Console.displayLine("New Stuffy...");
					Console.getString("Type?    ");
					Console.getString("Size?    ");
					Console.getString("Color?   ");



					break;
				case 3:
					break;
			}

		} while (option != 3);
		Console.displayLine("\nBye!");
	}

}
