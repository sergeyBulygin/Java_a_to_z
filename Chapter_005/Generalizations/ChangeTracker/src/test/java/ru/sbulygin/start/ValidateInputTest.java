package ru.sbulygin.start;

import org.junit.Test;

import java.io.ByteArrayInputStream;
import java.util.NoSuchElementException;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

/**
 * Class ValidateInputTest.
 *
 * @author ru.sbulygin.
 * @since 24.04.2017.
 * @version 1.0.
 */
public class ValidateInputTest {

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
    public void whenAddTwoNewItemsThenGetSameResultInTracker() {
        java.io.InputStream inputStream = System.in;
        System.setIn(new ByteArrayInputStream(consoleName.getBytes()));
        ValidateInput validate = new ValidateInput();
        String result = validate.ask("Testing question: ");
        System.setIn(inputStream);
        assertThat(consoleName, is(result));
    }

    /**
     * Test finding the menu key.
     */
    @Test
    public void whenChangeMenuItemThenGetKeyItem() {
        final int[] range = {1, 2, 3, 4};
        java.io.InputStream inputStream = System.in;
        System.setIn(new ByteArrayInputStream(consoleMenu.getBytes()));
        ValidateInput validate = new ValidateInput();
        int expectedResult = Integer.parseInt(consoleMenu);
        int keyTest = validate.ask("Testing question: ", range);
        System.setIn(inputStream);
        assertThat(expectedResult, is(keyTest));
    }

    /**
     * Test exception when you run out of menu items.
     */
    @Test(expected = NoSuchElementException.class)
    public void whenChangeDoesNotExistMenuItemThenGetError() {
        final int[] range = {1, 2, 3, 4};
        java.io.InputStream inputStream = System.in;
        System.setIn(new ByteArrayInputStream("7".getBytes()));
        ValidateInput validate = new ValidateInput();
        validate.ask("Testing question: ", range);
        System.setIn(inputStream);
    }

}
