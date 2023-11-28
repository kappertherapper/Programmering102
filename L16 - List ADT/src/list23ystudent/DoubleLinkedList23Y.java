package list23ystudent;

import java.util.Iterator;

/** A double-linked nodes based implementation of the List ADT. */
public class DoubleLinkedList23Y<E> implements List23Y<E> {
    private final Node<E> head = new Node<>(null);
    private final Node<E> tail = new Node<>(null);
    private int size = 0;

    public DoubleLinkedList23Y() {
        head.next = tail;
        tail.prev = head;
    }

    /**
     * Add the element to the end of this list.
     */
    @Override
    public void add(E e) {
        if (head == null) {
            head.next = tail.prev = new Node<>(e);
            head.prev = null;
            tail.next = null;
        } else {
            Node<E> newNode = new Node<>(e);
            tail.next = newNode;
            newNode.prev = tail;
            head.next = newNode;
            tail.next = null;

        }
    }

    /**
     * Remove the element from this list.
     * Return true, if this list is modified.
     */
    @Override
    public boolean remove(E e) {
        if (head == null)
            return false;


        Node<E> node = head;
        if (node.element.equals(e)) {
            if (node.next != null) {
            node.next.prev = null;
        }

        node = node.next;
        size--;
        return true;
    }

        while (node.next != null && !node.next.element.equals(e)) {
            node = node.next;
        }

        if (node.next != null) {
            node.next = node.next.next;
            node.next.prev = node.prev;
            size--;
            return true;
        }
        return false;
    }

    /**
     * Return true, if this list contains the element.
     */
    @Override
    public boolean contains(E e) {
        Node<E> node = head;
        while (node != null) {
            if (node.element.equals(e)) {
                return true;
            }
            node = node.next;
        }
        return false;
    }

    /**
     * Remove all elements from this list.
     */
    @Override
    public void clear() {
        head.next = null;
        tail.prev = null;
        size = 0;
    }

    /**
     * Return the size of this list.
     */
    public int size() {
        return size;
    }

    /**
     * Return true, if this list is empty.
     */
    @Override
    public boolean isEmpty() {
        return head.next == tail;
    }

    /**
     * Return the element at the index.
     * Throw IndexOutOfBoundsException, if index < 0 or index >= size().
     */
    @Override
    public E get(int index) {
        if (index < 0 || index >= size()) {
            throw new IndexOutOfBoundsException();
        }
        Node<E> node = head;
        for (int i = 0; i < index; i++) {
            node = node.next;
        }

        return node.element;
    }

    /**
     * Add the element to this list at the index.
     * Throw IndexOutOfBoundsException, if index < 0 or index > size().
     * Note: The element can be added at an index equal to size().
     */
    @Override
    public void add(int index, E e) {
        if (index < 0 || index > size()) {
            throw new IndexOutOfBoundsException();
        }
        Node<E> node = new Node<E>(e);

        if (index == 0) {
            node.next = head;
            tail.prev = node;
            size++;
            return;
        }
        int count = 0;
        Node<E> temp = head;

        while (count < index && temp != null) {
            node.prev = temp;
            temp = temp.next;
            count++;
        }

        node.prev.next = node;
        node.next = temp;
        size++;
    }

    /**
     * Remove and return the element at the index.
     * Throw IndexOutOfBoundsException, if index < 0 or index >= size().
     */
    @Override
    public E remove(int index) {
        return null;
    }

    /**
     * Return the index of the element in this list.
     * Return -1, if this list does not contain the element.
     */
    @Override
    public int indexOf(E e) {
        return -1;
    }

    /**
     * Return an iterator over this list.
     * Note: While the list is traversed by this iterator,
     * adding or removing an element is not allowed.
     */
    @Override
    public Iterator<E> iterator() {
        return null;
    }

    //-------------------------------------------

    private static class Node<T> {
        private final T element;
        private Node<T> next;
        private Node<T> prev;

        public Node(T t) {
            this.element = t;
            this.next = null;
            this.prev = null;
        }
    }

    //-------------------------------------------

    @Override
    public String toString() {
        return null;
    }
}
