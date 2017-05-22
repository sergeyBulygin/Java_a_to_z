package ru.sbulygin;

import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

/**
 * Class EvenNumbersIteratorTest.
 *
 * @author sbulygin.
 * @since 19.05.2017.
 * @version 1.0.
 */
public class EvenNumbersIteratorTest {

    /**
     * Instance class EvenNumbersIterator for test.
     */
    private EvenNumbersIterator iteratorTest;

    /**
     * Collection for test.
     */
    private ArrayList<Integer> collectionTest;

    /**
     * The method contains information for tests.
     */
    @Before
    public void infoForTestEvenNumbersIterator() {
        collectionTest = new ArrayList<>();
        collectionTest.add(1);
        collectionTest.add(3);
        collectionTest.add(2);
        collectionTest.add(5);
        collectionTest.add(4);
        iteratorTest = new EvenNumbersIterator(collectionTest);
    }

    /**
     * Test method next().
     */
    @Test
    public void whenAddNumbersInCollectionThenResultEven() {
        int expectedResult = 2;
        int expectedResultTwo = 4;
        int result = (Integer) iteratorTest.next();
        int resultTwo = (Integer) iteratorTest.next();
        assertThat(result, is(expectedResult));
        assertThat(resultTwo, is(expectedResultTwo));
    }

    /**
     * Test method hasNext().
     */
    @Test
    public void whenAddNumbersInCollectionThenResultHasNextTrue() {
        iteratorTest.next();
        iteratorTest.hasNext();
        assertThat(iteratorTest.hasNext(), is(true));
    }

    /**
     * Test method hasNext().
     */
    @Test
    public void whenAddNumbersInCollectionThenResultHasNextFalse() {
        iteratorTest.next();
        iteratorTest.next();

        assertThat(iteratorTest.hasNext(), is(false));
    }

}
