package ru.sbulygin;

import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;


/**
 * Class UserConvertTest.
 *
 * @author ru.sbulygin.
 * @since 13.04.2017.
 * @version 1.0.
 */
public class UserConvertTest {

    /**
     * Id first user field.
     */
    private int idOneUser = 10;

    /**
     * Id second user field.
     */
    private int idTwoUser = 20;

    /**
     * Id of the third field.
     */
    private int idTreeUser = 30;

    /**
     * Name first user field.
     */
    private String nameOneUser = "nameOne";

    /**
     * Name second user field.
     */
    private String nameTwoUser = "nameTwo";

    /**
     * Name of the third field.
     */
    private String nameTreeUser = "nameTree";

    /**
     * City first user field.
     */
    private String cityOneUser = "cityOne";

    /**
     * City second user field.
     */
    private String cityTwoUser = "cityTwo";

    /**
     * City of the third field.
     */
    private String cityTreeUser = "cityTree";

    /**
     * First user field.
     */
    private User oneUser;

    /**
     * Second user field.
     */
    private User twoUser;

    /**
     * Of the third field.
     */
    private User treeUser;

    /**
     * Test list user field.
     */
    private List<User> testListUser;

    /**
     * Test instance UserConvert class.
     */
    private UserConvert testConvert;

    /**
     * he class contains the initialize and instance of the class for tests.
     */
    @Before
    public void infoForTest() {
        oneUser = new User(idOneUser, nameOneUser, cityOneUser);
        twoUser = new User(idTwoUser, nameTwoUser, cityTwoUser);
        treeUser = new User(idTreeUser, nameTreeUser, cityTreeUser);
        testListUser = new ArrayList<>();
        testConvert = new UserConvert();
    }

    /**
     * Method expected result of the test UserConvert class.
     * @return expected HashMap.
     */
    private HashMap<Integer, User> expectedResult() {
        HashMap<Integer, User> expectedHashMap = new HashMap<>();
        expectedHashMap.put(oneUser.getId(), oneUser);
        expectedHashMap.put(twoUser.getId(), twoUser);
        expectedHashMap.put(treeUser.getId(), treeUser);
        return expectedHashMap;
    }

    /**
     * A method of testing a class UserConvert.
     * @throws Exception Exception when errors test.
     */
    @Test
    public void process() throws Exception {
        testListUser.add(oneUser);
        testListUser.add(twoUser);
        testListUser.add(treeUser);
        assertThat(expectedResult(), is(testConvert.process(testListUser)));
    }

}