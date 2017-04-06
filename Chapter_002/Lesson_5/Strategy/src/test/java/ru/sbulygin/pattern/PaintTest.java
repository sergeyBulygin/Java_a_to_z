package ru.sbulygin.pattern;

import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.OutputStream;
import java.io.PrintStream;

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
        OutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));
        test.draw(triangle);
        final String result = out.toString();
        assertThat(result, is("   *   \r\n  * *  \r\n * * * \r\n"));
    }

    /**
     * Method test class Paint.
     */
    @Test
    public void whenShapeSquareThenReturnSquare() {
        Shape square = new Square(3);
        Paint test = new Paint(square);
        OutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));
        test.draw(square);
        final String result = out.toString();
        assertThat(result, is("* * *\r\n* * *\r\n* * *\r\n"));
    }
}
