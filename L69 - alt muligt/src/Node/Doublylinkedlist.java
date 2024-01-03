package Node;

public class Doublylinkedlist {

    class DoubleNode<T> {
        T data;
        DoubleNode<T> next;
        DoubleNode<T> prev;

        public DoubleNode(T data) {
            this.data = data;
            this.prev = null;
            this.next = null;
        }
    }

    class DoublyLinkedList<T> {
        DoubleNode<T> head;

        public DoublyLinkedList() {
            this.head = null;
        }

        public void addNode(T data) {
            DoubleNode<T> newNode = new DoubleNode<>(data);
            if (head == null) {
                head = newNode; // If list is empty
            } else {
                newNode.next = head;  // 3. Peger den nye nodes 'next' på det nuværende hoved
                head.prev = newNode;  // 4. Opdaterer det nuværende hoveds 'prev' til at pege på den nye node
                head = newNode; // 5. Gør den nye node til det nye hoved i listen
            }
        }
    }
}
