package ru.sbulygin;

import java.util.Iterator;

/**
 * Class Tree.
 *
 * @author sbulygin.
 * @since 31.07.2017.
 * @version 1.0.
 * @param <E> type.
 */
public class Tree <E extends Comparable <E>> implements SimpleTree<E> {




    @Override
    public boolean add(E parent, E child) {
        return false;
    }

    @Override
    public Iterator<E> iterator() {
        return null;
    }
}
