package ru.sbulygin;

import org.junit.Before;
import org.junit.Test;

import java.util.Iterator;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;


/**
 * Class ReplicationLinkedListTest.
 *
 * @author sbulygin.
 * @since 05.06.2017.
 * @version 1.0.
 */
public class ReplicationLinkedListTest {

    /**
     *  Instance ReplicationLinkedList for test.
     */
    private ReplicationLinkedList<Integer> testList;

    /**
     * Instance Iterator.
     */
    private Iterator iterator;

    /**
     * The method contains information for tests.
     */
    @Before
    public void setUp() {
        this.testList = new ReplicationLinkedList<>();
        this.iterator = testList.iterator();
    }

    /**
     * Test Iterator(hasNext: false).
     * @throws Exception test exception.
     */
    @Test
    public void whenEndLinkedListThatHasNextFalse() throws Exception {
        testList.add(2);
        iterator.next();

        boolean result = iterator.hasNext();
        assertThat(result, is(false));
    }

    /**
     * Test method add. Case 1.
     * @throws Exception test exception.
     */
    @Test
    public void whenAddFourInLinkedListElementsThanGetIndexNullElement() throws Exception {
        testList.add(1);
        testList.add(2);
        testList.add(3);
        testList.add(6);
        testList.add(8);
        testList.add(12);
        testList.add(465);
        testList.add(4567);

        assertThat(testList.get(6), is(465));


    }

    /**
     * Test method add. Case 2.
     * @throws Exception test exception.
     */
    @Test
    public void whenAddFourInLinkedListElementsThanGetIndexOneElement() throws Exception {
        testList.add(1);
        testList.add(2);
        testList.add(3);
        testList.add(4);


        assertThat(testList.get(1), is(2));


    }

    /**
     * Test method add. Case 3.
     * @throws Exception test exception.
     */
    @Test
    public void whenAddFourInLinkedListElementsThanGetIndexTwoElement() throws Exception {
        testList.add(1);
        testList.add(2);
        testList.add(3);
        testList.add(4);


        assertThat(testList.get(2), is(3));


    }

    /**
     * Test method add. Case 4.
     * @throws Exception test exception.
     */
    @Test
    public void whenAddFourInLinkedListElementsThanGetIndexTreeElement() throws Exception {
        testList.add(1);
        testList.add(2);
        testList.add(3);
        testList.add(4);

        assertThat(testList.get(3), is(4));

    }

    /**
     * Test method size.
     * @throws Exception test exception.
     */
    @Test
    public void whenAddInLinkedListTreeElementsThanGetSizeTree() throws Exception {
        testList.add(1);
        testList.add(2);
        testList.add(3);

        int result = testList.size();
        int expectedResult = 3;

        assertThat(result, is(expectedResult));

    }

    /**
     * Test Iterator(hasNext: true).
     * @throws Exception test exception.
     */
    @Test
    public void whenAddOneElementInLinkedListThanHasNextResultTrue() throws Exception {
        testList.add(200);

        boolean result = iterator.hasNext();

        assertThat(result, is(true));
    }

    /**
     * Test Iterator, return next element.
     * @throws Exception test exception.
     */
    @Test
    public void whenAfterNextHasElementThanNextReturnThisElement() throws Exception {
        testList.add(200);
        testList.add(300);

        assertThat(iterator.next(), is(200));
    }

    /**
     * Test remove.
     * @throws Exception test exception.
     */
    @Test
    public void whenAfterRemoveElementThanNextReturnThisElement() throws Exception {
        testList.add(1);
        testList.add(2);
        testList.remove(0);

        assertThat(iterator.next(), is(2));
    }

}
