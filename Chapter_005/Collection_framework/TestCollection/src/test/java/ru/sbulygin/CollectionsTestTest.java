package ru.sbulygin;

import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.TreeSet;



import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;


/**
 * Class CollectionsTestTest.
 *
 * @author ru.sbulygin.
 * @since 11.04.2017.
 * @version 1.0.
 */
public class CollectionsTestTest {

    /**
     * A variable number of items added to the collection.
     */
    private final int elementAdd = 2_000_000;

    /**
     * A variable number of elements removed from the collection.
     */
    private final int elementRemove = 1_800_000;

    /**
     * The string value of the element added to the collection.
     */
    private String lineTest = "elementTest";

    /**
     * Test collection ArrayList.
     */
    private ArrayList<String> testArrayList;

    /**
     * Test collection LinkedList.
     */
    private LinkedList<String> testLinkedList;

    /**
     * Test collection TreeSet.
     */
    private TreeSet<String> testTreeSet;

    /**
     * An instance of the class.
     */
    private CollectionsTest collectionsTest;

    /**
     * The element of the collection to the test.
     */
    private String testExpectedElement;

    /**
     * Variable time adding items.
     */
    private long testTimeAdd;

    /**
     * Variable time remove items.
     */
    private long testTimeDelete;

    /**
     * The transition to the next line.
     */
    private String enter = System.getProperty("line.separator");

    /**
     * The method initializes a string with the transition to the next.
     * @param message Line.
     */
    private void message(String message) {
        System.out.printf("%s%s", message, enter);
    }

    /**
     * The class contains the initialize and instance of the class for tests.
     */
    @Before
    public  void infoForTest() {
        testArrayList = new ArrayList<>();
        testLinkedList = new LinkedList<>();
        testTreeSet = new TreeSet<>();
        collectionsTest = new CollectionsTest();
        testExpectedElement = String.format("%s - %s", lineTest, elementRemove);

    }

    /**
     * Test class CollectionTest, c ArrayList collection and check the
     * remaining number of items after adding and removing.
     * @throws Exception Exception when errors test.
     */
    @Test
    public void whenUsedArrayListCollectionAddAndRemoveThenExpectedSize() throws Exception {
        message("Time adding and delete ArrayList elements: ");
        testTimeAdd = collectionsTest.add(testArrayList, lineTest, elementAdd);
        testTimeDelete = collectionsTest.delete(testArrayList, elementRemove);
        System.out.println(String.format("Adding : %s ms", testTimeAdd));
        System.out.println(String.format("Delete : %s ms %s", testTimeDelete, enter));
        assertThat(testArrayList.size(), is(elementAdd - elementRemove));
    }

    /**
     * Test class CollectionTest, c LinkedList collection and check the
     * remaining number of items after adding and removing.
     * @throws Exception Exception when errors test.
     */
    @Test
    public void whenUsedLinkedListCollectionAddAndRemoveThenExpectedSize() throws Exception {
        message("Time adding and delete LinkedList elements: ");
        testTimeAdd = collectionsTest.add(testLinkedList, lineTest, elementAdd);
        testTimeDelete = collectionsTest.delete(testLinkedList, elementRemove);
        System.out.println(String.format("Adding : %s ms", testTimeAdd));
        System.out.println(String.format("Delete : %s ms %s", testTimeDelete, enter));
        assertThat(testLinkedList.size(), is(elementAdd - elementRemove));
    }

    /**
     * Test class CollectionTest, c TreeSet collection and check the
     * remaining number of items after adding and removing.
     * @throws Exception Exception when errors test.
     */
    @Test
    public void whenUsedTreeSetCollectionAddAndRemoveThenExpectedSize() throws Exception {
        message("Time adding and delete TreeSet elements: ");
        testTimeAdd = collectionsTest.add(testTreeSet, lineTest, elementAdd);
        testTimeDelete = collectionsTest.delete(testTreeSet, elementRemove);
        System.out.println(String.format("Adding : %s ms", testTimeAdd));
        System.out.println(String.format("Delete : %s ms %s", testTimeDelete, enter));
        assertThat(testTreeSet.size(), is(elementAdd - elementRemove));
    }

    /**
     * Test class CollectionTest, c ArrayList collection and check the
     * element with index zero and after removal of the elements.
     * @throws Exception Exception when errors test.
     */
    @Test
    public void whenUsedArrayListCollectionAddAndRemoveThenExpectedElement() throws Exception {
        testTimeAdd = collectionsTest.add(testArrayList, lineTest, elementAdd);
        testTimeDelete = collectionsTest.delete(testArrayList, elementRemove);
        assertThat(testArrayList.get(0), is(testExpectedElement));
    }

    /**
     * Test class CollectionTest, c LinkedList collection and check the
     * element with index zero and after removal of the elements.
     * @throws Exception Exception when errors test.
     */
    @Test
    public void whenUsedLinkedListCollectionAddAndRemoveThenExpectedElement() throws Exception {
        testTimeAdd = collectionsTest.add(testLinkedList, lineTest, elementAdd);
        testTimeDelete = collectionsTest.delete(testLinkedList, elementRemove);
        assertThat(testLinkedList.get(0), is(testExpectedElement));
    }

}