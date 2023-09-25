package Opgave4;

import java.util.ArrayList;
import java.util.List;

public class ArrayRing<T> implements Ring<T>{
    private final List<T> items;
    private int current; // -1 means empty ring

    public ArrayRing() {
        items = new ArrayList<>();
        current = -1;
    }
    @Override
    public void advance() {

    }

    @Override
    public T getCurrentItem() {
        if (current == -1) {
            //throw new //create EmptyRingException
        }
        return items.get(current);
    }

    @Override
    public void add(T item) {

    }

    @Override
    public boolean removeItem(T item) {
        return false;
    }


    @Override
    public T removeCurrentItem() {
        return null;
    }

    @Override
    public int size() {
        return 0;
    }

    @Override
    public boolean isEmpty() {
        return false;
    }
}
