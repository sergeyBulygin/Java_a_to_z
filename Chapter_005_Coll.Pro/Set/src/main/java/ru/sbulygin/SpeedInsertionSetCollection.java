package ru.sbulygin;


import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;


/**
 * Class SpeedInsertionSetCollection.
 *
 * @author sbulygin.
 * @since 10.07.2017.
 * @version 1.0.
 * @param <E> type.
 */
public class SpeedInsertionSetCollection<E> implements SimpleSet<E> {

    /**
     * Collection of elements.
     */
    private List<E> container;

    /**
     * Constructor with default size.
     */
    public SpeedInsertionSetCollection() {
        this.container = new ArrayList<>();
    }

    @Override
    public void add(E e) {
        int counterContainer = 0;
        if (container.size() > 0) {
            counterContainer = lookingPlaceToInsertObject(e, 0, container.size() - 1);
        }
        if (counterContainer != -1) {
            container.add(counterContainer, e);
        }
    }

    /**
     * Method by using binary search with recursion
     * looking for the best place to add object, and checks for duplicates.
     * @param element a collection element which must be inserted.
     * @param leftPart the left part of the elements collection.
     * @param rightPart the right part of the elements collection.
     * @return search result.
     */
    private int lookingPlaceToInsertObject(E element, int leftPart, int rightPart) {

        int searchResult;
        int middlePart = ((rightPart - leftPart) >> 1) + leftPart;

        if (element.hashCode() == container.get(middlePart).hashCode()) {
            searchResult = -1;
        } else if (leftPart == rightPart && element.hashCode() != container.get(middlePart).hashCode()) {
            searchResult = middlePart;
        } else if (element.hashCode() > container.get(middlePart).hashCode()) {
            searchResult = lookingPlaceToInsertObject(element, middlePart + 1, rightPart);
        } else {
            searchResult = lookingPlaceToInsertObject(element, leftPart, middlePart);
        }
        return searchResult;
    }

    /**
     * The method returns the size of the collection.
     * @return the size of the collection.
     */
    public int sizeContainer() {
        return this.container.size();
    }

    @Override
    public Iterator<E> iterator() {
        return new IteratorSpeedSet();
    }

    /**
     * Iterator for this collection.
     */
    private class IteratorSpeedSet implements Iterator<E> {

        private int position = 0;

        @Override
        public boolean hasNext() {
            return this.position != container.size();
        }

        @Override
        public E next() {
            return  container.get(position++);
        }
    }


}
