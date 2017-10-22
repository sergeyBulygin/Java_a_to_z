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

    /**
     * Return first element from queue and remove it from list.
     * @return element with zero index.
     */
    public E myPoll() {
        E element = this.get(0);
        remove(0);
        return element;
    }


}
