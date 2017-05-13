package ru.sbulygin.start;

import org.junit.Test;

import java.io.ByteArrayInputStream;


import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

/**
 * Class ConsoleInputTest.
 *
 * @author ru.sbulygin.
 * @since 24.04.2017.
 * @version 1.0.
 */
public class ConsoleInputTest {

    /**
     * Testing answer.
     */
    private String consoleName = "Testing answer.\\r\\n";

    /**
     * Testing menu key.
     */
    private String consoleMenu = "3";

    /**
     * Testing conclusion the question to the user.
     */
    @Test
    public void whenAddTestAnswerThenReadThisAnswer() {
        java.io.InputStream inputStream = System.in;
        System.setIn(new ByteArrayInputStream(consoleName.getBytes()));
        ConsoleInput consoleInput = new ConsoleInput();
        String result = consoleInput.ask("Testing question: ");
        System.setIn(inputStream);
        assertThat(consoleName, is(result));
    }

    /**
     * Test finding the menu key.
     */
    @Test
    public void whenChangeMenuThenGetKey() {
        final int[] range = {1, 2, 3, 4};
        java.io.InputStream inputStream = System.in;
        System.setIn(new ByteArrayInputStream(consoleMenu.getBytes()));
        ConsoleInput consoleInput = new ConsoleInput();
        int expectedResult = Integer.parseInt(consoleMenu);
        int testKey = consoleInput.ask("Testing question: ", range);
        System.setIn(inputStream);
        assertThat(expectedResult, is(testKey));
    }


}
