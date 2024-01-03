package Collections;

import java.util.HashSet;
import java.util.List;
import java.util.Scanner;

public class Demo {
    public static void main(String[] args) {
        Library library = new Library();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Library Management System");
            System.out.println("1. Add Book");
            System.out.println("2. Search by Title");
            System.out.println("3. Search by Author");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");

            int choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1:
                    System.out.println("Enter title");
                    String titleb = scanner.nextLine();
                    System.out.println("Enter author");
                    String authorb = scanner.nextLine();
                    System.out.println("Enter isbn");
                    String isbn = scanner.nextLine();
                    System.out.println("Book added \n");
                    library.addBook(titleb, authorb, isbn);
                    break;

                case 2:
                    System.out.print("Enter title: ");
                    String title = scanner.nextLine();
                    HashSet<Book> booksByTitle = library.searchByTitle(title);
                    System.out.println(booksByTitle);
                    break;

                case 3:
                    System.out.print("Enter author: ");
                    String author = scanner.nextLine();
                    HashSet<Book> booksByAuthor = library.searchByAuthor(author);
                    System.out.println(booksByAuthor);
                    break;

                case 4:
                    System.out.println("Exiting...");
                    return;

                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }
}
