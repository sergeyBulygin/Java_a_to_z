package ru.sbulygin;


import java.util.Iterator;

/**
 * Class ReplicationSetLinked.
 *
 * @author sbulygin.
 * @since 7.07.2017.
 * @version 1.0.
 * @param <E> type.
 */
public class ReplicationSetLinked<E> extends ReplicationLinkedList<E> implements Iterator<E> {

    /**
     * Container of objects set collection.
     */
    private ReplicationLinkedList<E> containerSet;

    /**
     * Iterator of set collection.
     */
    private ReplicationLinkedIterator<E> iterSet;

    /**
     * Constructor with default size.
     */
    public ReplicationSetLinked() {
        this.containerSet = new ReplicationLinkedList<>();
        this.iterSet = new ReplicationLinkedIterator<>();
    }

    /**
     * Method adds an item to the collection.
     * @param e type.
     */
    public void add(E e) {

       if (!this.checkDuplicateObjects(e)) {

           this.containerSet.add(e);
       }
    }

    @Override
    public boolean hasNext() {
        return iterSet.hasNext();
    }

    @Override
    public E next() {
        return iterSet.next();
    }

    /**
     * The method checks whether the added object in the collection with the existing.
     * @param e type.
     * @return boolean result of check.
     */
    private boolean checkDuplicateObjects(E e) {
        boolean result = true;
        while (this.iterSet.hasNext()) {
            if (this.iterSet.next().equals(e)) {
                result = false;
            }
        }
        return result;
    }

    public static void main(String[] args) {
        ReplicationSetLinked<Integer> set = new ReplicationSetLinked<>();
        set.add(1);
        System.out.println(set);



    }


}
