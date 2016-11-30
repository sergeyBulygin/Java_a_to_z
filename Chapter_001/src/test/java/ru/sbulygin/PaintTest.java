package ru.sbulygin;

import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

/**
* Test.
*
* @author Sergey Bulygin (sergteletrade@gmail.com).
* @version 1.0.
* @since 29.11.2016.
*/
public class PaintTest {

    /**
    * Тест для класса Paint.
    * Значение height = 3.
    * Тест метода pyramid .
    */
    @Test
    public void whenHeightTreeThenCreatePiramid() {
        Paint pyramid = new Paint();
        final String result = pyramid.pyramid(3);
        String expectResult = ("   ^   \r\n  ^ ^  \r\n ^ ^ ^ \r\n");
        assertThat(result, is(expectResult));
    }

    /**
    * Тест для класса Paint.
    * Значение height = 1.
    * Тест метода pyramid .
    */
    @Test
    public void whenHeightOneThenCreatePiramid() {
        Paint pyramid = new Paint();
        final String result = pyramid.pyramid(1);
        String expectResult = (" ^ \r\n");
        assertThat(result, is(expectResult));
    }
 }