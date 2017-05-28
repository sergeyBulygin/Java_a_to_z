package ru.sbulygin.store;

import ru.sbulygin.SimpleArray;

/**
 * Class SimpleArray.
 *
 * @author sbulygin.
 * @since 27.05.2017.
 * @version 1.0.
 * @param <E> type.
 */
public abstract class AbstractStore<E extends Base> implements Store<E> {

    /**
     * Array of store.
     */
    private SimpleArray<E> store;

    /**
     * Constructor AbstractStore.
     * @param sizeStore size of store.
     */
    public AbstractStore(int sizeStore) {
        this.store = new SimpleArray<>(sizeStore);
    }

    /**
     * Getter for store field.
     * @return store.
     */
    public SimpleArray<E> getStore() {
        return store;
    }

    /**
     *
     * @param id
     * @return
     */
    private Integer findId(String id) {
        Integer result = null;
        for (int index = 0; index < this.store.size(); index++) {
            if ( ) {

            }
        }
    }


}

