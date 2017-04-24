package ru.sbulygin;


import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;


/**
 * Class UserTest.
 *
 * @author ru.sbulygin.
 * @since 13.04.2017.
 * @version 1.0.
 */
public class UserTest {

    /**
     * Test id field.
     */
    private int testId = 108;

    /**
     * Test name field.
     */
    private String testName = "name";

    /**
     * Test city field.
     */
    private String testCity = "city";

    /**
     * Test instance user field.
     */
    private User testUser = new User(testId, testName, testCity);

    /**
     * Test constructor User class.
     * @throws Exception Exception when errors test.
     */
    @Test
    public void whenConstructorSetAllForUserThatGetAll() throws Exception {
        assertThat(testUser.getId(), is(testId));
        assertThat(testUser.getName(), is(testName));
        assertThat(testUser.getCity(), is(testCity));
    }

    /**
     * Test getter and setter id field User class.
     * @throws Exception Exception when errors test.
     */
    @Test
    public void whenSetIdThanGetId() throws Exception {
        testUser.setId(testId);
        assertThat(testUser.getId(), is(testId));
    }

    /**
     * Test getter and setter name field User class.
     * @throws Exception Exception when errors test.
     */
    @Test
    public void whenSetNameThanGetName() throws Exception {
        testUser.setName(testName);
        assertThat(testUser.getName(), is(testName));
    }

    /**
     * Test getter and setter city field User class.
     * @throws Exception Exception when errors test.
     */
    @Test
    public void whenSetCityThanGetCity() throws Exception {
        testUser.setCity(testCity);
        assertThat(testUser.getCity(), is(testCity));
    }

}