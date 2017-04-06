package ru.sbulygin.checkBreckets;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;


/**
 * Class CheckBracketsTest.
 *
 * @author ru.sbulygin.start.
 * @since 19.03.2017.
 * @version 1.0.
 */
public class CheckBracketsTest {

    /**
     * Testing method checkSymbol.
     */
    @Test
    public void whenAddStringLineAndCheckThatResultTrueAndFalse() {
        CheckBrackets testBrackets = new CheckBrackets();
        boolean result = testBrackets.checkSymbol("((()())()()()())))");
        boolean resultTwo = testBrackets.checkSymbol("))))))((((((");
        boolean resultTree = testBrackets.checkSymbol("())(");
        boolean resultFour = testBrackets.checkSymbol("()");
        boolean resultFive = testBrackets.checkSymbol("((()(((())))(())()))");
        assertThat(result, is(false));
        assertThat(resultTwo, is(false));
        assertThat(resultTree, is(false));
        assertThat(resultFour, is(true));
        assertThat(resultFive, is(true));

    }

}