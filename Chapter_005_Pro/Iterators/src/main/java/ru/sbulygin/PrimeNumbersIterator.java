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
     * Index of iterator.
     */
    private int index = 0;

    /**
     * Constructor.
     * @param collection collection.
     */
    PrimeNumbersIterator(ArrayList<Integer> collection) {
        this.collection = collection;
    }

    @Override
    public boolean hasNext() {
        boolean result = false;
        for (int i = index + 1; i < collection.size(); i++) {
            if (simpleNumbersCheck(collection.get(i))) {
                result = true;
            }
        }
        return result;
    }

    @Override
    public Object next() {
        int result = -1;
        if (hasNext()) {
            for (int value = index + 1; value < collection.size(); value++) {
                if (simpleNumbersCheck(collection.get(value))) {
                    result = collection.get(value);
                    index = value;
                    break;

                }
            }
        }
        return result;
    }

    /**
     * Method checks is the number of ordinary.
     * @param number numbers.
     * @return simple numbers.
     */
    public boolean simpleNumbersCheck(int number) {
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
