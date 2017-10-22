package ru.sbulygin;

/**
 * Class SimpleContainer.
 *
 * @author sbulygin.
 * @since 30.05.2017.
 * @version 1.0.
 * @param <E> type.
 */
public interface SimpleContainer<E> extends Iterable<E> {

    /**
     * Method add element to list.
     * @param e element to add.
     */
    void add(E e);



    /**
     * Method get element of list by index.
     * @param index index of element.
     * @return element of list.
     */
    E get(int index);

}
