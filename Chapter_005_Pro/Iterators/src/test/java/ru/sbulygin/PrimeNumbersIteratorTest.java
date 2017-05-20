package ru.sbulygin;

import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

/**
 * Class PrimeNumbersIteratorTest.
 *
 * @author sbulygin.
 * @since 20.05.2017.
 * @version 1.0.
 */
public class PrimeNumbersIteratorTest {

    /**
     * Instance class EvenNumbersIterator for test.
     */
    private PrimeNumbersIterator iteratorSimpleTest;

    /**
     * Collection for test.
     */
    private ArrayList<Integer> collectionTest;

    /**
     * The method contains information for tests.
     */
    @Before
    public void infoForTestPrimeNumbersIterator() {
        collectionTest = new ArrayList<>();
        collectionTest.add(6);
        collectionTest.add(1);
        collectionTest.add(3);
        collectionTest.add(2);
        collectionTest.add(4);
        collectionTest.add(5);
        iteratorSimpleTest = new PrimeNumbersIterator(collectionTest);
    }

    /**
     * Test method next().
     */
    @Test
    public void whenAddNumbersInCollectionThenResultSimple() {
        int expectedResult = 3;
        int expectedResultTwo = 2;
        int expectedResultTree = 5;

        int result = (Integer) iteratorSimpleTest.next();
        int resultTwo = (Integer) iteratorSimpleTest.next();
        int resultTree = (Integer) iteratorSimpleTest.next();

        assertThat(result, is(expectedResult));
        assertThat(resultTwo, is(expectedResultTwo));
        assertThat(resultTree, is(expectedResultTree));
    }

    /**
     * Test method hasNext().
     */
    @Test
    public void whenAddNumbersInCollectionThenResultHasNextTrueForSimpleOrFalseForOther() {

        iteratorSimpleTest.next();
        iteratorSimpleTest.hasNext();
        iteratorSimpleTest.hasNext();
        assertThat(iteratorSimpleTest.hasNext(), is(true));

        iteratorSimpleTest.next();
        assertThat(iteratorSimpleTest.hasNext(), is(false));
    }

}
