package ru.sbulygin;


import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertThat;
import static org.hamcrest.core.Is.is;

/**
 * Class ReplicationQueueTest.
 *
 * @author sbulygin.
 * @since 10.06.2017.
 * @version 1.0.
 */
public class ReplicationQueueTest {

    /**
     * Instance ReplicationQueue.
     */
    private ReplicationQueue queueTest;

    /**
     * The method contains information for tests.
     */
    @Before
    public void prepareReplicationQueueTest() {
        this.queueTest = new ReplicationQueue<>();
    }

    /**
     * Test method myPeek. Method get first element.
     * @throws Exception exception test.
     */
    @Test
    public void whenAddNewElementThanReturnThis() throws Exception {
        queueTest.myOffer(10);
        queueTest.myOffer(20);
        assertThat(queueTest.myPeek(), is(10));
    }

    /**
     * Test method myOffer.
     * @throws Exception exception test. Method add element.
     */
    @Test
    public void whenAddFourElementsThatReturnFourSize() throws Exception {
        queueTest.myOffer(10);
        queueTest.myOffer(2);
        queueTest.myOffer(145);
        queueTest.myOffer(112);
        assertThat(queueTest.size(), is(4));
    }

}