package ru.sbulygin;

/**
 * Class User.
 *
 * @author ru.sbulygin.
 * @since 24.04.2017.
 * @version 1.0.
 */
public class User implements Comparable<User> {

    /**
     * User name field.
     */
    private String name;

    /**
     * User age field.
     */
    private int age;

    /**
     * Constructor User class.
     * @param name user name.
     * @param age user age.
     */
    public User(String name, int age) {
        this.name = name;
        this.age = age;
    }

    /**
     * Getter name field.
     * @return user name.
     */
    public String getName() {
        return this.name;
    }

    /**
     * Setter name field.
     * @param name new user name.
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Getter age field.
     * @return user age.
     */
    public int getAge() {
        return age;
    }

    /**
     * Setter age field.
     * @param age new user age.
     */
    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public int compareTo(User o) {
        return this.age - o.getAge();
    }

}
