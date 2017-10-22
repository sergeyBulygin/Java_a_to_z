package ru.sbulygin.store;

/**
 * Class Store.
 *
 * @author sbulygin.
 * @since 27.05.2017.
 * @version 1.0.
 * @param <E> type.
 */
public interface  Store<E extends Base> {

    /**
     * Method add element to store.
     * @param value value element to add.
     */
    void add(E value);

    /**
     * Method update element to store by id.
     * @param id id of element.
     * @param value value element to update.
     */
    void update(String id, E value);

    /**
     * Method remove element to store by id.
     * @param id id of element.
     */
    void delete(String id);

    /**
     * Method get element from store.
     * @param id id of element.
     * @return element from store.
     */
    E get(String id);


}

