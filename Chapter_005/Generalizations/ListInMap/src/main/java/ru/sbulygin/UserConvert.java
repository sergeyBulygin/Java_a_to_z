package ru.sbulygin;

import java.util.HashMap;
import java.util.List;


/**
 * Class UserConvert.
 *
 * @author ru.sbulygin.
 * @since 13.04.2017.
 * @version 1.0.
 */
public class UserConvert {

    /**
     * Method converts the user list in the hash table by assigning each an id.
     * @param list users list.
     * @return hash table.
     */
    public HashMap<Integer, User> process(List<User> list) {
        HashMap<Integer, User> userHashMap = new HashMap<>();
        for (User user : list) {
            userHashMap.put(user.getId(), user);
        }
        return userHashMap;
    }
}
