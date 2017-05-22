package ru.sbulygin;

import java.util.Iterator;

/**
 * Class ConverterIterator.
 *
 * @author sbulygin.
 * @since 21.05.2017.
 * @version 1.0.
 */
public interface ConverterIterator {

    /**
     * Method converts the iterators into a single iterator.
     * @param it it iterator of iterators.
     * @return new iterator.
     */
    Iterator<Integer> convert(Iterator<Iterator<Integer>> it);

}
