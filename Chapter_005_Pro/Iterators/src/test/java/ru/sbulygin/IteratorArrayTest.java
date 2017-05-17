package ru.sbulygin;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

/**
 * Class IteratorArrayTest.
 *
 * @author sbulygin.
 * @since 17.05.2017.
 * @version 1.0.
 */
public class IteratorArrayTest {

    /**
     * Test method next() IteratorArray class.
     */
    @Test
    public void whenWeUseNextMethodThenWeObtainFollowingValue() {
        IteratorArray it = new IteratorArray(new int[][]{{4, 9}, {1, 7}});
        it.next();
        int result = (Integer) it.next();
        int expectedResult = 9;
        assertThat(result, is(expectedResult));
    }

    /**
     * Test method hasNext() IteratorArray class. Result false.
     */
    @Test
    public void whenWeUseHasNextMethodThenResultFalse() {
        IteratorArray it = new IteratorArray(new int[][]{{1}});
        it.next();
        it.hasNext();
        boolean result = it.hasNext();
        assertThat(result, is(false));
    }

    /**
     * Test method hasNext() IteratorArray class.Result true.
     */
    @Test
    public void whenWeUseHasNextMethodThenResultTrue() {
        IteratorArray it = new IteratorArray(new int[][]{{1, 2}});
        it.next();
        it.hasNext();
        boolean result = it.hasNext();
        assertThat(result, is(true));
    }



}
