package Opgave1;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class Ex1 {

    public static void main(String[] args) {
        List<Person> persons = List.of(
                new Person("Bent", 25),
                new Person("Susan", 34),
                new Person("Mikael", 60),
                new Person("Klaus", 44),
                new Person("Kasper", 44),
                new Person("Birgitte", 17),
                new Person("Liselotte", 9)
        );

        System.out.println("All persons: " + persons);
        System.out.println();

        // Find the first person in the persons list with an age of 44.
        Person fortyFour = findFirst(persons, person -> person.getAge() == 44);

        // Find the first person in the persons list with a name starting with 'S'.
        Person s = findFirst(persons, person -> person.getName().startsWith("S"));

        // Find the first person in the persons list with a name containing more than one ’i’.
        Person i = findFirst(persons, person -> person.getName().contains("i"));

        // Find the first person in the persons list with an age equal to the length of the name.
        Person first = findFirst(persons, person -> person.getAge() == person.getName().length());



        //Testing
        System.out.println("All persons: ");
        persons.forEach(System.out::println);
        System.out.println();

        System.out.println("first person in the persons list with an age of 44: " + fortyFour);
        System.out.println();
        System.out.println("first person in the persons list with a name starting with 'S': " + s);
        System.out.println();
        System.out.println("first person in the persons list with a name containing more than one ’i’: " + i);
        System.out.println();
        System.out.println("first person in the persons list with an age equal to the length of the name: " + first);

        System.out.println(); //
        System.out.println(); //

        // Find all persons with name containing the letter 'i'.
        List<Person> iAll = findAll(persons, person -> person.getName().contains("i"));

        // Find all persons with name starting with 'S'.
        List<Person> sAll = findAll(persons, person -> person.getName().startsWith("S"));

        // Find all persons with name of length 5
        List<Person> fortyFourAll = findAll(persons, person -> person.getName().length() == 5);

        // Find all persons with name of length at least 6 and age below 40.
        List<Person> sexBelowForty = findAll(persons, person -> person.getName().length() > 6 && person.getAge() < 40);


        //Testing
        System.out.println("Find all persons with name containing the letter 'i': " + iAll);
        System.out.println();
        System.out.println("Find all persons with name starting with 'S': " + sAll);
        System.out.println();
        System.out.println("Find all persons with name of length 5: " + fortyFourAll);
        System.out.println();
        System.out.println("Find all persons with name of length at least 6 and age below 40: " + sexBelowForty);

    }

    /**
     * Returns from the list the first person
     * that satisfies the predicate.
     * Returns null, if no person satisfies the predicate.
     */
    public static Person findFirst(List<Person> list, Predicate<Person> filter) {
        for (Person p : list) {
            if (filter.test(p))
                return p;
        }
        return null;
    }

    public static List<Person> findAll(List<Person> list, Predicate<Person> filter) {
        List<Person> persons = new ArrayList<>();
        for (Person p : list) {
            if (filter.test(p)) {
                persons.add(p);
            }
        }
        return persons;
    }
}
