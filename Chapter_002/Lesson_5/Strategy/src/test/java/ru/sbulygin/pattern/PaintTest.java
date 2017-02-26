package ru.sbulygin.pattern;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

/**
 * Class PaintTest.
 *
 * @author ru.sbulygin.start.
 * @since 26.02.2017.
 * @version 1.0.
 */
public class PaintTest {
    /**
     * Method test class Paint.
     */
    @Test
    public void whenShapeTriangleThenReturnTriangle() {
        Shape triangle = new Triangle(3);
        Paint test = new Paint(triangle);
        String result = test.draw(triangle);
        assertThat(result, is("   *   \r\n  * *  \r\n * * * \r\n"));
    }

    /**
     * Method test class Paint.
     */
    @Test
    public void whenShapeSquareThenReturnSquare() {
        Shape square = new Square(3);
        Paint test = new Paint(square);
        String result = square.pic(square);
        assertThat(result, is("* * *\r\n* * *\r\n* * *\r\n"));
    }
}
