package ru.sbulygin;

import org.junit.Before;
import org.junit.Test;

import java.util.Iterator;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

/**
 * Class ReplicationSetArrayTest.
 *
 * @author sbulygin.
 * @since 24.06.2017.
 * @version 1.0.
 */
public class ReplicationSetArrayTest {

    /**
     * Instance of ReplicationArrayList with default size.
     */
    private ReplicationSetArray<Integer> setTestDefaultSize;

    /**
     * Instance of ReplicationArrayList with initial size.
     */
    private ReplicationSetArray<Integer> setTestInitSize;

    /**
     * Instance Iterator.
     */
    private Iterator iterator;

    /**
     * The method contains information for tests.
     * @throws Exception test exception.
     */
    @Before
    public void setUp() throws Exception {
        setTestDefaultSize = new ReplicationSetArray<>();
        setTestInitSize = new ReplicationSetArray<>(3);
        iterator = setTestInitSize.iterator();

    }

    /**
     * Test Iterator(hasNext: false).
     * @throws Exception test exception.
     */
    @Test
    public void whenEndSetThatHasNextFalse() throws Exception {
        setTestInitSize.add(110);
        iterator.next();

        boolean result = iterator.hasNext();
        assertThat(result, is(false));
    }

    /**
     * Test Iterator, return next element.
     * @throws Exception test exception.
     */
    @Test
    public void whenAfterNextHasElementThanNextReturnThisElement() throws Exception {
        setTestInitSize.add(50);
        setTestInitSize.add(70);

        Integer result = (Integer) iterator.next();

        assertThat(result, is(50));
    }

    /**
     * Test Iterator(hasNext: true).
     * @throws Exception test exception.
     */
    @Test
    public void whenAddOneElementThanHasNextResultTrue() throws Exception {
        setTestInitSize.add(50);

        boolean result = iterator.hasNext();

        assertThat(result, is(true));
    }

    /**
     * Test method size.
     * @throws Exception test exception.
     */
    @Test
    public void whenAddFourElementsThanGetSizeFour() throws Exception {
        setTestDefaultSize.add(1);
        setTestDefaultSize.add(2);
        setTestDefaultSize.add(1);


        int result = setTestDefaultSize.size();
        int expectedResult = 2;

        assertThat(result, is(expectedResult));
    }

    /**
     * Test method resize.
     * @throws Exception test exception.
     */
    @Test
    public void whenAddFourElementsThanSizeFour() throws Exception {
        setTestInitSize.add(1);
        setTestInitSize.add(2);
        setTestInitSize.add(3);
        setTestInitSize.add(4);
        setTestInitSize.add(5);


        int result = setTestInitSize.size();
        int expectedResult = 5;

        assertThat(result, is(expectedResult));
    }
}
