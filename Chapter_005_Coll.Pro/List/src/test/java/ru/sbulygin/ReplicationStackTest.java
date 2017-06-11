package ru.sbulygin;

import org.junit.Before;
import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

/**
 * Class ReplicationStackTest.
 *
 * @author sbulygin.
 * @since 10.06.2017.
 * @version 1.0.
 */
public class ReplicationStackTest {

    /**
     * Instance ReplicationQueue.
     */
    private ReplicationStack stackTest;

    /**
     * The method contains information for tests.
     */
    @Before
    public void prepareReplicationQueueTest() {
        this.stackTest = new ReplicationStack<>();
    }

    /**
     * Test method myPush. Method add element.
     * @throws Exception exception test.
     */
    @Test
    public void whenAddFiveElementThanSizeFive() throws Exception {
        stackTest.myPush(1);
        stackTest.myPush(4);
        stackTest.myPush(12);
        stackTest.myPush(576);
        stackTest.myPush(23);

        assertThat(stackTest.size(), is(5));

    }

    /**
     * Test method myPeek. Method get last element.
     * @throws Exception exception test.
     */
    @Test
    public void whenAddTwoElementThanGetLastElement() throws Exception {
        stackTest.myPush(1);
        stackTest.myPush(4);

        assertThat(stackTest.myPeek(), is(4));

    }

}