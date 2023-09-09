package Opgaver;

import java.util.ArrayList;
import java.util.List;

public class EvenNumbers {
    public static void main(String[] args) {
        List<Integer> numbers = List.of(2, 5, 3, 1, 3, 6, 7); {
            System.out.println("Amount of even number: " + evenSum(numbers));
        };
    }
    public static int evenSum(List<Integer> list) {
        return evenSum(list, 0);
    }
    private static int evenSum(List<Integer> list, int index ) {
        int count = 0;
        if (index == list.size()) {
            count = 0;
        }
        if (list.get(index) % 2 == 0) {
            count++;
             }
        return count;
    }
}
