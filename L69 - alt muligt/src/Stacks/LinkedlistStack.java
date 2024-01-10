package Stacks;

import java.util.LinkedList;
import java.util.NoSuchElementException;
import java.util.Stack;

public class LinkedlistStack<T> {
    LinkedList<Stack> stacks = new LinkedList<>();
    private Node<T> head = null;


    /**
     * Add the element at the top of this stack.
     */
    void push(T element) {
        if (head == null) {
            head = new Node<>(element);
            return;
        }
        Node<T> newNode = new Node<>(element);
        newNode.next = head;
        head = newNode;
    }


    /**
     * Remove and return this stack's top element.
     * Throw NoSuchElementException, if the stack is empty.
     */
    T pop() {
        if (head.equals(null)) {
            throw new NoSuchElementException();
        }
        T removed = head.element;
        head = head.next;
        return removed;
    }

    /**
     * Return stack's top element.
     * Throw NoSuchElementException, if the stack is empty.
     */
    T peek() {
        if (head == null) {
            throw new NoSuchElementException();
        }
        T peek = head.element;
        return peek;
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
