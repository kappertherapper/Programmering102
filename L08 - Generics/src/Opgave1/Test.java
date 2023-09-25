package Opgave1;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class Test {
    public static void main(String[] args) {
        Person<String> Kasper = new Person<>("Kasper");
        Person<String> Zimmer = new Person<>("Zimmer");
        Person<String> Remy = new Person<>("Remy");

        FullName fullNameLukas = new FullName("Lukas", "Ingolf");
        Person Lukas = new Person<>(fullNameLukas);

        FullName fullNameWolf = new FullName("Jakob", "Wolf");
        Person Wolf = new Person<>(fullNameWolf);

        FullName fullNameAnd = new FullName("And", "DenTredje");
        Person And = new Person<>(fullNameAnd);


        ArrayList<Person<FullName>> persons = new ArrayList<>();
        persons.add(Lukas);
        persons.add(Wolf);
        persons.add(And);

        System.out.println("Unsorted");
        for (int i = 0; i < persons.size(); i++) {
            System.out.println(persons.get(i));
        }

        System.out.println();
        Collections.sort(persons);
        System.out.println();

        System.out.println("Sorted");
        for (int i = 0; i < persons.size(); i++) {
            System.out.println(persons.get(i));
        }


        //Person<FullName> Lukas = new Person<>(fullNameLukas);
        //System.out.println(Lukas);
    }
}
