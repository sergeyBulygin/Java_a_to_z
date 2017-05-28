package ru.sbulygin.store;

import ru.sbulygin.SimpleArray;

import java.util.NoSuchElementException;

/**
 * Class AbstractStore.
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
     * Method find index element to array by id.
     * @param id id to find.
     * @return index element in store.
     */
    private Integer findId(String id) {
        Integer result = null;
        for (int index = 0; index < this.store.size(); index++) {
            if (this.store.get(index) != null && this.store.get(index).getId().equals(id)) {
                result = index;
                break;
            } else {
                throw new NoSuchElementException("The item this number is not found");
            }
        }
        return result;
    }

    @Override
    public void add(E value) {
        store.add(value);
    }

    @Override
    public void update(String id, E value) {
        store.update(findId(id), value);
    }

    @Override
    public void delete(String id) {
        store.delete(findId(id));
    }

    @Override
    public E get(String id) {
        return store.get(findId(id));
    }
}

