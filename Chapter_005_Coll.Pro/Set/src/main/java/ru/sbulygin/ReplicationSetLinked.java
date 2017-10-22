package ru.sbulygin;


/**
 * Class ReplicationSetLinked.
 *
 * @author sbulygin.
 * @since 7.07.2017.
 * @version 1.0.
 * @param <E> type.
 */
public class ReplicationSetLinked<E> extends ReplicationLinkedList<E> implements SimpleSet<E> {

    @Override
    public void add(E e) {
        if (checkDuplicateObjects(e)) {
            super.add(e);
        }
    }

    /**
     * The method checks whether the added object in the collection with the existing.
     * @param e type.
     * @return boolean result of check.
     */
    private boolean checkDuplicateObjects(E e) {

        boolean result = true;
        Entry<E> searchElement = getElement();
        if (size() > 0) {
            while (searchElement != null) {
                if (searchElement.getEntryElement() == e) {
                    result = false;
                    break;
                }
                searchElement = searchElement.getNext();
            }
        }
        return result;
    }


}
