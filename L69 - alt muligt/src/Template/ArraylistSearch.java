package Template;

import java.util.ArrayList;

abstract class ArraylistSearch<E> {
    int search(int[] array, int item) {
        for (int i = 0; i < array.length; i++) {
            if (item == array[i]) {
                return i;
            }
        }
        return -1;
    }
}
