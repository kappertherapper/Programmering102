package stack23ystudent;

import java.util.NoSuchElementException;

// OPGAVE 1 med single-linked liste.
public class LinkedStack23Y<E> implements Stack23Y<E> {
    // top of stack is at head of list
    private Node<E> head = null;
    // the number of element in the stack
    int size = 0;

    /**
     * Add the element at the top of this stack.
     */
    @Override
    public void push(E entry) {
        if (head == null) {
            head = new Node<>(entry);
            size++;
            return;
        }
        Node<E> newNode = new Node<>(entry);
        newNode.next = head;
        head = newNode;
        size++;
    }


    /**
     * Remove and return this stack's top element.
     * Throw NoSuchElementException, if the stack is empty.
     */
    @Override
    public E pop() {
        if (head.equals(null)) {
            throw new NoSuchElementException();
        }
        E removed = head.element;
        head = head.next;
        size--;

        return removed;
    }

    /**
     * Return this stack's top element.
     * Throw NoSuchElementException, if the stack is empty.
     */
    @Override
    public E peek() {
        if (head.equals(null)) {
            throw new NoSuchElementException();
        }
        return head.element;
    }

    /**
     * Return true, if this stack is empty.
     */
    @Override
    public boolean isEmpty() {
        if (size == 0) {
            return true;
        }
        return false;
    }

    /**
     * Removes all elements from this stack.
     */
    @Override
    public void clear() {
        Node<E> node = head;
        while (node != null) {
            Node<E> nextNode = node.next;
            node.next = null;
            node = nextNode;
        }
        head = null;
        size = 0;
    }

    /**
     * Return the number of elements in the stack.
     */
    @Override
    public int size() {
        return size;
    }

    //-------------------------------------------------------------------------

    private static class Node<T> {
        private final T element;
        private Node<T> next;

        public Node(T element) {
            this.element = element;
            this.next = null;
        }
    }
}
