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

    /**
     * Method returns last element and removes it from list.
     * @return element.
     */
    public E myPop() {
        E element = this.get(size() - 1);
        remove(size() - 1);
        return element;
    }


}
