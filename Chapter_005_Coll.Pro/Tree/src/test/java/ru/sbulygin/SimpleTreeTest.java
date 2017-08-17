package ru.sbulygin;

import org.junit.Before;
import org.junit.Test;

import java.util.Iterator;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

/**
 * Class Tree.
 *
 * @author sbulygin.
 * @since 17.08.2017.
 * @version 1.0.
 */
public class SimpleTreeTest {

    /**
     * Instance of Tree.
     */
    private Tree<String> treeTest;

    /**
     * Iterator of Tree for test.
     */
    private Iterator iteratorTest;

    /**
     * Instance of Node.
     */
    private Node<String> rootTest;

    /**
     * The class contains the initialize and instance of the class for tests.
     */
    @Before
    public void setUp() {
        rootTest = new Node<>("root");
        treeTest = new Tree<>(rootTest);

        iteratorTest = treeTest.iterator();

        treeTest.add("root", "one");
        treeTest.add("root", "two");
        treeTest.add("root", "three");


    }

    /**
     * Test constructor into the tree.
     */
    @Test
    public void whenCreateTreeThanResultRootElement() {
        String result = treeTest.iterator().next();
        assertThat(result, is("root"));
    }

    /**
     * Test method add into the tree.
     */
    @Test
    public void whenAddChildrenInTreeThanResultAllChildren() {
        String result = rootTest.getChildren().toString();
        assertThat(result, is("[one, two, three]"));
    }

    /**
     * Test method add for child node into the tree.
     */
    @Test
    public void whenAddChildrenForChildTreeThanResultThisChild() {
        treeTest.add("one", "four");
        iteratorTest.next();
        iteratorTest.next();
        iteratorTest.next();
        iteratorTest.next();

        assertThat(iteratorTest.next(), is("four"));
    }

    /**
     * Test iterator method next() (true) into the tree.
     */
    @Test
    public void whenHasNextThanResultTrue() {

        iteratorTest.next();

        assertThat(iteratorTest.hasNext(), is(true));
    }

    /**
     * Test iterator method next() (false) into the tree.
     */
    @Test
    public void whenHasNextThanResultFalse() {

        iteratorTest.next();
        iteratorTest.next();
        iteratorTest.next();
        iteratorTest.next();

        assertThat(iteratorTest.hasNext(), is(false));
    }


}
