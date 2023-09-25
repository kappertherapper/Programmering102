package Opgave1;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class UseMethodsWithHashSet {
    public static void main(String[] args) {
        Set<Integer> numbers = new HashSet<>(List.of(34, 12, 23, 45, 67, 34, 98));

        System.out.println(numbers);
        numbers.add(23);
        System.out.println("23 added: " + numbers);
        numbers.remove(67);
        System.out.println("67 removed: " + numbers);
        System.out.println("Does numbers contain '23'?: " + numbers.contains(23));

        int count = 0;
        for (int i = 0; i < numbers.size(); i++) {
            count++;
        }
        System.out.println("Count of numbers: " + count);
    }
}
