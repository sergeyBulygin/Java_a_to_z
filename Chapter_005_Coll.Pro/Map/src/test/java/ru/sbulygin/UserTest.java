package ru.sbulygin;


import org.junit.Before;
import org.junit.Test;

import java.util.GregorianCalendar;
import java.util.HashMap;
import java.util.Map;


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
        mapForTest = new HashMap<>();
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
