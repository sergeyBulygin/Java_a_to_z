package ru.sbulygin;

import java.util.*;

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

public static void main(String[] args) {

    CollectionsTest test = new CollectionsTest();
    LinkedList<String> linkedList = new LinkedList<>();
    ArrayList<String> arrayList = new ArrayList<>();
    TreeSet<String> treeSet = new TreeSet<>();

    System.out.println("Time adding elements: ");
    System.out.println(String.format("LinkedList: %s ms", test.add(linkedList, "element", 7_000_000)));
    System.out.println(String.format("arrayList: %s ms", test.add(arrayList, "element", 7_000_000)));
    System.out.println(String.format("treeSet: %s ms", test.add(treeSet, "element", 7_000_000)));
    linkedList.clear();
    arrayList.clear();
    treeSet.clear();

    test.add(linkedList, "element", 180_000);
    test.add(arrayList, "element", 180_000);
    test.add(treeSet, "element", 180_000);
    System.out.println();
    System.out.println("Time of delete elements: ");
    System.out.println(String.format("LinkedList: %s ms", test.delete(linkedList, 120_000)));
    System.out.println(String.format("arrayList: %s ms", test.delete(arrayList, 120_000)));
    System.out.println(String.format("treeSet: %s ms", test.delete(treeSet, 120_000)));



}

}
