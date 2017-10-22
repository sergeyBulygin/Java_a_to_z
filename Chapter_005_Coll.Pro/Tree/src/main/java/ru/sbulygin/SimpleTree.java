package ru.sbulygin;



/**
 * Class SimpleTree.
 *
 * @author sbulygin.
 * @since 31.07.2017.
 * @version 1.0.
 * @param <E> type.
 */
public interface SimpleTree<E extends Comparable<E>> extends Iterable<E> {

    /**
     * Add the child to the parent.
     * Parent can have the child list.
     * @param parent parent.
     * @param child child.
     * @return boolean result.
     */
    boolean add(E parent, E child);

}
