package ru.sbulygin;

import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

/**
* Test.
*
* @author Sergey Bulygin (sergteletrade@gmail.com).
* @version 1.0.
* @since 18.11.2016.
*/
public class MaxTest {

    /**
    * Тест для класса Max.
    *
    * Тест метода max .
    */
    @Test
    public void whenFirstComparSecondThenTen() {
        Max value = new Max();
        final int result = value.max(10, 5);
        final int expectResult = 10;
        assertThat(result, is(expectResult));
    }

    /**
    * Тест для класса Max.
    *
    * Тест метода max.
    */
    @Test
    public void whenFirstComparSecondComparThirdThenTen() {
        Max value = new Max();
        final int result = value.max(10, 5, 8);
        final int expectResult = 10;
        assertThat(result, is(expectResult));
    }
 }