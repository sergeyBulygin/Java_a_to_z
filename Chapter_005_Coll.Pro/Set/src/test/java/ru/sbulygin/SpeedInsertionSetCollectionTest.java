package ru.sbulygin;

import org.junit.Before;
import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;


/**
 * Class SpeedInsertionSetCollectionTest.
 *
 * @author sbulygin.
 * @since 11.07.2017.
 * @version 1.0.
 */
public class SpeedInsertionSetCollectionTest {

    /**
     * Instance of SpeedInsertionSetCollection.
     */
    private SpeedInsertionSetCollection<Integer> testSpeedSet;

    /**
     * Instance of ReplicationSetArray with initial size.
     */
    private ReplicationSetArray<Integer> testArraySet;

    /**
     * The transition to the next line.
     */
    private String enter = System.getProperty("line.separator");

    /**
     * The method initializes a string with the transition to the next.
     * @param message Line.
     */
    private void message(String message) {
        System.out.printf("%s%s", message, enter);
    }

    /**
     * The class contains the initialize and instance of the class for tests.
     */
    @Before
    public  void infoForTest() {
        testSpeedSet = new SpeedInsertionSetCollection<>();
        testArraySet = new ReplicationSetArray<>(999);

    }

    /**
     * Method tests inserting elements in SpeedInsertionSetCollection.
     */
    @Test
    public void whenItemsAddedSpeedCollectionThenInsertionTimeLess() {
        message("Time adding SpeedSet elements: ");
        long startSpeedSetTime = System.nanoTime();
        final int expectedSize = 999;
        for (int index = 0; index < expectedSize; index++) {
            testSpeedSet.add(index);
        }
        long finishSpeedSetTime = System.nanoTime();
        System.out.println(String.format("Adding : %s ms", (finishSpeedSetTime - startSpeedSetTime)));
        assertThat(testSpeedSet.sizeContainer(), is(999));

    }

    /**
     * Method tests inserting elements in ReplicationSetArray.
     */
    @Test
    public void whenAddElementsArrayListThenInsertingLonger() {
        message("Time adding ArraySet elements: ");
        long startSpeedSetTime = System.nanoTime();
            final int expectedSize = 999;
            for (int index = 0; index < expectedSize; index++) {
                testArraySet.add(index);
            }
        long finishSpeedSetTime = System.nanoTime();
        System.out.println(String.format("Adding : %s ms", (finishSpeedSetTime - startSpeedSetTime)));
        assertThat(testArraySet.size(), is(999));

    }

}