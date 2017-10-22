package ru.sbulygin;

/**
 * Class ReplicationQueue.
 *
 * @author sbulygin.
 * @since 10.06.2017.
 * @version 1.0.
 */
public class CyclicLinkedList {

    /**
     * Check for cycles for linked list.
     * @param first first node in list.
     * @return boolean result.
     */
    public boolean hasCycle(Node first) {

        boolean result = false;

        Node current = first;

        while ((current = current.getNext()) != null) {
            if (first.equals(current.getNext())) {
                result = true;
                break;
            }
        }
        return result;
    }

    /**
     * Class Node, container node of linked list.
     * @param <T>
     */
    public static class Node<T> {

        /**
         * Value node.
         */
        private T value;

        /**
         * Next node element.
         */
        private Node<T> next;

        /**
         * Constructor node.
         * @param value value node.
         */
        public Node(T value) {
            this.value = value;
        }

        /**
         * Getter next node.
         * @return next node.
         */
        public Node<T> getNext() {
            return next;
        }

        /**
         * Setter next node.
         * @param next next node.
         */
        public void setNext(Node<T> next) {
            this.next = next;
        }
    }


}
