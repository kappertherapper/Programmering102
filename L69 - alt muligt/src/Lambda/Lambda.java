package Lambda;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Lambda {
    public static void main(String[] args) {

        //Filter
        List<String> words = new ArrayList<>(List.of("newbalance", "nike", "adidas", "yeezy", "jordan", "salamon"));

        List<String> filterN = words.stream().filter(s -> s.startsWith("n")).collect(Collectors.toList());
        System.out.println("List: " + words);
        System.out.println("List only with N words: " + filterN);

        System.out.println();

        //Foreach
        List<Integer> numbers = new ArrayList<>(List.of(1, 6, 5, 2, 3, 5, 8));
        System.out.println("Print all numbers: ");
        numbers.forEach(n -> System.out.println(n));

        System.out.println();

        List<Integer> moreNumbers = new ArrayList<>(List.of(1, 2, 3, 4, 5));
        List<String> numbersToString = moreNumbers.stream().map(n -> n.toString()).collect(Collectors.toList());
        System.out.println(numbersToString);

        List<Person> persons = new ArrayList<>(List.of(
                new Person("Bob", 24),
                new Person("Jolle", 5),
                new Person("Gulle", 69)));

        // Sorted after age
        persons.sort((Person p1, Person p2) -> p1.age - p2.age);
        System.out.println(persons);

        System.out.println();

        List<Integer> evenMoreNumbers = new ArrayList<>(List.of(1, 2, 3, 4, 5));
        int result = evenMoreNumbers.stream().mapToInt(Integer::intValue).sum();
        System.out.println("Sum is: " + result);

        List<Integer> listOfNumbers = new ArrayList<>(List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10));
        List<Integer> sortedList = listOfNumbers.stream().filter(n -> n > 4).collect(Collectors.toList());
        System.out.println("List of numbers: " + listOfNumbers);
        System.out.println("Numbers bigger then 4: " + sortedList);

    }
}
