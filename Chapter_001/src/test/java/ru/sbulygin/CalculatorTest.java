package ru.sbulygin;

import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

/**
* Test.
*
* @author Sergey Bulygin (sergteletrade@gmail.com).
* @version 1.0.
* @since 13.11.2016.
*/
public class CalculatorTest {
    /**
    * Test add.
    *
    * Тест метода add.
    */
    @Test
    public void whenAddFirstToSecondThenResultTwo() {
      Calculator cal = new Calculator();
      cal.add(1d, 1d);
      double result = cal.getResult();
      assertThat(result, is(2d));
  }

    /**
    *
    * Тест метода sabtract.
    *
    */
    @Test
    public void whenSubtractFirstFromSecondThenResultOne() {
      Calculator cal = new Calculator();
      cal.subtract(2d, 1d);
      double result = cal.getResult();
      assertThat(result, is(1d));
  }

  /**
    *
    * Тест метода multiply.
    *
    */
    @Test
    public void whenMultiplyTheFirstToTheSecondThenResultTwo() {
      Calculator cal = new Calculator();
      cal.multiply(2d, 1d);
      double result = cal.getResult();
      assertThat(result, is(2d));
  }

  /**
    *
    * Тест метода div.
    *
    */
    @Test
    public void whenDivTheFirstToTheSecondThenResultTwo() {
      Calculator cal = new Calculator();
      cal.div(2d, 1d);
      double result = cal.getResult();
      assertThat(result, is(2d));
  }
 }