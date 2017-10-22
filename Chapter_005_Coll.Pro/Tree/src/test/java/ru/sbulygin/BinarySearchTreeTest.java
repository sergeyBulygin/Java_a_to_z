package ru.sbulygin;

import org.junit.Before;
import org.junit.Test;

import java.util.Iterator;


import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

/**
 * Class BinarySearchTreeTest.
 *
 * @author sbulygin.
 * @since 02.09.2017.
 * @version 1.0.
 */
public class BinarySearchTreeTest {

    /**
     * Instance of Tree.
     */
    private BinarySearchTree<Integer> treeBinaryTest;

    /**
     * Iterator of BinarySearchTree for test.
     */
    private Iterator iteratorTest;

    /**
     * The class contains the initialize and instance of the class for tests.
     */
    @Before
    public void setUp() {
        treeBinaryTest = new BinarySearchTree<>(90);
        iteratorTest = treeBinaryTest.iterator();

        treeBinaryTest.add(95);
        treeBinaryTest.add(42);
    }

    /**
     * Test constructor into the tree.
     */
    @Test
    public void whenCreateTreeThanResultRootElement() {
        int result = treeBinaryTest.iterator().next();

        assertThat(result, is(90));
    }

    /**
     * Test method add into the tree.
     */
    @Test
    public void whenAddChildrenInTreeThanResultLeftChild() {
        iteratorTest.next();
        int result = (int) iteratorTest.next();

        assertThat(result, is(42));
    }

    /**
     * Test method add for child node into the tree.
     */
    @Test
    public void whenAddChildrenForChildTreeThanResultThisChild() {
        treeBinaryTest.add(17);

        iteratorTest.next();
        iteratorTest.next();
        iteratorTest.next();

        assertThat(iteratorTest.next(), is(17));
    }

    /**
     * Test iterator method next() (true) into the binary tree.
     */
    @Test
    public void whenHasNextThanResultTrue() {

        iteratorTest.next();

        assertThat(iteratorTest.hasNext(), is(true));
    }

    /**
     * Test iterator method next() (false) into the binary tree.
     */
    @Test
    public void whenHasNextThanResultFalse() {

        iteratorTest.next();
        iteratorTest.next();
        iteratorTest.next();

        assertThat(iteratorTest.hasNext(), is(false));
    }


}
