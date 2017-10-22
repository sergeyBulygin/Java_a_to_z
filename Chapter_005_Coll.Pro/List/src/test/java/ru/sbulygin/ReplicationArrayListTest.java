package ru.sbulygin;

import org.junit.Before;
import org.junit.Test;

import java.util.Iterator;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

/**
 * Class ReplicationArrayListTest.
 *
 * @author sbulygin.
 * @since 30.05.2017.
 * @version 1.0.
 */
public class ReplicationArrayListTest {

    /**
     * Instance of ReplicationArrayList with default size.
     */
    private ReplicationArrayList<Integer> listTestDefaultSize;

    /**
     * Instance of ReplicationArrayList with initial size.
     */
    private ReplicationArrayList<Integer> listTestInitSize;

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
        listTestDefaultSize = new ReplicationArrayList<>();
        listTestInitSize = new ReplicationArrayList<>(5);
        iterator = listTestInitSize.iterator();


    }

    /**
     * Test Iterator(hasNext: false).
     * @throws Exception test exception.
     */
    @Test
    public void whenEndArrayThatHasNextFalse() throws Exception {
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
        listTestInitSize.add(110);
        listTestInitSize.add(120);

        Integer result = (Integer) iterator.next();

        assertThat(result, is(120));
    }

    /**
     * Test Iterator(hasNext: true).
     * @throws Exception test exception.
     */
    @Test
    public void whenAddOneElementThanHasNextResultTrue() throws Exception {
        listTestInitSize.add(110);

        boolean result = iterator.hasNext();

        assertThat(result, is(true));
    }

    /**
     * Test method add.
     * @throws Exception test exception.
     */
    @Test
    public void whenAddFourElementsThanGetAllElement() throws Exception {
        listTestDefaultSize.add(1);
        listTestDefaultSize.add(2);
        listTestDefaultSize.add(3);
        listTestDefaultSize.add(4);

        assertThat(listTestDefaultSize.get(0), is(1));
        assertThat(listTestDefaultSize.get(1), is(2));
        assertThat(listTestDefaultSize.get(2), is(3));
        assertThat(listTestDefaultSize.get(3), is(4));

    }

    /**
     * Test method size.
     * @throws Exception test exception.
     */
    @Test
    public void whenAddFourElementsThanGetSizeFour() throws Exception {
        listTestDefaultSize.add(1);
        listTestDefaultSize.add(2);
        listTestDefaultSize.add(3);
        listTestDefaultSize.add(4);

        int result = listTestDefaultSize.size();
        int expectedResult = 4;

        assertThat(result, is(expectedResult));
    }

    /**
     * Test method resize.
     * @throws Exception test exception.
     */
    @Test
    public void whenAddElevenElementsThanGetSizeEleven() throws Exception {
        listTestInitSize.add(1);
        listTestInitSize.add(2);
        listTestInitSize.add(3);
        listTestInitSize.add(4);
        listTestInitSize.add(5);
        listTestInitSize.add(6);
        listTestInitSize.add(7);
        listTestInitSize.add(8);
        listTestInitSize.add(9);
        listTestInitSize.add(10);
        listTestInitSize.add(11);

        int result = listTestInitSize.size();
        int expectedResult = 11;

        assertThat(result, is(expectedResult));
    }



}