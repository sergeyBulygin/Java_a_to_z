package ru.sbulygin;

/**
 * Class SimpleSet.
 *
 * @author sbulygin.
 * @since 20.06.2017.
 * @version 1.0.
 * @param <E> type.
 */
public interface SimpleSet<E> extends Iterable<E> {

    /**
     * Method add element to list.
     * @param e element to add.
     */
    void add(E e);


}
