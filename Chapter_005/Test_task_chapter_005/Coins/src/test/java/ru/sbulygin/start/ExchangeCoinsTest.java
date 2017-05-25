package ru.sbulygin.start;


import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

/**
 * Class ExchangeCoinsTest.
 *
 * @author ru.sbulygin.
 * @since 15.05.2017.
 * @version 1.0.
 */
public class ExchangeCoinsTest extends OutputTest {

    /**
     * Getter for test collection.
     * @return test collection.
     */
    public List<Integer> getTestCall() {
        return testCall;
    }

    /**
     * Collection for test.
     */
    private List<Integer> testCall = new ArrayList<>();

    /**
     * Test ExchangeCoins class with one coin.
     */
    @Test
    public void whenCoinsOneAndAmountTwoThatOneOneInConsole() {
        ExchangeCoins test = new ExchangeCoins();
        test.process(new int[]{1}, 2);
        assertThat("1 1 \r\n", is(getOutput().toString()));
    }

    /**
     * Test ExchangeCoins class with two not sort coin.
     */
    @Test
    public void whenCoinsOneTwoAndAmountThreeThatSomeResultInConsole() {
        ExchangeCoins test = new ExchangeCoins();
        test.process(new int[]{2, 1}, 3);
        assertThat("1 1 1 \r\n2 1 \r\n", is(getOutput().toString()));
    }

    /**
     * Test method getSumm.
     */
    @Test
    public void whenListHasTwoValueThatResultAmount() {
        ExchangeCoins test = new ExchangeCoins();
        testCall.add(1);
        testCall.add(1);
        assertThat(2, is(test.getSumm(testCall)));
    }

    /**
     * Test ExchangeCoins class with four coin.
     */
    @Test
    public void whenCoinsOneTwoFiveTenAndAmountTwentyThatSomeResultInConsole() {
        ExchangeCoins test = new ExchangeCoins();
        test.process(new int[]{1, 2, 5, 10}, 20);
        assertThat("10 10 \r\n"
                        + "5 5 10 \r\n"
                        + "5 5 5 5 \r\n"
                        + "2 2 2 2 2 10 \r\n"
                        + "2 2 2 2 2 5 5 \r\n"
                        + "2 2 2 2 2 2 2 2 2 2 \r\n"
                        + "1 2 2 5 10 \r\n"
                        + "1 2 2 5 5 5 \r\n"
                        + "1 2 2 2 2 2 2 2 5 \r\n"
                        + "1 1 2 2 2 2 10 \r\n"
                        + "1 1 2 2 2 2 5 5 \r\n"
                        + "1 1 2 2 2 2 2 2 2 2 2 \r\n"
                        + "1 1 1 2 5 10 \r\n"
                        + "1 1 1 2 5 5 5 \r\n"
                        + "1 1 1 2 2 2 2 2 2 5 \r\n"
                        + "1 1 1 1 2 2 2 10 \r\n"
                        + "1 1 1 1 2 2 2 5 5 \r\n"
                        + "1 1 1 1 2 2 2 2 2 2 2 2 \r\n"
                        + "1 1 1 1 1 5 10 \r\n"
                        + "1 1 1 1 1 5 5 5 \r\n"
                        + "1 1 1 1 1 2 2 2 2 2 5 \r\n"
                        + "1 1 1 1 1 1 2 2 10 \r\n"
                        + "1 1 1 1 1 1 2 2 5 5 \r\n"
                        + "1 1 1 1 1 1 2 2 2 2 2 2 2 \r\n"
                        + "1 1 1 1 1 1 1 2 2 2 2 5 \r\n"
                        + "1 1 1 1 1 1 1 1 2 10 \r\n"
                        + "1 1 1 1 1 1 1 1 2 5 5 \r\n"
                        + "1 1 1 1 1 1 1 1 2 2 2 2 2 2 \r\n"
                        + "1 1 1 1 1 1 1 1 1 2 2 2 5 \r\n"
                        + "1 1 1 1 1 1 1 1 1 1 10 \r\n"
                        + "1 1 1 1 1 1 1 1 1 1 5 5 \r\n"
                        + "1 1 1 1 1 1 1 1 1 1 2 2 2 2 2 \r\n"
                        + "1 1 1 1 1 1 1 1 1 1 1 2 2 5 \r\n"
                        + "1 1 1 1 1 1 1 1 1 1 1 1 2 2 2 2 \r\n"
                        + "1 1 1 1 1 1 1 1 1 1 1 1 1 2 5 \r\n"
                        + "1 1 1 1 1 1 1 1 1 1 1 1 1 1 2 2 2 \r\n"
                        + "1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 5 \r\n"
                        + "1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 2 2 \r\n"
                        + "1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 2 \r\n"
                        + "1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 \r\n", is(getOutput().toString()));
    }

}
