package ru.sbulygin;

import org.junit.Before;
import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

/**
 * Class SimpleArrayTest.
 *
 * @author sbulygin.
 * @since 25.05.2017.
 * @version 1.0.
 */
public class SimpleArrayTest {

    /**
     * Array for tests.
     */
    private SimpleArray<Object> testArray;

    /**
     * Preliminary data for tests.
     */
    @Before
    public void infoForTests() {
        final int size = 3;
        testArray = new SimpleArray<>(size);
        testArray.add(3);
        testArray.add(5);
        testArray.add(7);
    }

    /**
     * Test method add.
     * @throws Exception exception test.
     */
    @Test
    public void whenAddValueInArrayThatResultThisValue() throws Exception {
        final int result = 3;
        final int resultTwo = 7;
        assertThat(testArray.get(0), is(result));
        assertThat(testArray.get(2), is(resultTwo));
    }

    /**
     * Test method get.
     * @throws Exception exception test.
     */
    @Test
    public void whenAddValueInArrayThanGetThisValue() throws Exception {
        final int result = 5;
        assertThat(testArray.get(1), is(result));
    }

    /**
     * Test method update.
     * @throws Exception exception test.
     */
    @Test
    public void whenUpdateIndexInArrayThanGetNewValueIndex() throws Exception {
        testArray.update(2, 14);
        final int result = 14;
        assertThat(testArray.get(2), is(result));
    }

    /**
     * Test method delete.
     * @throws Exception exception test.
     */
    @Test
    public void whenDeleteValueIndexZeroThanGetValueFollowingIndexIndexZero() throws Exception {
        testArray.delete(0);
        final int result = 5;
        assertThat(testArray.get(0), is(result));
    }
}
