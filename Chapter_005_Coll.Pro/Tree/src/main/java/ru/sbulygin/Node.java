package ru.sbulygin;

import java.util.ArrayList;
import java.util.List;


/**
 * Class Node.
 *
 * @author sbulygin.
 * @since 3.08.2017.
 * @version 1.0.
 * @param <E> type.
 */
public class Node<E> {

    /**
     * List the child objects of the parent node.
     */
    private List<Node<E>> children;

    /**
     * Value of node.
     */
    private E value;

    /**
     * The constructor of the Node class.
     *
     * @param value value of node.
     */
    public Node(E value) {
        this.children = new ArrayList<>();
        this.value = value;
    }

    /**
     * Getter for children.
     *
     * @return children.
     */
    public List<Node<E>> getChildren() {
        return children;
    }

    /**
     * Getter for value node.
     *
     * @return value.
     */
    public E getValue() {
        return value;
    }

    @Override
    public String toString() {
        return String.valueOf(value);
    }
}

