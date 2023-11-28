package muuh;

import muuh.Queue23Y;

import java.util.NoSuchElementException;

public class SingleLinkedQueue<E> implements Queue23Y<E> {
    // top of queue is at head of list
    private Node<E> head = null;

    //Botton of queue is at the tail of list
    private Node<E> tail = null;

    // the number of element in the stack
    int size = 0;

    /**
     * Add the element at the back of the queue.
     */
    @Override
    public void add(E element) {
        if (tail == null) {
            tail = new Node<>(element);
            size++;
            return;
        }
        Node<E> newNode = new Node<>(element);
        newNode.prev = tail;
        tail = newNode;
        size++;
    }

    /**
     * Return the element at the front of the queue.
     * Throw a NoSuchElementException(), if the queue is empty.
     */
    @Override
    public E remove() {
        if (head.equals(null)) {
            throw new NoSuchElementException();
        }
        E removed = head.element;
        head = head.next;
        size--;

        return removed;
    }

    /**
     * Return the element at the front of the queue.
     * Throw a NoSuchElementException(), if the queue is empty.
     */
    @Override
    public E element() {
        if (head.equals(null)) {
            throw new NoSuchElementException();
        }
        return head.element;
    }

    /**
     * Return true, if the queue is empty.
     */
    @Override
    public boolean isEmpty() {
        if (size == 0) {
            return true;
        }
        return false;
    }

    /**
     * Remove all elements from the queue.
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
        tail = null;
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
        private Node<T> prev;

        public Node(T element) {
            this.element = element;
            this.next = null;
            this.prev = null;
        }
    }
}
