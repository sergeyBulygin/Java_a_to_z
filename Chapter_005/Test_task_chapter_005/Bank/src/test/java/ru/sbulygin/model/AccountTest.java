package ru.sbulygin.model;

import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

/**
 * Class AccountTest.
 *
 * @author ru.sbulygin.
 * @since 03.05.2017.
 * @version 1.0.
 */
public class AccountTest {

    /**
     * Test value field.
     */
    private final double testValue = 999.9;

    /**
     * Test requisites field.
     */
    private final String testRequisites = "1234567890";

    /**
     * Test instance account field.
     */
    private Account testAccount = new Account(testValue, testRequisites);

    /**
     * Test instance account two field.
     */
    private Account testAccountTwo = new Account(testValue, testRequisites);

    /**
     * Test constructor Account class.
     */
    @Test
    public void whenCreateNewObjectThenGetAllField() {
        assertThat(testAccount.getValue(), is(testValue));
        assertThat(testAccount.getRequisites(), is(testRequisites));
    }

    /**
     * Test getter and setter  fields Account class.
     */
    @Test
    public void whenSetNewDataThenGetNewData() {
        final double expectedValue = 99.9;
        final String expectedRequisites = "111111";
        testAccount.setValue(expectedValue);
        testAccount.setRequisites(expectedRequisites);
        assertThat(testAccount.getValue(), is(expectedValue));
        assertThat(testAccount.getRequisites(), is(expectedRequisites));
    }

    /**
     * Test equals Account class.
     */
    @Test
    public void whenEqualsThenGetTrue() {
        assertThat(testAccount.equals(testAccountTwo), is(true));
    }

    /**
     * Test hashCode Account class.
     */
    @Test
    public void whenHashCodeThenGetResult() {
        Account account = new Account(0.0, null);
        assertThat(account.hashCode(), is(0));
    }

    /**
     * Test equals Account class.
     */
    @Test
    public void whenNotEqualsThenGetFalse() {
        assertThat(testAccount.equals(null), is(false));
    }

    /**
     * Test equals user class.
     */
    @Test
    public void whenValueFieldNullEqualsThenGetFalse() {
        final double value = 0.0;
        Account account = new Account(value, testRequisites);
        assertThat(testAccount.equals(account), is(false));
    }

    /**
     * Test equals user class.
     */
    @Test
    public void whenRequisitesFieldNullEqualsThenGetFalse() {
        final String requisites = null;
        Account account = new Account(testValue, requisites);
        assertThat(testAccount.equals(account), is(false));
    }

}
