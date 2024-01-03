package Node;

public class Singlylinked {

    class Node<T> {
        T data;
        Node<T> next;

        public Node(T data) {
            this.data = data;
            this.next = null;
        }
    }

    class LinkedList<T> {
        Node<T> head;

        public LinkedList() {
            this.head = null;
        }

        /**
         * Adds node to the end of the list
         *
         * @param data
         */
        public void addNode(T data) {
            Node<T> newNode = new Node<>(data);
            if (head == null) {
                head = newNode;
            } else {
                Node<T> current = head;
                while (current.next != null) {
                    current = current.next;
                }
                current.next = newNode; // Adds new node
            }
        }

        /**
         * Removes node equal to the data inserted
         * Return true if removed
         *
         * @param data
         */
        public boolean removeNode(T data) {
            if (head == null) {
                return false; // List is empty
            }
            if (head.data.equals(data)) {
                head = head.next; // Head is removed
            }

            Node<T> current = head;
            while (current.next != null) {
                if (current.next.data.equals(data)) {
                    current.next = current.next.next; // Deletes node
                    return true;
                }
                current = current.next;
            }
            return false; // Element was not found
        }
    }
}

