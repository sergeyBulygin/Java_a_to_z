package ru.sbulygin;


import java.util.Arrays;
import java.util.Iterator;


/**
 * Class ReplicationArrayList.
 *
 * @author sbulygin.
 * @since 30.05.2017.
 * @version 1.0.
 * @param <E> type.
 */
public  class ReplicationArrayList<E> implements SimpleContainer<E> {

    /**
     * Default size list.
     */
    private static final int DEFAULT_SIZE = 10;

    /**
     * Length of array.
     */
    private int count = 0;

    /**
     * Array of element.
     */
    private Object[] container;

    /**
     * Constructor with default size.
     */
    public ReplicationArrayList() {
        this.container = new Object[DEFAULT_SIZE];
    }

    /**
     * Constructor with initial size.
     * @param initSize size of array.
     */
    public ReplicationArrayList(int initSize) {
        this.container = new Object[initSize];
    }

    /**
     * Method changes the size of the array when adding new elements.
     * @param count the number of new elements.
     */
    private void resize(int count) {
            container = Arrays.copyOf(container, count * 2);
    }

    /**
     * Method return size array.
     * @return size array.
     */
    public int size() {
        return this.count;
    }

    @Override
    public void add(E e) {
        if (count >= this.container.length) {
            resize(count + 1);
        }
        this.container[count++] = e;
    }

    @Override
    public E get(int index) {
        return (E) this.container[index];
    }

    @Override
    public Iterator<E> iterator() {
        return new ReplicationIterator<>();
    }

    /**
     * Class ReplicationIterator.
     *
     * @author sbulygin.
     * @since 30.05.2017.
     * @version 1.0.
     * @param <E> type.
     */
    private class ReplicationIterator<E> implements Iterator<E> {

        /**
         * Position of iterator.
         */
        private int position = 0;

        @Override
        public boolean hasNext() {
            return this.position < count;
        }

        @Override
        public E next() {
            position++;
            return (E) container[position];
        }

    }


}
