package ru.sbulygin;

/**
 * Class Account.
 *
 * @author ru.sbulygin.
 * @since 28.04.2017.
 * @version 1.0.
 */
public class Account {

    /**
     * The amount of money users field.
     */
    private double value;

    /**
     * Users requisites.
     */
    private String requisites;

    /**
     * The constructor of the Account class.
     * @param value money users.
     * @param requisites  users requisites.
     */
    public Account(double value, String requisites) {
        this.value = value;
        this.requisites = requisites;
    }

    /**
     * Getter value field.
     * @return money users.
     */
    public double getValue() {
        return value;
    }

    /**
     * Setter value field.
     * @param value money users.
     */
    public void setValue(double value) {
        this.value = value;
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
        if (o == null || getClass() != o.getClass()) {
            return false;
        }

        Account account = (Account) o;

        if (Double.compare(account.getValue(), getValue()) != 0) {
            return false;
        }
        return requisites != null ? requisites.equals(account.requisites) : account.requisites == null;
    }

    /**
     * Override hash code.
     * @return result.
     */
    @Override
    public int hashCode() {
        int result;
        long temp;
        temp = Double.doubleToLongBits(getValue());
        result = (int) (temp ^ (temp >>> 32));
        result = 31 * result + (requisites != null ? requisites.hashCode() : 0);
        return result;
    }
}
