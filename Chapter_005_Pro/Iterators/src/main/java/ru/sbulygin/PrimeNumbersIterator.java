package ru.sbulygin;

import java.util.ArrayList;
import java.util.Iterator;

/**
 * Class PrimeNumbersIterator.
 *
 * @author sbulygin.
 * @since 20.05.2017.
 * @version 1.0.
 */
public class PrimeNumbersIterator implements Iterator {

    /**
     * Collection ArrayList.
     */
    private ArrayList<Integer> collection;

    /**
     * Value for next().
     */
    private int valueNext;

    /**
     * Index of iterator.
     */
    private int index;

    /**
     * Constructor.
     * @param collection collection.
     */
    PrimeNumbersIterator(ArrayList<Integer> collection) {
        this.collection = collection;
    }

    @Override
    public boolean hasNext() {
        int counter = 0;
        for (int i = index; i < collection.size(); i++) {
            if (simpleNumbersCheck(i)) {
                counter++;
            }
        }
        return counter > this.valueNext;
    }

    @Override
    public Object next() {
        int result = -1;
        for (int value = index; value < collection.size(); value++) {
            if (simpleNumbersCheck(collection.get(value))) {
                result = collection.get(value);
                index = value + 1;
                valueNext++;
                break;

            }
        }
        return result;
    }

    /**
     * Method checks is the number of ordinary.
     * @param number numbers.
     * @return simple numbers.
     */
    private boolean simpleNumbersCheck(int number) {
        boolean result = true;
        if (number < 2) {
            result = false;
        }
        for (int value = 2; value * value <= number; value++) {
            if (number % value == 0) {
                result = false;
            }
        }
        return result;
    }
}
