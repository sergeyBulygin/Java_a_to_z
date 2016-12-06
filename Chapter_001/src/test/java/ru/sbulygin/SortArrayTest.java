package ru.sbulygin;

import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;


/**
* Test.
*
* @author Sergey Bulygin (sergteletrade@gmail.com).
* @version 1.0.
* @since 06.12.2016.
*/

/**
 * Test class for class SortArray.
 */
public class SortArrayTest {

    /**
    * Testing method bubbleSort.
    */
    @Test
    public void whenUnsortedArraysThenReturnSortedArray() {
        final SortArray testArr = new SortArray();
        final int[] tempArray = {6, 4, 2, 5, 1, 3};
        final int[] result = testArr.bubbleSort(tempArray);
        final int[] expectResult = {1, 2, 3, 4, 5, 6};
        assertThat(result, is(expectResult));
    }
 }