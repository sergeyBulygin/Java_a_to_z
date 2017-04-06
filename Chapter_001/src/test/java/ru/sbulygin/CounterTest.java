package ru.sbulygin;

import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

/**
* Test class Counter.
*
* @author Sergey Bulygin (sergteletrade@gmail.com).
* @version 1.0.
* @since 22.11.2016.
*/
public class CounterTest {

    /**
    * Test add.
    *
    * Тест метода add.
    */
    @Test
    public void whenAddStartAndFinishThenResultThirty() {
      Counter count = new Counter();
      final int result = count.add(0, 10);
      final int expectResult = 30;
      assertThat(result, is(expectResult));
  }
 }