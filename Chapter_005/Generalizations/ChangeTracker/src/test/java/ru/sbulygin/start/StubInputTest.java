package ru.sbulygin.start;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;


/**
 * Class StubInputTest.
 *
 * @author ru.sbulygin.
 * @since 24.04.2017.
 * @version 1.0.
 */
public class StubInputTest {

    /**
     *  Testing array with answers.
     */
    private  String[] answersTest = {"1", "2", "3", "4"};

    /**
     * Testing StubInput class.
     */
    @Test
    public void whenExpectedInputThenGetExpectedAnswer() {
        StubInput stubInput = new StubInput(answersTest);
        for (String key : answersTest) {
            String expectedResult = stubInput.ask("Testing question: ");
            assertThat(key, is(expectedResult));
        }
    }

}
