package Comparas;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Animal implements Comparable<Animal> {
    String race;
    int weight;
    int birthYear;

    public Animal(String race, int weight, int birthYear) {
        this.race = race;
        this.weight = weight;
        this.birthYear = birthYear;
    }

    public int getWeight() {
        return weight;
    }

    @Override
    public String toString() {
        return "\n" + "Race: " + race + ", Weight: " + weight + ", BirthYear: " + birthYear;
    }

    @Override
    public int compareTo(Animal o) {
        int compare = this.race.compareTo(o.race);
        if (compare == 0) {
            compare = Integer.compare(this.weight, o.weight);
        } else if (compare == 0) {
            compare = Integer.compare(this.birthYear, o.birthYear);
        }
        return compare;
    }

    static class AnimalComparator implements Comparator<Animal> {
        int count = 0;

        @Override
        public int compare(Animal o1, Animal o2) {
            count++;
            int compare = Integer.compare(o1.weight, o2.weight);
            if (compare == 0) {
                compare = Integer.compare(o1.birthYear, o2.birthYear);
            }
            return compare;
        }

        public int getCount() {
            return count;
        }
    }

    static List<Animal> twoBiggestAnimals(List<Animal> animals, Comparator<Animal> comparator) {
        if (animals.isEmpty() || animals.size() < 2) {
            throw new IllegalArgumentException("List do not contain two animals");
        }

        Animal biggest = null;
        Animal secondBiggest = null;

        for (Animal animal : animals) {
            if (biggest == null || comparator.compare(biggest, animal) <= 0) {
                secondBiggest = biggest;
                biggest = animal;
            }
        }

        List<Animal> twoBiggestAnimals = new ArrayList<>();
        twoBiggestAnimals.add(secondBiggest);
        twoBiggestAnimals.add(biggest);

        return twoBiggestAnimals;
    }
}
