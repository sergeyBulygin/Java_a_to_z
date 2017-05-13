package ru.sbulygin.model;

/**
 * Class User.
 *
 * @author ru.sbulygin.
 * @since 28.04.2017.
 * @version 1.0.
 */
public class User {

    /**
     *  Users name field.
     */
    private String name;

    /**
     * Users passport field.
     */
    private String passport;

    /**
     * The constructor of the User class.
     * @param name Users name.
     * @param passport Users passport.
     */
    public User(String name, String passport) {
        this.name = name;
        this.passport = passport;
    }

    /**
     * Getter users name.
     * @return users name.
     */
    public String getName() {
        return name;
    }

    /**
     * Setter users name.
     * @param name users name.
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Getter users passport.
     * @return users passport.
     */
    public String getPassport() {
        return passport;
    }

    /**
     * Setter users passport.
     * @param passport users passport.
     */
    public void setPassport(String passport) {
        this.passport = passport;
    }

    /**
     * Override equals.
     * @param o object.
     * @return Boolean comparison value.
     */
    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof User)) {
            return false;
        }

        User user = (User) o;

        if (getName() != null ? !getName().equals(user.getName()) : user.getName() != null) {
            return false;
        }
        return getPassport() != null ? getPassport().equals(user.getPassport()) : user.getPassport() == null;
    }

    /**
     * Override hash code.
     * @return result.
     */
    @Override
    public int hashCode() {
        int result = getName() != null ? getName().hashCode() : 0;
        result = 31 * result + (getPassport() != null ? getPassport().hashCode() : 0);
        return result;
    }
}
