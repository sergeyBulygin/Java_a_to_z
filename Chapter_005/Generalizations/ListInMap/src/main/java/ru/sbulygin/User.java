package ru.sbulygin;

/**
 * Class User.
 *
 * @author ru.sbulygin.
 * @since 13.04.2017.
 * @version 1.0.
 */
public class User {

    /**
     * Field id for User.
     */
    private int id;

    /**
     * Field name for User.
     */
    private String name;

    /**
     * Field city for User.
     */
    private String city;

    /**
     * The constructor of the User class.
     * @param id user id.
     * @param name user name.
     * @param city user city.
     */
    public User(int id, String name, String city) {
        this.id = id;
        this.name = name;
        this.city = city;
    }

    /**
     * Getter id field, return user id.
     * @return user id.
     */
    public int getId() {
        return this.id;
    }

    /**
     * Setter id field, create new id.
     * @param id id.
     */
    public void setId(int id) {
        this.id = id;
    }

    /**
     * Getter name field, return user name.
     * @return user name.
     */
    public String getName() {
        return this.name;
    }

    /**
     * Setter name field, create new name.
     * @param name name.
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Getter city field, return city user.
     * @return user city.
     */
    public String getCity() {
        return this.city;
    }

    /**
     * Setter city field, create new city.
     * @param city city.
     */
    public void setCity(String city) {
        this.city = city;
    }
}
