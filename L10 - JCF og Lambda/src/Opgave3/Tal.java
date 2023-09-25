package Opgave3;

import java.util.*;

public class Tal {
    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>(
                List.of(4, 5, 8, 9, 1, 2, 5, 6));



        Iterator<Integer> iterator = numbers.iterator();

        while (iterator.hasNext()) {
            Integer number = iterator.next();
            System.out.println(number);
        }
    }
}
