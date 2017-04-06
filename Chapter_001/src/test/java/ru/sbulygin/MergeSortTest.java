package ru.sbulygin;

import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;


/**
* Test.
*
* @author Sergey Bulygin (sergteletrade@gmail.com).
* @version 1.0.
* @since 22.12.2016.
*/

/**
 * Test class for class MergeSort.
 */
public class MergeSortTest {

    /**
    * Testing method merg().
    */
    @Test
    public void whenTwoSortArrayMergeThenArraySort() {
        final MergeSort testArr = new MergeSort();
        final int[] tempArrayOne = {1, 2, 3, 4, 5, 6};
        final int[] tempArrayTwo = {10, 12, 31, 41, 51, 60};
        final int[] result = testArr.merg(tempArrayOne, tempArrayTwo);
        final int[] expectResult = {1, 2, 3, 4, 5, 6, 10, 12, 31, 41, 51, 60};
        assertThat(result, is(expectResult));
    }
 }