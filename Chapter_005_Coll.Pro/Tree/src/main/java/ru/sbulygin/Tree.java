package ru.sbulygin;


import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/**
 * Class Tree.
 *
 * @author sbulygin.
 * @since 31.07.2017.
 * @version 1.0.
 * @param <E> type.
 */
public class Tree<E extends Comparable<E>> implements SimpleTree<E> {

    /**
     * The root node.
     */
    private Node<E> root;

    /**
     * The constructor of the Tree class.
     * @param root the root node.
     */
    public Tree(Node<E> root) {
        this.root = root;
    }

    /**
     * The method checks the node value of the parent in the child list.
     * And returns the result.
     * @param children list the child objects.
     * @param parent parent node.
     * @return search result parent node.
     */
    private Node<E> find(List<Node<E>> children, E parent) {
        Node<E> result = null;
        for (Node<E> child : children) {
            if (child.getValue().compareTo(parent) == 0) {
                result = child;
                break;
            }
            result = find(child.getChildren(), parent);
        }
        return result;
    }

    @Override
    public boolean add(E parent, E child) {
        Node<E> resultAdd = root;
        if (root.getValue().compareTo(parent) != 0) {
            resultAdd = find(root.getChildren(), parent);
        }
        boolean parentExists = resultAdd != null;
        if (parentExists) {
            Node<E> node = new Node<>(child);
            resultAdd.getChildren().add(node);
        }
        return parentExists;
    }

    /**
     * The method checks whether a binary tree.
     * @return boolean result.
     */
    public boolean isBinary() {
        boolean result = root.getChildren().size() <= 2;
        if (result) {
            result = isBinaryRecursion(root.getChildren());
        }
        return result;
    }

    /**
     * The method recursively checks the number of child objects in each node.
     * @param children list of children.
     * @return boolean result.
     */
    private boolean isBinaryRecursion(List<Node<E>> children) {
        boolean result = true;
        for (Node<E> child : children) {
            if (child.getChildren().size() > 2) {
                result = false;
                break;
            }
            result = isBinaryRecursion(child.getChildren());
        }
        return result;
    }

    @Override
    public Iterator<E> iterator() {
        return new TreeIterator();
    }

    /**
     * A class that implements an iterator for the structure of the elementary tree.
     */
    private class TreeIterator implements Iterator<E> {

        /**
         * Temporary storage of items in the tree.
         */
        private Queue<Node<E>> queue;

        /**
         * Constructor TreeIterator.
         */
        private TreeIterator() {
            queue = new LinkedList<>();
            queue.add(root);
        }

        @Override
        public boolean hasNext() {
            return !queue.isEmpty();
        }

        @Override
        public E next() {
            Node<E> result = queue.poll();
            queue.addAll(result.getChildren());
            return result.getValue();
        }


    }


}
