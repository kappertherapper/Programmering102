package Bookstore;

import java.util.ArrayList;

public class Purchaser implements BookObserver {
    private final String name; // not empty
    private ArrayList<Book> books = new ArrayList<>();

    public Purchaser(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return name;
    }

    @Override
    public void update(Book book) {

    }
}

