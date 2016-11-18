package ru.sbulygin;

import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;
import static org.hamcrest.number.IsCloseTo.closeTo;

/**
* Test.
*
* @author Sergey Bulygin (sergteletrade@gmail.com).
* @version 1.0.
* @since 18.11.2016.
*/
public class TriangleTest {

    /**
    * Тест для класса Triangle.
    *
    * Тест метода area
    * При условиии невозможности постороить треугольник.
    */
    @Test
    public void whenTriangleFalseThenAreaNull() {
        final Triangle triangleFalse = new Triangle(new Point(0, 0), new Point(12, 9), new Point(0, 0));
        double result = triangleFalse.area();
        assertThat(result, is(0d));
    }

    /**
    * Тест для класса Triangle.
    *
    * Тест метода area.
    * При возможности построения треугольника.
    */
    @Test
    public void whenTriangleTrueThenAreaResult() {
        final Triangle triangleTrue = new Triangle(new Point(10, 7), new Point(12, 9), new Point(14, 7));
        double result = triangleTrue.area();
        final double expectResult = 3.9;
        final double expectCorrect = 0.1;
        assertThat(result, is(closeTo(expectResult, expectCorrect)));
    }
 }