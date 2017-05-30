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
    private int index = 0;

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
        if (count > 0 && this.container.length < count) {
            container = Arrays.copyOf(container, count * 2);
        }

    }

    /**
     * Method return size array.
     * @return size array.
     */
    private int size() {
        return this.index;
    }

    @Override
    public void add(E e) {
        if (index == container.length - 1) {
            resize(index + 1);
        }
        this.container[index++] = e;
    }

    @Override
    public E get(int index) {
        return (E) this.container[index];
    }

    @Override
    public Iterator<E> iterator() {
        return new Iterator<E>() {

            private int position = 0;

            @Override
            public boolean hasNext() {
                return this.position < index;
            }

            @Override
            public E next() {
                return (E) container[this.position++];
            }
        };
    }


}

