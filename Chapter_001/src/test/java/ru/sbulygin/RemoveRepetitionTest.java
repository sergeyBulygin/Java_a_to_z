package ru.sbulygin;

import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;


/**
* Test.
*
* @author Sergey Bulygin (sergteletrade@gmail.com).
* @version 1.0.
* @since 14.12.2016.
*/

/**
 * Test class for class RemoveRepetition.
 */
public class RemoveRepetitionTest {

    /**
    * Testing method findDestroy().
    */
    @Test
    public void whenTheStringRepetitionRemovedThenObtainArrayWithoutRepetition() {
        RemoveRepetition testArr = new RemoveRepetition();
        String[] tempArray = {"world1", "world2", "world2", "world1", "world3", "world1"};
        String[] result = testArr.findDestroy(tempArray);
        String[] expectResult = {"world1", "world2", "world3"};
        assertThat(result, is(expectResult));
    }
 }