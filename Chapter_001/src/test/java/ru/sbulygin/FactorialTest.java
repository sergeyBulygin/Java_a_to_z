package ru.sbulygin;

import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

/**
* Test.
*
* @author Sergey Bulygin (sergteletrade@gmail.com).
* @version 1.0.
* @since 28.11.2016.
*/
public class FactorialTest {

    /**
    * Тест для класса Factorial.
    *
    * Тест метода fact, a > 0 .
    */
    @Test
    public void whenAddCorrectValueThenReturnFactorial() {
        Factorial factorial = new Factorial();
        final long result = factorial.fact(3);
        final long expectResult = 6L;
        assertThat(result, is(expectResult));
    }

    /**
    * Тест для класса Factorial.
    *
    * Тест метода fact, a = 0 .
    */
    @Test
    public void whenAddNullThenReturnOne() {
        Factorial factorial = new Factorial();
        final long result = factorial.fact(0);
        final long expectResult = 1L;
        assertThat(result, is(expectResult));
    }
 }