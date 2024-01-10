package Stacks;

import java.util.Deque;
import java.util.LinkedList;

public class DequeStack<E> {
    // Implements a stack by adapting a deque (implemented with a LinkedList).
    // The top of the stack is at the beginning of the LinkedList.

    // deque contains the elements in the stack.
    private final Deque<E> deque = new LinkedList<>();

    /**
     * Add the element at the top of this stack.
     */
    public void push(E entry) {
        deque.addFirst(entry);
    }

    /**
     * Remove and return this stack's top element.
     * Throw NoSuchElementException, if the stack is empty.
     */
    public E pop() {
        return deque.removeFirst();
    }

    /**
     * Return this stack's top element.
     * Throw NoSuchElementException, if the stack is empty.
     */
    public E peek() {
        return deque.getFirst();
    }

    /**
     * Return true, if this stack is empty.
     */
    public boolean isEmpty() {
        if (deque.isEmpty()) {
            return true;
        }
        return false;
    }

    /**
     * Remove all elements from this stack.
     */
    public void clear() {
        deque.clear();
    }

    /**
     * Return the number of elements in this stack.
     */
    public int size() {
        return deque.size();
    }
}
