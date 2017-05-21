package ru.sbulygin;

import java.util.Iterator;
import java.util.NoSuchElementException;

/**
 * Class Iterators.
 *
 * @author sbulygin.
 * @since 21.05.2017.
 * @version 1.0.
 */
public class Iterators implements ConverterIterator, Iterator<Integer> {

    /**
     * Iterator of iterators.
     */
    private  Iterator<Iterator<Integer>> iterators;

    /**
     * Current selected iterator.
     */
    private Iterator<Integer> existingIterator = null;

    @Override
    public Iterator<Integer> convert(Iterator<Iterator<Integer>> it) {
        this.iterators = it;
        return this;
    }

    @Override
    public boolean hasNext() {
        selectExistingIterator();
        return (existingIterator != null && existingIterator.hasNext());
    }

    @Override
    public Integer next() {
        selectExistingIterator();
        if (existingIterator == null) {
            throw new NoSuchElementException("Must be not null");
        }
        return existingIterator.next();
    }

    /**
     * The method checks whether the current iteration of the iterator,
     * if there is return true, if not - go for the following iterators
     * as long as they're either not over or is not found the iterator,
     * who is iteration.
     */
    private void selectExistingIterator() {
        if (existingIterator != null && existingIterator.hasNext()) {
            return;
        }
        existingIterator = null;
        while (iterators.hasNext()) {
            Iterator<Integer> nextIterator = iterators.next();
            if (nextIterator.hasNext()) {
                existingIterator = nextIterator;
                break;
            }
        }
    }

//    public static void main(String[] args)
//    {
//        Iterator<Integer> i1 = Arrays.asList(4, 2, 0, 4, 6, 4, 9).iterator();
//        Iterator<Integer> i2 = Arrays.asList(0, 9, 8, 7, 5).iterator();
//        Iterator<Integer> i4 = new ArrayList<Integer>().iterator();
//        Iterator<Integer> i3 = Arrays.asList(1, 3, 5, 6, 7, 0, 9, 8, 4).iterator();
//        Iterator<Iterator<Integer>> iterator = Arrays.asList(i1, i2, i4, i3).iterator();
//        Iterators iteratorExtension = new Iterators();
//        Iterator<Integer> convertedIterator = iteratorExtension.convert(iterator);
//        while (convertedIterator.hasNext())
//        {
//            System.out.print(convertedIterator.next() + " ");
//       }
//    }

}
