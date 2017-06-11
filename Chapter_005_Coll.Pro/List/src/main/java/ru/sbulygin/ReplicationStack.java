package ru.sbulygin;

/**
 * Class ReplicationStack.
 *
 * @author sbulygin.
 * @since 10.06.2017.
 * @version 1.0.
 * @param <E> type.
 */
public class ReplicationStack<E> extends ReplicationLinkedList<E> {

    /**
     *  Method add element in list.
     * @param e element for add list.
     */
    public void myPush(E e) {
        add(e);
    }

    /**
     * Method return first element of list.
     * @return element with last index.
     */
    public E myPeek() {

        return get(size() - 1);
    }
}
