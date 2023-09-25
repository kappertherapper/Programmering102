package Opgave3;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class Par {
    public static void main(String[] args) {
        Map<Integer, Integer> par = new HashMap<>();
        par.put(2, 4);
        par.put(3, 9);
        par.put(4, 16);
        par.put(5, 25);
        par.put(6, 36);

        //Create iterator
        Iterator<Integer> iterator = par.keySet().iterator();

        // Runs though till no next
        while (iterator.hasNext()) {
            int key = iterator.next();
            int value = par.get(key);
            System.out.printf(" (%d, %d) ", key, value);
        }
    }
}
