public class SortedSinglyList<E extends Comparable<E>> implements SortedList23Y<E> {

    private Node<E> head = null;
    private int size = 0;

    /**
     * Add the element to the list.
     * The list is still sorted after the element is added.
     */
    @Override
    public void add(E e) {
        Node<E> node = new Node<>(e);

        if (head == null) {
            head = node;
            size++;
            return;
        }
        Node<E> temp = head;
        Node<E> prev = null;

        while (temp != null) {
            if (temp.element.compareTo(e) >= 0) {
                    prev.next = node;
                    node.next = temp;
                    size++;
                    return;
            }

            prev = temp;
            temp = temp.next;
        }

        prev.next = node;
        size++;
    }

    /**
     * Remove the first element in the list.
     * The list is still sorted after the element is removed.
     * Return true, if the element was removed.
     */
    @Override
    public boolean removeFirst() {
        if (head == null) {
            return false;
        }
        Node<E> node = head;
        node = node.next;
        return true;
    }

    /**
     * Remove the last element in the list.
     * The list is still sorted after the element is removed.
     * Return true, if the element was removed.
     */
    @Override
    public boolean removeLast() {
        if (head == null) {
            return false;
        }
        if (head.next == null) {
            head = null;
        } else {
            Node<E> node = head;
            while (node.next.next != null) {
                node = node.next;
            }
            node.next = null;
        }
        size--;
        return true;
    }

    /**
     * Remove the first instance of the element from the list.
     * The list is still sorted after the element is removed.
     * Return true, if the element was removed.
     */
    @Override
    public boolean remove(E element) {
        if (size == 0) {
            return false;
        }

        if (size == 1 && head.element.compareTo(element) == 0) {
            head = head.next;
            size--;
            return true;
        }

        Node<E> node = head;
        Node<E> prev = null;

        while (node != null) {
            if (node.element.compareTo(element) == 0) {
                prev.next = node.next;
                size--;
                return true;
            }
            prev = node;
            node = node.next;
        }
        return false;
    }

    @Override
    public int size() {
        return 0;
    }

    /**
     * Add all elements in the given list to the current list.
     * The current list is still sorted after the elements are added.
     */
    public void addAll(SortedSinglyList<E> list) {
        Node<E> node = list.head;
        while (node != null) {
            this.add(node.element);
            node = node.next;
        }
    }

    @Override
    public boolean hasNext() {
        return false;
    }

    @Override
    public Object next() {
        return null;
    }


    //-------------------------------------------
    private static class Node<T> {
        private final T element;
        private Node<T> next;

        public Node(T t) {
            this.element = t;
            this.next = null;
        }
    }
}
    //-------------------------------------------