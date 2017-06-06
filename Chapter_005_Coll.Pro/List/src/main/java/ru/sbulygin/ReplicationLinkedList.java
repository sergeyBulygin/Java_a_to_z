package ru.sbulygin;

import java.util.Iterator;

/**
 * Class ReplicationLinkedList.
 *
 * @author sbulygin.
 * @since 05.06.2017.
 * @version 1.0.
 * @param <E> type.
 */

public class ReplicationLinkedList<E> implements SimpleContainer<E> {

    /**
     * Size of list.
     */
    private int size = 0;

    /**
     * First entry in list.
     */
    private Entry<E> firstElement;

    /**
     * Last entry in list.
     */
    private Entry<E> lastElement;

    @Override
    public void add(E e) {
        Entry<E> newEntry = new Entry<>(e, null, this.lastElement);
        if (lastElement == null) {
            this.firstElement = newEntry;
        } else {
            newEntry.next = newEntry;
        }
        this.lastElement = newEntry;
        size++;

    }

    @Override
    public E get(int index) {
        return finder(index).element;
    }

    /**
     * Method getting size of list.
     * @return size of list.
     */
    public int size() {
        return this.size;
    }

    @Override
    public Iterator<E> iterator() {
        return new ReplicationLinkedIterator<>();
    }

    /**
     * Class ReplicationLinkedIterator.
     *
     * @author sbulygin.
     * @since 30.05.2017.
     * @version 1.0.
     * @param <E> type.
     */
    private class ReplicationLinkedIterator<E> implements Iterator<E> {

        /**
         * Position of iterator.
         */
        private int position = 0;

        @Override
        public boolean hasNext() {
            return this.position != size;
        }

        @Override
        public E next() {
            position++;
            return (E) get(position);
        }

    }

    /**
     * Method looks up the element at index in list.
     * @param index index of element.
     * @return the element is found.
     */
    private Entry<E> finder(int index) {
        if (index < 0 || index > size()) {
            throw new IndexOutOfBoundsException("The element with the given index was not found.");
        }
        Entry<E> searchElement;
        if (index < (size >> 1)) {
            searchElement = this.firstElement;
            for (int count = 0; count < index; count++) {
                searchElement = searchElement.next;
            }

        } else {
            searchElement = this.lastElement;
            for (int count = size - 1; count > index; count--) {
                searchElement = searchElement.prev;
            }
        }
        return searchElement;

    }

    /**
     * Private static class for creating Double-linked entries in ReplicationLinkedList.
     * @param <E> The type of the parameter.
     */
    private  class Entry<E> {

        /**
         *  The element that contains the data type E in the entry.
         */
        private E element;

        /**
         * Link of next element in list.
         */
        private Entry<E> next;

        /**
         *  Link of previous element in list.
         */
        private Entry<E> prev;

        /**
         * Constructor of class Entry.
         * @param element data to save in entry.
         * @param next link of next element.
         * @param prev link of previous element.
         */
         Entry(E element, Entry<E> next, Entry<E> prev) {
            this.element = element;
            this.next = next;
            this.prev = prev;
        }
    }


}
