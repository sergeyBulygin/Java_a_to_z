package ru.sbulygin;



import java.util.Collection;
import java.util.Iterator;



/**
 * Class CollectionsTest.
 *
 * @author ru.sbulygin.
 * @since 09.04.2017.
 * @version 1.0.
 */
public class CollectionsTest {

    /**
     * The method of adding items to the collection for test.
     * @param collection testing collection.
     * @param line element for testing collection.
     * @param amount the number of elements for testing collection.
     * @return the test time.
     */
    public long add(Collection<String> collection, String line, int amount) {

        long startTime = System.currentTimeMillis();
        for (int index = 0; index < amount; index++) {
            collection.add(String.format("%s - %s", line, index));
        }
        return System.currentTimeMillis() - startTime;
    }

    /**
     * The method of delete items to the collection for test.
     * @param collection testing collection.
     * @param amount the number of elements for testing collection.
     * @return the test time.
     */
    public long delete(Collection<String> collection, int amount) {

        long startTime = System.currentTimeMillis();

        Iterator<String> iterator = collection.iterator();

        for (int index = 0; index < amount; index++) {

            if (iterator.hasNext()) {
                iterator.next();
                iterator.remove();
            }
        }
        return System.currentTimeMillis() - startTime;
    }


}
