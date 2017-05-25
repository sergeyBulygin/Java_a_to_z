package ru.sbulygin;

/**
 * Class SimpleArray.
 *
 * @author sbulygin.
 * @since 25.05.2017.
 * @version 1.0.
 * @param <E> type.
 */
public class SimpleArray<E> {

    /**
     * An array of objects.
     */
    private Object[] objects;

    /**
     * Index of recently added item.
     */
    private int index = 0;

    /**
     * Constructor of SimpleArray.
     * @param size size of array.
     */
    public SimpleArray(int size) {
        this.objects = new Object[size];
    }

    /**
     * Method adds a new value to the array.
     * @param value value to add.
     */
    public void add(E value) {
        this.objects[index++] = value;
    }

    /**
     * The method returns a value from an array by position.
     * @param position position of value array.
     * @return value to array.
     */
    public E get(int position) {
        return (E) this.objects[position];
    }

    /**
     * The method updates the value for the key.
     * @param position position of value array.
     * @param value value to array.
     */
    public void update(int position, E value) {
        this.objects[position] = value;
    }

    /**
     * The method removes the value at the key.
     * @param position position of value array.
     */
    public void delete(int position) {
        System.arraycopy(objects, position + 1, objects, position, objects.length - position - 1);
    }

}
