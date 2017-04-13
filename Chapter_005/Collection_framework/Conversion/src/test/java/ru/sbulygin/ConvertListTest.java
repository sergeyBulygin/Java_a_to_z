package ru.sbulygin;


import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;


/**
 * Class ConvertListTest.
 *
 * @author ru.sbulygin.
 * @since 13.04.2017.
 * @version 1.0.
 */
public class ConvertListTest {

    /**
     * Method tests converting a two-dimensional array to an ArrayList.
     * @throws Exception Exception when errors test.
     */
    @Test
    public void whenUsedTwoDimensionalArrayThatArrayList() throws Exception {
        final int[][] testArray = {{1, 2, 3, 4, 5}, {6, 7, 8, 9, 10}};
        final List<Integer> expectedCollection = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        assertThat(expectedCollection, is(new ConvertList().toList(testArray)));

    }

    /**
     * Method tests conversion of ArrayList to two dimensional array.
     * @throws Exception Exception when errors test.
     */
    @Test
    public void whenUsedCollectionArrayListThatTwoDimensionalArray() throws Exception {
        final List<Integer> testCollection = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        final int[][] expectedArray = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}, {10, 0, 0}};
        final int rows = 4;
        assertThat(expectedArray, is(new ConvertList().toArray(testCollection, rows)));
    }

    /**
     * Test method which converts the arrays worksheet in a single worksheet Integer.
     * @throws Exception Exception when errors test.
     */
    @Test
    public void whenUsedArraysListsThatOneIntegerList() throws Exception {
        final List<int[]> testList = new ArrayList<int[]>();
        testList.add(new int[]{5, 6});
        testList.add(new int[]{2, 3, 4, 6});
        final List<Integer> expectedList = Arrays.asList(5, 6, 2, 3, 4, 6);
        assertThat(expectedList, is(new ConvertList().convert(testList)));
    }

}