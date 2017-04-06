package ru.sbulygin;

import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;


/**
* Test.
*
* @author Sergey Bulygin (sergteletrade@gmail.com).
* @version 1.0.
* @since 23.12.2016.
*/

/**
 * Test class for class SubstringSearch.
 */
public class SubstringSearchTest {

    /**
    * Testing method contains().
    * When the substring is 3 characters.
    */
    @Test
    public void whenStringFromAToZContainsSubstringMnoThenResultTrue() {
        final SubstringSearch testArr = new SubstringSearch();
        String tempArrayOrigin = "abcdefghijklmnopqrstuvwxyz";
        String tempArraySub = "mno";
        assertThat(testArr.contains(tempArrayOrigin, tempArraySub), is(true));
    }

    /**
    * Testing method contains().
    * When the substring is 6 characters.
    */
    @Test
    public void whenStringFromAToZContainsSubstringKlmnopThenResultTrue() {
        final SubstringSearch testArr = new SubstringSearch();
        String tempArrayOrigin = "abcdefghijklmnopqrstuvwxyz";
        String tempArraySub = "klmnop";
        assertThat(testArr.contains(tempArrayOrigin, tempArraySub), is(true));
    }

    /**
    * Testing method contains().
    * When it does not contain the substring.
    */
    @Test
    public void whenStringFromAToZContainsSubstringFghwThenResultFalse() {
        final SubstringSearch testArr = new SubstringSearch();
        String tempArrayOrigin = "abcdefghijklmnopqrstuvwxyz";
        String tempArraySub = "fghw";
        assertThat(testArr.contains(tempArrayOrigin, tempArraySub), is(false));
    }
 }