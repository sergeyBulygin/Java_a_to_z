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
    private ReplicationSetArray<Integer> listTestDefaultSize;

    /**
     * Instance of ReplicationArrayList with initial size.
     */
    private ReplicationSetArray<Integer> listTestInitSize;

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
        listTestDefaultSize = new ReplicationSetArray<>();
        listTestInitSize = new ReplicationSetArray<>(3);
        iterator = listTestInitSize.iterator();

    }

    /**
     * Test Iterator(hasNext: false).
     * @throws Exception test exception.
     */
    @Test
    public void whenEndSetThatHasNextFalse() throws Exception {
        listTestInitSize.add(110);
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
        listTestInitSize.add(50);
        listTestInitSize.add(70);

        Integer result = (Integer) iterator.next();

        assertThat(result, is(50));
    }

    /**
     * Test Iterator(hasNext: true).
     * @throws Exception test exception.
     */
    @Test
    public void whenAddOneElementThanHasNextResultTrue() throws Exception {
        listTestInitSize.add(50);

        boolean result = iterator.hasNext();

        assertThat(result, is(true));
    }

    /**
     * Test method size.
     * @throws Exception test exception.
     */
    @Test
    public void whenAddFourElementsThanGetSizeFour() throws Exception {
        listTestDefaultSize.add(1);
        listTestDefaultSize.add(2);
        listTestDefaultSize.add(1);


        int result = listTestDefaultSize.size();
        int expectedResult = 2;

        assertThat(result, is(expectedResult));
    }
}
