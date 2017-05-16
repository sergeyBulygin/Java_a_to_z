package ru.sbulygin;

import org.junit.Test;


import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;


/**
 * Class UserTest.
 *
 * @author ru.sbulygin.
 * @since 24.04.2017.
 * @version 1.0.
 */
public class UserTest {

    /**
     * Test age field.
     */
    private int testAge = 30;

    /**
     * Test name field.
     */
    private String testName = "name";

    /**
     * Test instance user one field.
     */
    private User userTest = new User(testName, testAge);

    /**
     * Test instance user field.
     */
    private User userTestTwo = new User(testName, testAge);

    /**
     * Test constructor User class.
     * @throws Exception Exception when errors test.
     */
    @Test
    public void whenAddInConstructorAllThatGetAll() throws Exception {
        assertThat(userTest.getName(), is(testName));
        assertThat(userTest.getAge(), is(testAge));

    }

    /**
     * Test getter and setter name field User class.
     * @throws Exception Exception when errors test.
     */
    @Test
    public void whenSetNameThatGetThisName() throws Exception {
        userTest.setName(testName);
        assertThat(userTest.getName(), is(testName));
    }

    /**
     * Test getter and setter age field User class.
     * @throws Exception Exception when errors test.
     */
    @Test
    public void whenSetAgeThatGetThisAge() throws Exception {
        userTest.setAge(testAge);
        assertThat(userTest.getAge(), is(testAge));
    }

    /**
     * Test equals for User.
     */
    @Test
    public void whenEqualsThenExpectedTrue() {
        assertThat(userTest.equals(userTestTwo), is(true));
    }

    /**
     * Test not equals for User.
     */
    @Test
    public void whenNotEqualsThenExpectedFalse() {
        User user = new User("Vasya", 45);
        assertThat(userTest.equals(user), is(false));
    }

}