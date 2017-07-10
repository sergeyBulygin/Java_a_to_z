package ru.sbulygin;

import org.junit.Before;
import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

/**
 * Class ReplicationSetLinkedTest.
 *
 * @author sbulygin.
 * @since 10.07.2017.
 * @version 1.0.
 */
public class ReplicationSetLinkedTest {

    /**
     *  Instance ReplicationLinkedList for test.
     */
    private ReplicationSetLinked<Integer> testSet;


    /**
     * The method contains information for tests.
     */
    @Before
    public void setUp() {
        this.testSet = new ReplicationSetLinked<>();

    }

    @Test
    public void whenAddObjectInCollectionThenSizeNotDuplicated() throws Exception {

        testSet.add(1);
        testSet.add(1);
        testSet.add(2);
        testSet.add(3);
        testSet.add(4);
        testSet.add(5);
        testSet.add(5);
        testSet.add(5);
        testSet.add(6);
        testSet.add(7);

        int result = testSet.size();
        int expectedResult = 7;

        assertThat(result, is(expectedResult));
    }

}