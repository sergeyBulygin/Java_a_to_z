package ru.sbulygin;


import org.junit.Before;
import org.junit.Test;

import java.util.GregorianCalendar;
import java.util.HashMap;
import java.util.Map;


import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertThat;
import static org.junit.Assert.assertTrue;


/**
 * Module UserTest.
 *
 * @author sbulygin.
 * @since 13.07.2017.
 * @version 1.0.
 */
public class UserTest {

    /**
     * First instance of User.
     */
    private User firstUserTest;

    /**
     * Second instance of User.
     */
    private User secondUserTest;

    /**
     * Third instance of User.
     */
    private User thirdUserTest;

    /**
     * The transition to the next line.
     */
    private String enter = System.getProperty("line.separator");

    /**
     * Callection Map for test.
     */
    private Map<User, Object> mapForTest;

    /**
     * The method initializes a string with the transition to the next.
     * @param message Line.
     */
    private void message(String message) {
        System.out.printf("%s%s", message, enter);
    }

    /**
     * The class contains the initialize and instance of the class for tests.
     */
    @Before
    public  void infoForTest() {
        firstUserTest = new User("Sergey", 3,
                                 new GregorianCalendar(1978, 03, 10));
        secondUserTest = new User("Sergey", 3,
                                 new GregorianCalendar(1978, 03, 10));
        thirdUserTest = new User("Sergey", 3,
                new GregorianCalendar(1978, 03, 10));
        mapForTest = new HashMap<>();
    }

    /**
     * Test getter for name field.
     */
    @Test
    public void whenAddNewNameThanGetName() {
        assertThat(firstUserTest.getName(), is("Sergey"));
    }

    /**
     * Test getter for children field.
     */
    @Test
    public void whenAddNewChildrenThanGetChildren() {
        assertThat(firstUserTest.getChildren(), is(3));
    }

    /**
     * Test getter for birthday field.
     */
    @Test
    public void whenAddNewBirthdayThanGetBirthday() {
        assertThat(firstUserTest.getBirthday(), is(new GregorianCalendar(1978, 03, 10)));
    }

    /**
     * Test equals for User.
     */
    @Test
    public void whenEqualsThenExpectedTrue() {
        assertThat(firstUserTest.equals(secondUserTest), is(true));
    }

    /**
     * Test not equals for User.
     */
    @Test
    public void whenNotEqualsThenExpectedFalse() {
        User user = new User("Vasya", 1, new GregorianCalendar(1976, 10, 10));
        assertThat(firstUserTest.equals(user), is(false));
    }

    /**
     * Test not equals for changed User.
     */
    @Test
    public void whenChangeUserThenExpectedFalse() {
        mapForTest.put(firstUserTest, "Bulygin");
        assertThat(firstUserTest.equals(mapForTest.get(firstUserTest)), is(false));
    }

    /**
     * Test hashCode User.
     */
    @Test
    public void whenHashCodeUserThenExpectedHashCode() {
        assertThat(firstUserTest.hashCode(), is(firstUserTest.hashCode()));

        assertThat(firstUserTest.equals(secondUserTest), is(firstUserTest.hashCode() == secondUserTest.hashCode()));
    }

    /**
     * Test equals for User (All rules).
     */
    @Test
    public void whenUserThenEqualsUser() {

        assertTrue(firstUserTest.equals(firstUserTest));

    }

    /**
     * Test equals for User (All rules).
     */
    @Test
    public void whenUserEqualsSecondUserThenSecondUserEqualsUser() {

        boolean expectedResult = firstUserTest.equals(secondUserTest);

        assertThat(expectedResult, is(secondUserTest.equals(firstUserTest)));

    }

    /**
     * Test equals for User (All rules).
     */
    @Test
    public void whenUserEqualsSecondUserAndSecondUserEqualsUserThenTheyEqual() {

        boolean expectedResultOne = firstUserTest.equals(secondUserTest);
        boolean expectedResultTwo = secondUserTest.equals(thirdUserTest);

        assertThat(expectedResultOne, is(expectedResultTwo));

    }

    /**
     * Test equals for User (All rules).
     */
    @Test
    public void whenUserNullThenResultFalse() {

        assertFalse(firstUserTest.equals(null));

    }

    /**
     * Test equals for User (All rules).
     */
    @Test
    public void whenUserEqualsThirdUserThenResultTrue() {

        assertThat(firstUserTest.equals(thirdUserTest), is(true));

    }

    /**
     * Test equals for User (All rules).
     */
    @Test
    public void whenUserEqualsSecondUserThenResultTrue() {

        assertThat(firstUserTest.equals(secondUserTest), is(true));

    }

    /**
     * Test the map with no overridden equals and hashCode.
     */
    @Test
    public void whenAddTwoIdenticalUsersAreNotOverridingEqualsAndHashCodeThenToPrintBothNewValuesEqualsFalse() {

        mapForTest.put(firstUserTest, "Bulygin");
        mapForTest.put(secondUserTest, "Uschenko");

        message("A printout of the map with no overridden equals and hashCode: ");

        System.out.println(firstUserTest.equals(secondUserTest));
        System.out.println(String.format("First User hashCode : %s", firstUserTest.hashCode()));
        System.out.println(String.format("First User hashCode : %s", firstUserTest.hashCode()));
        System.out.println(mapForTest);
    }

    /**
     * Test the map with overridden hashCode.
     */
    @Test
    public void whenAddTwoIdenticalUsersAreOverridingHashCodeThenToPrintBothNewValuesEqualsFalse() {

        mapForTest.put(firstUserTest, "Studies");
        mapForTest.put(secondUserTest, "Java");

        message("A printout of the map with overridden hashCode: ");

        System.out.println(firstUserTest.equals(secondUserTest));
        System.out.println(String.format("First User hashCode : %s", firstUserTest.hashCode()));
        System.out.println(String.format("First User hashCode : %s", firstUserTest.hashCode()));
        System.out.println(mapForTest);
    }

    /**
     * Test the map with overridden equals.
     */
    @Test
    public void whenAddTwoIdenticalUsersAreOverridingEqualsThenToPrintBothNewValuesEqualsTrue() {

        mapForTest.put(firstUserTest, "Collection");
        mapForTest.put(secondUserTest, "Map");

        message("A printout of the map with overridden equals: ");

        System.out.println(firstUserTest.equals(secondUserTest));
        System.out.println(String.format("First User hashCode : %s", firstUserTest.hashCode()));
        System.out.println(String.format("First User hashCode : %s", firstUserTest.hashCode()));
        System.out.println(mapForTest);
    }

    /**
     * the map with  overridden equals and hashCode.
     */
    @Test
    public void whenAddTwoIdenticalUsersAreOverridingEqualsAndHashCodeThenToPrintNewValuesEqualsTrue() {

        mapForTest.put(firstUserTest, "Equals");
        mapForTest.put(secondUserTest, "HashCode");

        message("A printout of the map with  overridden equals and hashCode: ");

        System.out.println(firstUserTest.equals(secondUserTest));
        System.out.println(String.format("First User hashCode : %s", firstUserTest.hashCode()));
        System.out.println(String.format("First User hashCode : %s", firstUserTest.hashCode()));
        System.out.println(mapForTest.get(firstUserTest));
        System.out.println(mapForTest.get(secondUserTest));
    }


}
