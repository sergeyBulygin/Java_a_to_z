package ru.sbulygin;

import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.TreeSet;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

/**
 * Created by sjbul on 4/11/17.
 */
public class CollectionsTestTest {

    private final int elementAdd = 2000000;

    private final int elementRemove = 1800000;

    private String lineTest = "elementTest";

    private long testTimeAdd;

    private long testTimeRemove;




    @Test
    public void whenUsedCollectionAddAndRemoveThenExpectedSize() throws Exception {
        ArrayList<String> testArrayList = new ArrayList<>();
        LinkedList<String> testLinkedList = new LinkedList<>();
        TreeSet<String> testTreeSet = new TreeSet<>();
        CollectionsTest collectionsTest = new CollectionsTest();
        testTimeAdd = collectionsTest.add(testArrayList, lineTest, elementAdd);
        testTimeRemove = collectionsTest.delete(testArrayList, elementRemove);
        assertThat(testArrayList.size(), is(elementAdd - elementRemove ));
    }

    @Test
    public void delete() throws Exception {
        LinkedList<String> testLinkedList = new LinkedList<>();
    }

}