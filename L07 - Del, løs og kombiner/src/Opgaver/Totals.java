package Opgaver;

import java.util.ArrayList;
import java.util.List;

public class Totals {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>(List.of(1, 2, 1, 3, 1, 7, 9));
        System.out.println(total(numbers));
    }

    public static int total(ArrayList<Integer> list) {
        return total(list, 0, list.size() - 1);
    }

    private static int total(ArrayList<Integer> list, int low, int high) {
        if (low == high) {
            return list.get(low);

        } else {
            int middle = (low + high) / 2;
            int sum1 = total(list, low, middle);
            int sum2 = total(list,middle + 1, high);

            return sum1 + sum2;
        }
    }
}


//    private static int total(ArrayList<Integer> list, int low, int high) {
//        if (low == high) {
//            return list.get(low);
//
//        } else {
//            int middle = (low + high) / 2;
//            int sum1 = 0;
//            int sum2 = 0;
//
//            for (int i = 0; i <= middle; i++) {
//                sum1 += list.get(i);
//            }
//
//            for (int i = middle + 1; i <= high; i++) {
//                sum2 += list.get(i);
//            }
//
//            int sum = sum1 + sum2;
//            return sum;
//        }
//    }
