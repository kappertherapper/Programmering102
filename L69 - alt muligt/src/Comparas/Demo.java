package Comparas;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Demo {
    public static void main(String[] args) {
        Person per = new Person("Per", 45);
        Person ole = new Person("Ole", 77);
        Person pia = new Person("Pia", 33);
        Person karsten = new Person("Karten", 46);

        List<Person> persons = new ArrayList<>(List.of(per, ole, pia, karsten));

        Collections.sort(persons);
        System.out.println("Sorted on age (comparable): " + persons);


        Comparator nameComparator = new Animal.AnimalComparator();
        Collections.sort(persons, nameComparator);
        System.out.println("Sorted by name (comparator)" + persons);
    }
}
