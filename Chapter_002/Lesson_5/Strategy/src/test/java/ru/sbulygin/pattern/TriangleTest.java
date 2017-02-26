package ru.sbulygin.pattern;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

/**
 * Class TriangleTest.
 *
 * @author ru.sbulygin.start.
 * @since 26.02.2017.
 * @version 1.0.
 */
public class TriangleTest {

    /**
     * Method test class Triangle.
     */
    @Test
    public void whenShapeTriangleThenReturnTriangle() {
        Shape triangle = new Triangle(3);
        String result = triangle.pic(triangle);
        assertThat(result, is("   *   \r\n  * *  \r\n * * * \r\n"));
    }
}
