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
     * Constructor.
     * @param collection collection.
     */
    EvenNumbersIterator(ArrayList<Integer> collection) {
        this.collection = collection;
    }

    @Override
    public boolean hasNext() {

        return evenNumberCheck(false) != null;
    }

    @Override
    public Object next() {
        Integer result = null;
        if (hasNext()) {
            result = evenNumberCheck(true);
        }
        return result;
    }

    /**
     * The method checks the value of the parity.
     * @param moveIndex boolean flag for index move.
     * @return value index.
     */
    private Integer evenNumberCheck(boolean moveIndex) {
        Integer result = null;
        for (int value = index; value < collection.size(); value++) {
            if (moveIndex) {
                index++;
            }
            if (collection.get(value) % 2 == 0) {
                result = collection.get(value);
                break;
            }
        }
        return result;

    }


}
