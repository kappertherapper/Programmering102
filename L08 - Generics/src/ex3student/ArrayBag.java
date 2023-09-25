package ex3student;

import org.junit.jupiter.engine.discovery.predicates.IsTestMethod;

import java.util.Arrays;

public class ArrayBag<E> implements Bag<E> {
    // the array to hold the items
    private final E[] items;
    // current number of items in the bag,
    // items are at index 0..size-1
    private int size;

    /**
     * Create a bag with the given capacity.
     */
    public ArrayBag(int capacity) {
        @SuppressWarnings("unchecked")
        E[] empty = (E[]) new Object[capacity];
        items = empty;
        size = 0;
    }

    /**
     * Create a bag with capacity 10.
     */
    public ArrayBag() {
        this(10);
    }

    @Override
    public int getCurrentSize() {
        return size;
    }

    @Override
    public boolean isFull() {
        return size == items.length;
    }

    @Override
    public boolean isEmpty() {
        return size == 0;
    }

    @Override
    public boolean add(E newEntry) {
        if (!isFull()) {
            items[size] = newEntry;
            size++;
            return true;
        } else {
            return false;
        }
    }

    @Override
    public E remove() {
        if (items.length == 0) {
            System.out.println("The array is already empty.");
        } else {
            items[items.length - 1] = null;
        }

        return null;
    }

    @Override
    public boolean remove(E anEntry) {
        int indexToRemove = -1;

        // Find the index of the element to remove
        for (int i = 0; i < items.length; i++) {
            if (items[i] == anEntry) {
                indexToRemove = i;
                break;
            }
        }

        // Check if the element was found
        if (indexToRemove != -1) {
            // Remove the element by shifting the remaining elements
            for (int i = indexToRemove; i < items.length - 1; i++) {
                items[i] = items[i + 1];
            }
            // Set the last element to 0 (or any suitable default value)
            items[items.length - 1] = null;
            return true;
        }
        // Element not found
        return false;
    }

    @Override
    public void clear() {
        Arrays.fill(items, null);
    }

    @Override
    public int getFrequencyOf(E anEntry) {
        int count = 0;
        for (int i = 0; i < items.length; i++) {
            if (items[i].equals(anEntry)) {
                count++;
            }
        }
        return count;
    }

    @Override
    public boolean contains(E anEntry) {
        for (int i = 0; i < size; i++) {
            if (items[i].equals(anEntry)) {
                return true;

            }
        }
        return false;
    }


    @Override
    public E[] toArray() {
        return Arrays.copyOf(items, size);
    }
}



// Remove method
/*if (!isEmpty()) {
        E removedEntry = items[size-1];
        size--;
        return removedEntry;
        } else {
        return false;
        }*/

//Add method (should work?) :(
//        try {
//            E[] newArray = Arrays.copyOf(items, items.length + 1);
//
//            // Add the new element to the end of the new array
//            newArray[newArray.length - 1] = newEntry;
//
//            System.arraycopy(newArray, 0, items, 0, newArray.length);
//            return true;
//        } catch (Exception e) {
//            return false;
//        }


//            // Create a new array with one less element (shorten the array)
//            E[] temp = (E[]) new Object[length- 1];
//
//            // Copy elements from the original array to the new array, excluding the last element
//            for (int i = 0; i < items.length; i++) {
//                temp[i] = items[i];
//            }
//
//            items = temp;
