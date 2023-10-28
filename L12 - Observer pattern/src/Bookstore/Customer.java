package Bookstore;

import java.util.ArrayList;

public class Customer {
    private final String name; // not empty
    private ArrayList<Book> books = new ArrayList<>();

    public Customer(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return name;
    }
}
