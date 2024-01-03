package Collections;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class Library {
    private HashSet<Book> books;

    public Library() {
        this.books = new HashSet<>();
    }

    public void addBook(String title, String author, String isbn) {
        Book book = new Book(title, author, isbn);
        books.add(book);
    }

    public HashSet<Book> searchByAuthor(String author) {
        HashSet<Book> books = new HashSet<>();
        for (Book book : this.books) {
            if (book.getAuthor().equalsIgnoreCase(author)) {
                books.add(book);
            }
        }
        return books;
    }

    public HashSet<Book> searchByTitle(String title) {
        HashSet<Book> found = new HashSet<>();
        for (Book b : this.books) {
            if (b.getTitle().equalsIgnoreCase(title)) {
                found.add(b);
            }
        }
        return found;
    }

    public Boolean searching(String author, HashSet<Book> books) {
            if (books.contains(author)) {
                return true;
            } else {
                return false;
            }
    }
}


//    public static void main(String[] args) {
//        HashSet<Book> books = new HashSet<>(List.of(
//                new Book("Jungle bogen", "Tarzan", "34"),
//                new Book("Mindset", "Carol something", "55")));
//
//
//        Book now = new Book("Power of now", "Eckhart Tolle", "77");
//        books.add(now);
//        books.remove(now);
//
//    }
