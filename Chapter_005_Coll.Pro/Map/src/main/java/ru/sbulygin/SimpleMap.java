package ru.sbulygin;

/**
 * Class SimpleMap.
 *
 * @author sbulygin.
 * @since 17.07.2017.
 * @version 1.0.
 * @param <T> type.
 * @param <V> type.
 */
public interface SimpleMap<T, V> extends Iterable {

    /**
     * Method adds a new pair key-value.
     * @param key key.
     * @param value value.
     * @return returns the boolean value of the ability to insert
     */
    boolean insert(T key, V value);

    /**
     * The method returns a value by key.
     * @param key key.
     * @return returns a value.
     */
    V get(T key);

    /**
     * The method removes the value at the key.
     * @param key key.
     * @return boolean value of the ability to remove.
     */
    boolean delete(T key);

}
