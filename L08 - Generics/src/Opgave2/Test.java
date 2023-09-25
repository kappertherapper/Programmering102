package Opgave2;

import java.util.HashSet;
import java.util.List;

public class Test {
    public static void main(String[] args) {
        HashSet<Number> h1 = new HashSet<>();
        h1.addAll(List.of(2, 2, 4, 6, 8, 10));

        HashSet<Number> h2 = new HashSet<>();
        h2.addAll(List.of(1, 2, 3, 5, 7, 9));

        System.out.println(union(h1, h2));
        System.out.println();
        System.out.println(intersection(h1, h2));

    }

    public static <T> HashSet<T> union(HashSet<T> u, HashSet<T> y) {
        HashSet<T> union = new HashSet<>();

        //Start with first list
        for (T a : u) {
            for (T b : y) {
                if (a != b) {
                    union.add(a);
                }
            }
        }

        //Start with second list
        for (T a : y) {
            for (T b : u) {
                if (a != b) {
                    union.add(a);

                }
            }
        }
        return union;
    }

    public static <T> HashSet<T> intersection(HashSet<T> u, HashSet<T> y) {
        // can also use: y.retainAll(u);
        HashSet<T> union = new HashSet<>();

        //Start with first list
        for (T a : u) {
            for (T b : y) {
                if (a == b) {
                    union.add(a);
                }
            }
        }

        //Start with second list
        for (T a : y) {
            for (T b : u) {
                if (a == b) {
                    union.add(a);

                }
            }
        }
        return union;
    }
}




