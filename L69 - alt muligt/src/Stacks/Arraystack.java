package Stacks;

import java.util.Arrays;
import java.util.NoSuchElementException;

public class Arraystack<E> {

    private int top = -1;
    private E[] items = (E[]) new Object[4];

    /**
     * Add the element at the top of this stack.
     */
    void push(E entry) {
        if (top == items.length - 1) {
            items = Arrays.copyOf(items, items.length * 2);
        }
        top++;
        items[top] = entry;
    }

    /**
     * Remove and return this stack's top element.
     * Throw NoSuchElementException, if the stack is empty.
     */
    E pop() {
        if (top == items.length - 1) {
            throw new NoSuchElementException("Stack empty my guy <3");
        }
        E removed = items[top];
        items[top] = null;
        top--;
        return removed;
    }

    E peek() {
        if (top == items.length - 1) {
            throw new NoSuchElementException("Stack empty my guy <3");
        }

        return items[top];
    }
}
