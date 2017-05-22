package ru.sbulygin;

import java.util.Iterator;
import java.util.NoSuchElementException;

/**
 * Class Iterators.
 *
 * @author sbulygin.
 * @since 21.05.2017.
 * @version 1.0.
 */
public class Iterators implements ConverterIterator, Iterator<Integer> {

    /**
     * Iterator of iterators.
     */
    private  Iterator<Iterator<Integer>> iterators;

    /**
     * Current selected iterator.
     */
    private Iterator<Integer> existingIterator = null;

    @Override
    public Iterator<Integer> convert(Iterator<Iterator<Integer>> it) {
        this.iterators = it;
        return this;
    }

    @Override
    public boolean hasNext() {
        selectExistingIterator();
        return (existingIterator != null && existingIterator.hasNext());
    }

    @Override
    public Integer next() {
        selectExistingIterator();
        if (existingIterator == null) {
            throw new NoSuchElementException("Must be not null");
        }
        return existingIterator.next();
    }

    /**
     * The method checks whether the current iteration of the iterator,
     * if there is return true, if not - go for the following iterators
     * as long as they're either not over or is not found the iterator,
     * who is iteration.
     */
    private void selectExistingIterator() {
        if (existingIterator != null && existingIterator.hasNext()) {
            return;
        }
        existingIterator = null;
        while (iterators.hasNext()) {
            Iterator<Integer> nextIterator = iterators.next();
            if (nextIterator.hasNext()) {
                existingIterator = nextIterator;
                break;
            }
        }
    }


}
