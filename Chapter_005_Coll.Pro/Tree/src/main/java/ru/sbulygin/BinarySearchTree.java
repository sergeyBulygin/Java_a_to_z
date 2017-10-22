package ru.sbulygin;


import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;


/**
 * Class BinarySearchTree.
 *
 * @author sbulygin.
 * @since 28.08.2017.
 * @version 1.0.
 * @param <E> type.
 */
public class BinarySearchTree<E extends Comparable<E>> implements SimpleTree<E> {

    /**
     * The root node.
     */
    private Node<E> root;

    /**
     * Constructor of BinarySearchTree.
     * @param e value of root.
     */
    public BinarySearchTree(E e) {
        this.root = new Node<>(e);
    }

    /**
     * The method adds a new value to the collection.
     * @param e value.
     * @return value recursively add.
     */
    public boolean add(E e) {
        return addRecursion(root, e);
    }

    /**
     * The method checks the possibility of adding value recursively.
     * by iterating through all nodes of the collection.
     * @param node node of collection.
     * @param e value of node.
     * @return boolean result.
     */
    private boolean addRecursion(Node<E> node, E e) {
        boolean resultAdd = false;
        int temp = node.getValue().compareTo(e);
        if (temp != 0) {
            Node<E> child = temp < 0 ? node.getRightChild() : node.getLeftChild();
            if (child != null) {
                resultAdd = addRecursion(child, e);
            } else {
                Node<E> newChild = new Node<>(e);
                if (temp < 0) {
                    node.setRightChild(newChild);
                } else {
                    node.setLeftChild(newChild);
                }
                resultAdd = true;
            }
        }
        return resultAdd;
    }

    @Override
    public Iterator<E> iterator() {
        return new TreeBinarySearchIterator();
    }

    /**
     * A class that implements an iterator for the structure of the binary tree.
     */
    private class TreeBinarySearchIterator implements Iterator<E> {

        /**
         * Temporary storage of items in the tree.
         */
        private Queue<Node<E>> queue;

        /**
         * Constructor TreeBinarySearchIterator.
         */
        private TreeBinarySearchIterator() {
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

    @Override
    public boolean add(E parent, E child) {
        return false;
    }


    /**
     * The class initializes the node with the passed value.
     * @param <E> type.
     */
    static class Node<E> {

        /**
         * Value of node.
         */
        private E value;

        /**
         * Right child of parent.
         */
        private Node<E> rightChild;

        /**
         * Left child of parent.
         */
        private Node<E> leftChild;

        /**
         * Constructor of Node.
         * @param value value of node.
         */
         Node(E value) {
            this.value = value;
        }

        /**
         * Getter for value.
         * @return this value.
         */
        public E getValue() {
            return value;
        }

        /**
         * Getter for right child.
         * @return this right child.
         */
        public Node<E> getRightChild() {
            return rightChild;
        }

        /**
         * Getter for left child.
         * @return this left child.
         */
        public Node<E> getLeftChild() {
            return leftChild;
        }

        /**
         * Setter of right child.
         * @param rightChild right child.
         */
        public void setRightChild(Node<E> rightChild) {
            this.rightChild = rightChild;
        }

        /**
         * Setter of left child.
         * @param leftChild left child.
         */
        public void setLeftChild(Node<E> leftChild) {
            this.leftChild = leftChild;
        }

        /**
         * Method return all children of parent.
         * @return children.
         */
        public List<Node<E>> getChildren() {
            List<Node<E>> children = new ArrayList<>();
            if (leftChild != null) {
                children.add(leftChild);
            }
            if (rightChild != null) {
                children.add(rightChild);
            }
            return children;
        }

        @Override
        public String toString() {
            return String.format("Value: %s", value.toString());
        }


    }


}
