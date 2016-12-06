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
 * Test class for class Turn.
 */
public class TurnTest {

    /**
    * Testing method bsck() accepts an array with even length.
    */
    @Test
    public void whenArrayAnEvenLengthThenArrayInvert() {
        final Turn testArr = new Turn();
        final int[] tempArray = {1, 2, 3, 4, 5, 6};
        final int[] result = testArr.back(tempArray);
        final int[] expectResult = {6, 5, 4, 3, 2, 1};
        assertThat(result, is(expectResult));
    }

     /**
    * Testing method bsck() accepts an array with odd length.
    */
    @Test
    public void whenArrayAnOddLengthThenArrayInvert() {
        final Turn testArr = new Turn();
        final int[] tempArray = {1, 2, 3, 4, 5, 6, 7};
        final int[] result = testArr.back(tempArray);
        final int[] expectResult = {7, 6, 5, 4, 3, 2, 1};
        assertThat(result, is(expectResult));
    }
 }