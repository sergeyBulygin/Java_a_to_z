package ru.sbulygin;

import java.util.List;
import java.util.Set;
import java.util.TreeSet;

/**
 * Class SortUser.
 *
 * @author ru.sbulygin.
 * @since 25.04.2017.
 * @version 1.0.
 */
public class SortUser {

    /**
     * The method sorts the list of users by age and returns the TreeSet collection.
     * @param userList the list of users.
     * @return TreeSet collection with users.
     */
    public Set<User> sort(List<User> userList) {
        Set<User> userSet = new TreeSet<>();
        for (User user : userList) {
            userSet.add(user);
        }
        return userSet;
    }

}
