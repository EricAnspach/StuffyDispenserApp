package db;

import business.Stuffy;
import util.Console;

import java.util.ArrayList;

public class StuffyDB {

    ArrayList<Stuffy> stuffies = new ArrayList<>();

    public void populateStuffies() {
        stuffies.add(new Stuffy(1, "Cat", "Large", "Blue"));
        stuffies.add(new Stuffy(2, "Alien", "Small", "Purple"));
        stuffies.add(new Stuffy(3, "Bear", "Small", "Red"));
        stuffies.add(new Stuffy(4, "Alien", "Huge", "Green"));
        stuffies.add(new Stuffy(5, "Koala", "Large", "Yellow"));
        stuffies.add(new Stuffy(6, "Elephant", "Small", "Pink"));
        stuffies.add(new Stuffy(7, "Hippo", "Large", "Blue"));
        stuffies.add(new Stuffy(8, "Lion", "Small", "Orange"));
        stuffies.add(new Stuffy(9, "Tiger", "Large", "Orange"));
        stuffies.add(new Stuffy(10, "Tiger", "Small", "Green"));
    }

    public void grabStuffy(int i) {
        // need to change method to get id as parameter, and remove item with that id, not index
        Stuffy grabbedStuffy = stuffies.remove(i);
        Console.displayLine("Woo hoo! You got a " + grabbedStuffy.getColor() + ", " + grabbedStuffy.getSize()
                + " " + grabbedStuffy.getType() + "!");
    }

    public void addStuffy(Stuffy s) {
        stuffies.add(s);
        Console.displayLine("A ");
    }

    public int getStuffyListSize() {
        return stuffies.size();
    }

    public int getLastID() {
        int lastIndex = stuffies.size() - 1;
        Stuffy lastStuffy = stuffies.get(lastIndex);
        int lastID = lastStuffy.getId();
        return lastID;
    }

}
