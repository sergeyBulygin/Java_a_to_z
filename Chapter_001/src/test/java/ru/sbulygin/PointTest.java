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
public class PointTest {

    /**
    * Тест для класса Point.
    *
    * Тест метода distanceTo.
    */
    @Test
    public void whenCalculationDistanceFromOnePointToSecondThenResultTwo() {
      final Point x = new Point(10d, 7d);
      final Point y = new Point(12d, 7d);
      double result = x.distanceTo(y);
      assertThat(result, is(2d));
    }
 }