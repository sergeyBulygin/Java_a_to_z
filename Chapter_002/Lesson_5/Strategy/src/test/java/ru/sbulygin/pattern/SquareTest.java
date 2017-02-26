package ru.sbulygin.pattern;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

/**
 * Class SquareTest.
 *
 * @author ru.sbulygin.start.
 * @since 26.02.2017.
 * @version 1.0.
 */
public class SquareTest {
    /**
     * Method test class Square.
     */
    @Test
    public void whenShapeSquareThenReturnSquare() {
        Shape square = new Square(3);
        String result = square.pic(square);
        assertThat(result, is("* * *\r\n* * *\r\n* * *\r\n"));
    }
}
