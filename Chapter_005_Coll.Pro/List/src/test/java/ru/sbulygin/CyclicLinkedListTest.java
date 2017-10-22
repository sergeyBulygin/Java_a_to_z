package ru.sbulygin;

import org.junit.Before;
import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

/**
 * Class CyclicLinkedListTest.
 *
 * @author sbulygin.
 * @since 10.06.2017.
 * @version 1.0.
 */
public class CyclicLinkedListTest {

    /**
     * Instance CyclicLinkedList.
     */
    private CyclicLinkedList testCheckCyclic;

    /**
     * Instance first node CyclicLinkedList.
     */
    private CyclicLinkedList.Node oneNodeTest;

    /**
     * Instance second node CyclicLinkedList.
     */
    private CyclicLinkedList.Node twoNodeTest;

    /**
     * Instance third node CyclicLinkedList.
     */
    private CyclicLinkedList.Node threeNodeTest;

    /**
     * The method contains information for tests.
     */
    @Before
    public void prepareCyclicLinkedListTest() {

        this.testCheckCyclic = new CyclicLinkedList();
        this.oneNodeTest = new CyclicLinkedList.Node(1);
        this.twoNodeTest = new CyclicLinkedList.Node(2);
        this.threeNodeTest = new CyclicLinkedList.Node(2);
    }

    /**
     * Test method hasCycle. Result true.
     * @throws Exception exception test.
     */
    @Test
    public void whatSetLastNodeFirstNodeThatResultTrue() throws Exception {
        oneNodeTest.setNext(twoNodeTest);
        twoNodeTest.setNext(threeNodeTest);
        threeNodeTest.setNext(oneNodeTest);

        boolean expectedResult = testCheckCyclic.hasCycle(oneNodeTest);

        assertThat(expectedResult, is(true));

    }

    /**
     * Test method hasCycle. Result false.
     * @throws Exception exception test.
     */
    @Test
    public void whatSetLastNodeNextNodeThatResultFalse() throws Exception {
        oneNodeTest.setNext(twoNodeTest);
        twoNodeTest.setNext(threeNodeTest);


        boolean expectedResult = testCheckCyclic.hasCycle(oneNodeTest);

        assertThat(expectedResult, is(false));

    }

}
