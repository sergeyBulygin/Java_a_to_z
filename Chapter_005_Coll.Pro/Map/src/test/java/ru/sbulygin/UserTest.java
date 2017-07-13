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

    @Test
    public void whenAddTwoIdenticalUsersAreNotOverridingEqualsAndHashCodeThen() {

        mapForTest.put(firstUserTest, "Bulygin");
        mapForTest.put(secondUserTest, "Uschenko");

        message("A printout of the map with no overridden equals and hashCode: ");
        System.out.println(mapForTest);
    }

}