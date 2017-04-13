package ru.sbulygin;


import org.junit.Test;

import java.util.Arrays;
import java.util.List;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;


/**
 * Class ConvertList.
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
    public void toArray() throws Exception {
        final List<Integer> testCollection = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        final int[][] expectedArray = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}, {10, 0, 0}};
        final int rows = 4;
        assertThat(expectedArray, is(new ConvertList().toArray(testCollection, rows)));
    }

}