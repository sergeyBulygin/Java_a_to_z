package ru.sbulygin;

import org.junit.Before;
import org.junit.Test;

import java.util.Iterator;
import java.util.NoSuchElementException;

import static org.hamcrest.core.Is.is;

import static org.junit.Assert.assertThat;


/**
 * Class ReferenceBookTest.
 *
 * @author sbulygin.
 * @since 17.07.2017.
 * @version 1.0.
 */
public class ReferenceBookTest {

    /**
     * First instance of User.
     */
    private ReferenceBook<Integer, String> firstBookTest;

    /**
     * The transition to the next line.
     */
    private String enter = System.getProperty("line.separator");

    /**
     * Iterator of ReferenceBook for test.
     */
    private Iterator iteratorTest;

    /**
     * The method initializes a string with the transition to the next.
     * @param message Line.
     */
    private void message(String message) {
        System.out.printf("%s%s", message, enter);
    }

    /**
     * The class contains the initialize and instance of the class for tests.
     */
    @Before
    public void setUp() {

        firstBookTest = new ReferenceBook();
        iteratorTest = firstBookTest.iterator();

        firstBookTest.insert(1, "one");
        firstBookTest.insert(2, "two");
        firstBookTest.insert(3, "three");


    }

    /**
     * Test insert into the map.
     */
    @Test
    public void whenInsertInMapThreePairThanSizeThree() {
        message("Time adding elements: ");
        final int expectedSize = 3;
        long startSpeedSetTime = System.nanoTime() / 1000;
        firstBookTest.insert(1, "one");
        firstBookTest.insert(2, "two");
        firstBookTest.insert(3, "three");
        long finishSpeedSetTime = System.nanoTime() / 1000;
        System.out.println(String.format("Adding : %s ms", (finishSpeedSetTime - startSpeedSetTime)));
        assertThat(firstBookTest.sizeReferenceBook(), is(expectedSize));
    }

    /**
     * Test getting the value for the key.
     */
    @Test
    public void whenInsertInMapThreePairThanGetValueTwoKey() {
        final String expectedValue = "two";
        final String resultValue = firstBookTest.get(2);
        assertThat(resultValue, is(expectedValue));
    }

    /**
     * Test hashesIndex with null key.
     */
    @Test
    public void whenAddKeyNullThanResultZero() {

        int resultValue = firstBookTest.hashesIndex(null);

        assertThat(resultValue, is(0));
    }

    /**
     * Test NoSuchElementException.
     * @throws NoSuchElementException the exception is when you request the wrong key.
     */
    @Test(expected = NoSuchElementException.class)
    public void whenQueenWrongDirectThatTrowException() throws NoSuchElementException {
        firstBookTest.get(4);
    }

    /**
     * Test remove the value for the key.
     */
    @Test
    public void whenInsertInMapThreePairAndRemoveValueTwoKeyThanSizeTwo() {
        firstBookTest.delete(2);
        final int expectedSize = 2;
        assertThat(firstBookTest.sizeReferenceBook(), is(expectedSize));
    }

    /**
     * Test remove the value for wrong the key.
     */
    @Test
    public void whenInsertInMapThreePairAndRemoveValueFourKeyThanFalse() {
        boolean expectedResult = false;
        assertThat(firstBookTest.delete(4), is(expectedResult));
    }

    /**
     * Test method next().
     */
    @Test
    public void whenIteratorNextThanReturnPair() {

        assertThat(iteratorTest.next().toString(), is("Key: 1 --> one"));
    }

    /**
     * Test method hasNext() (true).
     */
    @Test
    public void whenIteratorHasNextThanReturnTrue() {

        iteratorTest.next();
        iteratorTest.next();

        boolean expectedResult = iteratorTest.hasNext();
        assertThat(expectedResult, is(true));
    }

    /**
     * Test method hasNext() (false).
     */
    @Test
    public void whenIteratorHasNextThanReturnFalse() {

        iteratorTest.next();
        iteratorTest.next();
        iteratorTest.next();

        boolean expectedResult = iteratorTest.hasNext();
        assertThat(expectedResult, is(false));
    }

}