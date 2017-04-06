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
 * Test class for class RotationArray.
 */
public class RotationArrayTest {

    /**
    * Testing method turn().
    */
    @Test
    public void whenAddArrayThenRotationArray() {
        final RotationArray testArr = new RotationArray();
        final int[][] tempArray = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        final int[][] result = testArr.turn(tempArray);
        final int[][] expectResult = {{3, 6, 9}, {2, 5, 8}, {1, 4, 7}};
        assertThat(result, is(expectResult));
    }
 }