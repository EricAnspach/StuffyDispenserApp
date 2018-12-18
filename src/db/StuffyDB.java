package db;

import business.Stuffy;

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

    public void grabStuffy(int) {

    }

    public void addStuffy(Stuffy) {

    }

}
