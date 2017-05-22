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

            if (evenNumberCheck() != -1) {
                counter++;
            }

        return counter > this.valueNext;
    }

    @Override
    public Object next() {

        int result;
        result = 0;

        if (evenNumberCheck() != -1) {
            result = collection.get(index);
            index += 1;
            valueNext++;

        }
        return result;
    }

    /**
     * The method checks the number of parity.
     * @return result even check.
     */
    private int evenNumberCheck() {

        int result = -1;

        for (int value = index; value < collection.size(); value++) {
            if (index % 2 == 0) {
                result = collection.get(index);
            }
        }
        return result;
    }
}
