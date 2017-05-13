package ru.sbulygin;

import org.junit.Test;

import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;


/**
 * Class SortUserTest.
 *
 * @author ru.sbulygin.
 * @since 25.04.2017.
 * @version 1.0.
 */
public class SortUserTest {

    /**
     * New user for test.
     */
    private User testUserOne = new User("Sergey", 39);

    /**
     * New user for test.
     */
    private User testUserTwo = new User("Sasha", 20);

    /**
     * New user for test.
     */
    private User testUserTree = new User("Victoria", 18);

    /**
     * Test sort method of class SortUser.
     * @throws Exception Exception when errors test.
     */
    @Test
    public void whenAddUserListThatGetSortTreeCollection() throws Exception {
        SortUser testSortUser = new SortUser();
        List<User> testUserList = Arrays.asList(testUserOne, testUserTwo, testUserTree);
        Set<User> testUserSet = new TreeSet<>();
        testUserSet.add(testUserOne);
        testUserSet.add(testUserTwo);
        testUserSet.add(testUserTree);
        assertThat(testUserSet, is(testSortUser.sort(testUserList)));
    }

    /**
     * Test sort method of class SortUser, test method sortHash.
     * @throws Exception Exception when errors test.
     */
    @Test
    public void whenSortHashUserListThatGetSortUserListByHash() throws Exception {
        List<User> testUserList = Arrays.asList(testUserOne, testUserTwo, testUserTree);
        List<User> testUserListExpected = Arrays.asList(testUserTree, testUserTwo, testUserOne);
        SortUser testSortUser = new SortUser();
        assertThat(testSortUser.sortHash(testUserList), is(testUserListExpected));
    }

    /**
     * Test sort method of class SortUser, test method sortLength.
     * @throws Exception Exception when errors test.
     */
    @Test
    public void whenSortNameLengthUserListThatGetSortUserListByNameLength() throws Exception {
        List<User> testUserList = Arrays.asList(testUserOne, testUserTwo, testUserTree);
        List<User> testUserListExpected = Arrays.asList(testUserTwo, testUserOne, testUserTree);
        SortUser testSortUser = new SortUser();
        assertThat(testSortUser.sortLength(testUserList), is(testUserListExpected));
    }

}