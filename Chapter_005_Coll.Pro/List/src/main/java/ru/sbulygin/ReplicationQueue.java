package ru.sbulygin;

/**
 * Class ReplicationQueue.
 *
 * @author sbulygin.
 * @since 10.06.2017.
 * @version 1.0.
 * @param <E> type.
 */
public class ReplicationQueue<E> extends ReplicationLinkedList<E> {

    /**
     * Method add element in list.
     * @param e element for add list.
     */
    public void myOffer(E e) {
        add(e);
    }

    /**
     * Method return first element of list.
     * @return element with zero index.
     */
    public E myPeek() {
        return this.get(0);
    }


}
