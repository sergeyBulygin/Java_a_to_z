package ru.sbulygin;

import java.util.Calendar;

/**
 * Module User.
 *
 * @author sbulygin.
 * @since 12.07.2017.
 * @version 1.0.
 */
public class User {

    /**
     * Name of user.
     */
    private final String name;

    /**
     * Amount of children.
     */
    private final int children;

    /**
     * Birthday of user.
     */
    private final Calendar birthday;

    /**
     * Constructor of user class.
     * @param name name of user.
     * @param children amount of children.
     * @param birthday birthday of user.
     */
    public User(String name, int children, Calendar birthday) {
        this.name = name;
        this.children = children;
        this.birthday = birthday;
    }

    /**
     * Getter for name.
     * @return name of user.
     */
    public String getName() {
        return name;
    }

    /**
     * Getter for amount children.
     * @return amount children.
     */
    public int getChildren() {
        return children;
    }

    /**
     * Getter for birthday.
     * @return birthday of user
     */
    public Calendar getBirthday() {
        return birthday;
    }

    @Override
    public String toString() {
        return this.name;
    }

//    @Override
//    public int hashCode() {
//        int result = name != null ? name.hashCode() : 0;
//        result = 31 * result + children;
//        result = 31 * result + (birthday != null ? birthday.hashCode() : 0);
//        return result;
//    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }

        User user = (User) o;

        return children == user.children &&
                (name != null ? name.equals(user.name) : user.name == null) &&
                (birthday != null ? birthday.equals(user.birthday) : user.birthday == null);
    }
}
