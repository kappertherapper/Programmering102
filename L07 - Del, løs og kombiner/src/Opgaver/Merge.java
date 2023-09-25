package Opgaver;

import java.util.ArrayList;
import java.util.List;

public class Merge {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>(List.of(5, 3, 1, 5, 3, 9, 6, 1, 10, 66, 5));
        mergesort(numbers);
        System.out.println(numbers);
    }

    public static void mergesort(ArrayList<Integer> list) {
        mergesort(list, 0, list.size() - 1);
    }

    private static void mergesort(ArrayList<Integer> list, int low, int high) {
        if (low < high) {
            int middle = (low + high) / 2;
            mergesort(list, low, middle);
            mergesort(list, middle + 1, high);
            merge(list, low, middle, high);
        }
    }

    private static void merge(ArrayList<Integer> list, int low, int middle, int high) {
        ArrayList<Integer> temp = new ArrayList<>();
        int i1 = low;
        int i2 = middle + 1;

        while (i1 <= middle && i2 <= high) {
            if (list.get(i1) <= list.get(i2)) {
                temp.add(list.get(i1));
                i1++;

            } else {
                temp.add(list.get(i2));
                i2++;
            }
        }

        while (i1 <= middle) {
            temp.add(list.get(i1));
            i1++;
        }
        while (i2 <= high) {
            temp.add(list.get(i2));
            i2++;
        }

        for (int i = 0; i < temp.size(); i++) {
            list.set(low + i, temp.get(i));
        }
    }
}







//        ArrayList<Integer> temp = new ArrayList<>();
//
//        int n1 = low - middle;
//        int n2 = middle + 1 - high;
//
//        for (int i = 0; i <= n1; i++) {
//            temp.add(list.get(n1));
//        }
//
//        for (int i = 0; i <= n2; i++) {
//            temp.add(list.get(n2));
//        }
//
//        int i = 0;
//        int j = 0;
//
//    }