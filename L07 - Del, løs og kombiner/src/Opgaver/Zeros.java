package Opgaver;

import java.util.ArrayList;
import java.util.List;

public class Zeros {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>(List.of(1, 0, 1, 3, 1, 7, 9, 0, 0));
        System.out.println(zero(numbers));
    }

    public static int zero(ArrayList<Integer> list) {
        return zero(list, 0, list.size() - 1);
    }

    private static int zero(ArrayList<Integer> list, int low, int high) {
        if (low == high) {
            if (list.get(low) == 0) {
                return 1;
            } else {
                return 0;
        }

        } else {
            int middle = (low + high) / 2;
            int zero1 = zero(list, low, middle);
            int zero2 = zero(list, middle + 1, high);
            return zero1 + zero2;
        }
    }
}
