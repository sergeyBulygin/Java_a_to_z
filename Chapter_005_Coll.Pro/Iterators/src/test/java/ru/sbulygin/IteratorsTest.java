package ru.sbulygin;


import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

/**
 * Class IteratorsTest.
 *
 * @author sbulygin.
 * @since 21.05.2017.
 * @version 1.0.
 */
public class IteratorsTest {

    /**
     * Result Iterator.
     */
    private Iterator<Integer> resultIterator;

    /**
     * Result test.
     */
    private Iterator<Integer> resultTest;

    /**
     * The method contains information for tests.
     */
    @Before
    public void infoForTestConverterIterator() {

        List<Integer> listTestOne = Arrays.asList(4, 3, 2);
        List<Integer> listTestTwo = Arrays.asList(1, 5, 6);
        List<Integer> emptyListTest;
        emptyListTest = new ArrayList<>();
        List<Iterator<Integer>> listIteratorTest = new ArrayList<>(Arrays.asList(listTestOne.iterator(),
                emptyListTest.iterator(),
                listTestTwo.iterator()));

        resultTest = Arrays.asList(4, 3, 2, 1, 5, 6).iterator();
        Iterators converter = new Iterators();
        resultIterator = converter.convert(listIteratorTest.iterator());
    }

    /**
     * The testing method of the convert, class Iterators.
     */
    @Test
    public void whenAddCollectionsThanResultAllValueCollections() {
        while (resultIterator.hasNext()) {
            assertThat(resultIterator.next(), is(resultTest.next()));
        }

    }

    /**
     * The method checks hasNext method, true.
     */
    @Test
    public void whenHasNextThenTrue() {
        boolean result = resultIterator.hasNext();
        assertThat(result, is(true));
    }

    /**
     * The method checks hasNext method, false.
     */
    @Test
    public void whenHasNextSixThenFalse() {
        resultIterator.next();
        resultIterator.next();
        resultIterator.next();
        resultIterator.next();
        resultIterator.next();
        resultIterator.next();
        boolean result = resultIterator.hasNext();
        assertThat(result, is(false));
    }


}
