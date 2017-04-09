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

    public long add(Collection<String> collection, String line, int amount) {

        long startTime = System.currentTimeMillis();

        for (int index = 0; index < amount; index++) {
            collection.add(line);
        }
        long finishTime = System.currentTimeMillis();
        return finishTime - startTime;
    }

    public long delete(Collection<String> collection, int amount) {

        long startTime = System.currentTimeMillis();

        Iterator<String> iterator = collection.iterator();

        for (int index = 0; index < amount; index++) {

            if (iterator.hasNext()) {
                iterator.next();
                iterator.remove();
            }
        }
        long finishTime = System.currentTimeMillis();
        return finishTime - startTime;
    }



}
