package Comparas;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Animal> animals = new ArrayList<>();

        animals.add(new Animal("Elephant", 1200, 2010));
        animals.add(new Animal("Tiger", 150, 2012));
        animals.add(new Animal("Zebra", 400, 2015));
        animals.add(new Animal("Giraffe", 800, 2013));
        animals.add(new Animal("Elephant", 1200, 2010));
        animals.add(new Animal("Tiger", 150, 2012));
        animals.add(new Animal("Zebra", 400, 2015));
        animals.add(new Animal("Giraffe", 800, 2013));
        animals.add(new Animal("Lion", 190, 2011));
        animals.add(new Animal("Kangaroo", 85, 2016));
        animals.add(new Animal("Panda", 100, 2018));
        animals.add(new Animal("Horse", 500, 2014));
        animals.add(new Animal("Wolf", 60, 2013));
        animals.add(new Animal("Bear", 300, 2012));
        animals.add(new Animal("Dinosaur", 1300, 2010));

        System.out.println("Original list: " + animals);
        System.out.println();

        Collections.sort(animals);
        System.out.println("Animals now sorted by race (weight, birth):  (comparable) " + animals);

        System.out.println();
        System.out.println();

        Animal.AnimalComparator comparator = new Animal.AnimalComparator();
        Collections.sort(animals, comparator);
        System.out.println("Animals now sorted by weight (birth):  (comparator) " + animals);
        System.out.println("Counts of compares: " + comparator.getCount());

        System.out.println();
        System.out.println();

        System.out.println("Two biggest animals: " + Animal.twoBiggestAnimals(animals, comparator));
    }
}
