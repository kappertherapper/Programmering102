package Opgave1;

public class Person <T extends Comparable<T>> implements Comparable<Person<T>> {
    T name;

    public Person(T name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return name.toString();
    }

    @Override
    public int compareTo(Person<T> o) {
        int compare = (this.name.compareTo(o.name));
        return compare;
    }
}