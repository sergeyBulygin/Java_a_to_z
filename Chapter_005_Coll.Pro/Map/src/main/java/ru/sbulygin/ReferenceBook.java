package ru.sbulygin;

import java.util.Arrays;
import java.util.Iterator;
import java.util.NoSuchElementException;

/**
 * Class ReferenceBook.
 *
 * @author sbulygin.
 * @since 17.07.2017.
 * @version 1.0.
 * @param <T> type.
 * @param <V> type.
 */
public class ReferenceBook<T, V> implements SimpleMap<T, V> {

    /**
     * An array of items.
     */
    private Entry[] container;

    /**
     * The size of the map.
     */
    private static final int INITIAL_CAPACITY = 16;

    /**
     * Constructor of ReferenceBook.
     */
    public ReferenceBook() {
        this.container = new Entry[INITIAL_CAPACITY];
    }

    @Override
    public boolean insert(T key, V value) {
        boolean resultInsert = true;
        int index = hashesIndex(key);
        if (index != -1 && key != null && container[index] == null) {
            container[index] = new Entry<>(key, value);
        } else {
            resultInsert = false;
        }
        return resultInsert;
    }

    @Override
    public V get(T key) {
        int index = hashesIndex(key);
        if (index != -1 && key != null && container[index] != null) {
            return (V) container[index].value;
        } else {
            throw new NoSuchElementException("The specified key was not found");
        }
    }

    @Override
    public boolean delete(T key) {
        boolean resultRemove = true;
        int index = hashesIndex(key);
        if (index != -1 && key != null && container[index] != null) {
            container[index] = null;
        } else {
            resultRemove = false;
        }
        return resultRemove;
    }

    /**
     * The method returns the size of the map.
     * @return size of map.
     */
    public int sizeReferenceBook() {
        int counter = 0;
        for (Entry index : container) {
            if (index != null) {
                counter++;
            }
        }
        return counter;
    }

    @Override
    public Iterator iterator() {
        return new ReferenceBookIterator();
    }

    /**
     * Iterator class for ReferenceBook.
     */
    private class ReferenceBookIterator implements Iterator {

        /**
         * Position of iterator.
         */
        private int position = 0;

        @Override
        public boolean hasNext() {
            boolean resultHasNext = false;
            for (int index = position; index < container.length; index++) {
                if (container[index] != null) {
                    resultHasNext = true;
                    break;
                }
            }
            return resultHasNext;
        }

        @Override
        public Object next() {
            while (container[position] == null) {
                position++;
            }
            return container[position++];
        }
    }

    /**
     * The method calculates the hash code of the index from the hash code of the key.
     * @param key key.
     * @return hash of index.
     */
    private int hashesIndex(T key) {
        int hashIndex = key.hashCode() % container.length;
        while (container[hashIndex] != null && container[hashIndex].key != key) {
            hashIndex = (hashIndex + 31) % container.length;
        }
        return hashIndex;
    }

    /**
     * Class for entry in ReferenceBook.
     * @param <T>
     * @param <V>
     */
    private class Entry<T, V> {

        /**
         * Key of Entry.
         */
        private T key;

        /**
         * Value of Entry.
         */
        private V value;

        /**
         * Constructor of Entry.
         * @param key key.
         * @param value value.
         */
        Entry(T key, V value) {
            this.key = key;
            this.value = value;
        }

        /**
         * Getter for key.
         * @return key.
         */
        public T getKey() {
            return key;
        }

        /**
         * Getter for value.
         * @return value.
         */
        public V getValue() {
            return value;
        }

        @Override
        public String toString() {
            return String.format("Key: %s --> %s", this.getKey(), this.getValue());
        }


    }

    @Override
    public String toString() {
        return Arrays.toString(container);
    }


}
