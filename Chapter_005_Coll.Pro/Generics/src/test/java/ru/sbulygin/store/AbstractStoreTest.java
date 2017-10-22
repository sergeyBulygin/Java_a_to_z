package ru.sbulygin.store;

import org.junit.Before;
import org.junit.Test;

import java.util.NoSuchElementException;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;


/**
 * Class AbstractStoreTest.
 *
 * @author sbulygin.
 * @since 27.05.2017.
 * @version 1.0.
 */
public class AbstractStoreTest {

    /**
     * UserStore for test.
     */
    private UserStore userStoreTest;

    /**
     * RoleStore for test.
     */
    private RoleStore roleStoreTest;

    /**
     * First user for tests.
     */
    private User userTestOne;

    /**
     * Prepare stores for tests.
     */
    @Before
    public void prepareForTest() {

        this.userStoreTest = new UserStore(4);
        this.roleStoreTest = new RoleStore(4);
        this.userTestOne = new User();
        /*
      Second user for tests.
     */
        User userTestTwo = new User();

        this.userTestOne.setId("1234");
        userTestTwo.setId("5678");

        this.userStoreTest.add(userTestOne);
        this.userStoreTest.add(userTestTwo);
    }

    /**
     * Test get method.
     */
    @Test
    public void whenGetCorrectIdThenResultIdUserTestOne() {

        User result = userStoreTest.get("1234");
        User expectedResult =  this.userTestOne;

        assertThat((result), is(expectedResult));
    }

    /**
     * Test update method.
     */
    @Test
    public void whenUpdateUserTestOneThenGetUserTestTwo() {

        User userUpdate = new User();
        userUpdate.setId("0000");

        this.userStoreTest.update("1234", userUpdate);
        User result = userStoreTest.get("0000");

        assertThat(result, is(userUpdate));

    }

    /**
     * Test add method.
     */
    @Test
    public void whenAddRoleToRoleStoreThenSameRole() {
        Role roleTest = new Role();
        roleTest.setId("12345");

        roleStoreTest.add(roleTest);
        Role result = roleStoreTest.get("12345");

        assertThat(roleTest, is(roleTest));
    }

    /**
     * Test delete method.
     */
    @Test
    public void whenRemoveUserThenNotUserInStore() {
        this.userStoreTest.delete("1234");
        try {
            userStoreTest.get("1234");
        } catch (NoSuchElementException nse) {
            assertThat(nse.getMessage(), is("The item this number is not found"));

        }
    }


}
