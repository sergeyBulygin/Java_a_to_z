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
    private Entry<E> element;

    @Override
    public void add(E e) {
        Entry<E> newEntry = new Entry<>(e);
        if (element == null) {
            element = newEntry;
        } else {
            Entry<E> lastElement = finder(size() - 1);
            lastElement.next = newEntry;
            newEntry.prev = lastElement;

        }
        size++;

    }

    public Entry<E> getElement() {
        return element;
    }

    /**
     * Method removes the element at index.
     *
     * @param index index element.
     */
    public void remove(int index) {

        testEmptyException();

        boundsChecking(index);

        Entry<E> elementDelete = finder(index);

        if (elementDelete.prev != null) {
            elementDelete.prev.next = elementDelete.next;
        } else {
            element = elementDelete.next;
        }

        if (elementDelete.next != null) {
            elementDelete.next.prev = elementDelete.prev;
        } else if (elementDelete.prev != null) {
            elementDelete.prev.next = null;
        }

        elementDelete.next = elementDelete.prev;
        elementDelete.prev = null;
        size--;

    }

    @Override
    public E get(int index) {
        return finder(index).element;
    }

    /**
     * Method getting size of list.
     *
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
     * @param <E> type.
     * @author sbulygin.
     * @version 1.0.
     * @since 30.05.2017.
     */
    public class ReplicationLinkedIterator<E> implements Iterator<E> {

        /**
         * Position of iterator.
         */
        private int position = -1;

        @Override
        public boolean hasNext() {
            testEmptyException();

            return this.position < size - 1;
        }

        @Override
        public E next() {

            if (hasNext()) {
                position++;
            }
            return (E) get(position);
        }

    }

    /**
     * Method looks up the element at index in list.
     *
     * @param index index of element.
     * @return the element is found.
     */
    private Entry<E> finder(int index) {

        testEmptyException();

        boundsChecking(index);

        Entry<E> searchElement = element;
        for (int i = 0; i < index; i++) {
            searchElement = searchElement.next;
        }
        return searchElement;

    }

    /**
     * Check for an empty collection.
     */
    private void testEmptyException() {
        if (size <= 0) {
            throw new IndexOutOfBoundsException("Collection empty.");
        }
    }

    /**
     * The method checks the bounds of the list.
     *
     * @param index index element for check
     */
    private void boundsChecking(int index) {
        if (index < 0 || index > size()) {
            throw new IndexOutOfBoundsException("The element with the given index was not found.");
        }


    }

    /**
     * Private static class for creating Double-linked entries in ReplicationLinkedList.
     *
     * @param <E> The type of the parameter.
     */
    protected class Entry<E> {

        /**
         * The element that contains the data type E in the entry.
         */
        private E element;

        /**
         * Link of next element in list.
         */
        private Entry<E> next;

        /**
         * Link of previous element in list.
         */
        private Entry<E> prev;

        /**
         * Constructor of class Entry.
         *
         * @param element data to save in entry.
         */
        Entry(E element) {
            this.element = element;
        }

        /**
         * Getter for element field.
         *
         * @return element.
         */
        public E getEntryElement() {
            return element;
        }

        /**
         * Getter for next element field.
         *
         * @return next element.
         */
        public Entry<E> getNext() {
            return next;
        }
    }

}


