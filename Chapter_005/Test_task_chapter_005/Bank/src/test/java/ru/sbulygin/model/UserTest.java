package ru.sbulygin.model;

import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

/**
 * Class UserTest.
 *
 * @author ru.sbulygin.
 * @since 03.05.2017.
 * @version 1.0.
 */
public class UserTest {

    /**
     * Test name field.
     */
    private final String testName = "name";

    /**
     * Test passport field.
     */
    private final String testPassport = "12345";

    /**
     * Test instance user field.
     */
    private User testUser = new User(testName, testPassport);

    /**
     * Test second instance user two field.
     */
    private User testUserTwo = new User(testName, testPassport);

    /**
     * Test constructor User class.
     */
    @Test
    public void whenCreateNewObjectThenGetAllField() {
        assertThat(testUser.getName(), is(testName));
        assertThat(testUser.getPassport(), is(testPassport));
    }

    /**
     * Test getter and setter  fields User class.
     */
    @Test
    public void whenSetNewDataThenGetNewData() {
         final String expectedName = "testNameTwo";
         final String expectedPassport = "111111";
         testUser.setName(expectedName);
         testUser.setPassport(expectedPassport);
         assertThat(testUser.getName(), is(expectedName));
         assertThat(testUser.getPassport(), is(expectedPassport));
    }

    /**
     * Test equals user class.
     */
    @Test
    public void whenEqualsThenGetTrue() {
        assertThat(testUser.equals(testUserTwo), is(true));
    }

    /**
     * Test hashCode user class.
     */
    @Test
    public void whenHashCodeThenGetResult() {
        User user = new User(null, null);
        assertThat(user.hashCode(), is(0));
    }

    /**
     * Test equals user class.
     */
    @Test
    public void whenNotEqualsThenGetFalse() {
        assertThat(testUser.equals(null), is(false));
    }

    /**
     * Test equals user class.
     */
    @Test
    public void whenPassportFieldNullEqualsThenGetFalse() {
        final String passport = null;
        User user = new User(testName, passport);
        assertThat(testUser.equals(user), is(false));
    }

    /**
     * Test equals user class.
     */
    @Test
    public void whenNameFieldNullEqualsThenGetFalse() {
        final String name = null;
        User user = new User(name, testPassport);
        assertThat(testUser.equals(user), is(false));
    }

}
