package ru.sbulygin;


import java.util.ArrayList;
import java.util.Iterator;

/**
 * Class EvenNumbersIterator.
 *
 * @author sbulygin.
 * @since 19.05.2017.
 * @version 1.0.
 */
public class EvenNumbersIterator implements Iterator {

    /**
     * Collection ArrayList.
     */
    private ArrayList<Integer> collection;

    /**
     * Index of iterator.
     */
    private int index;

    /**
     * Value for next().
     */
    private int valueNext;

    /**
     * Constructor.
     * @param collection collection.
     */
    EvenNumbersIterator(ArrayList<Integer> collection) {
        this.collection = collection;
    }

    @Override
    public boolean hasNext() {
        int counter = 0;
        for (Integer index : collection) {
            if (index % 2 == 0) {
                counter++;
            }
        }
        return counter > this.valueNext;
    }

    @Override
    public Object next() {
        int result;
        result = 0;
        for (int value = index; value < collection.size(); value++) {
            if (collection.get(value) % 2 == 0) {
                result = collection.get(value);
                index = value + 1;
                valueNext++;
                break;
            }
        }
        return result;
    }
}
