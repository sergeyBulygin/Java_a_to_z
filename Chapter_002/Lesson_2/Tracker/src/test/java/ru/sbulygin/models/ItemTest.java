package ru.sbulygin.models;

import org.junit.Before;
import org.junit.Test;
//import ru.sbulygin.models.Item;
//import ru.sbulygin.models.Task;
import ru.sbulygin.start.Tracker;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

/**
 * Method fot test Item class.
 * @author sbulygin
 * @since 12.01.2017.
 */
public class ItemTest {

    /**
     * The first item field.
     */
    private Item testItemOne;

    /**
     * The Two item field.
     */
    private Item testItemTwo;
    /**
     * The test tracker field.
     */
    private Tracker trackerTest;

    /**
     * First index array field.
     */
    private int firstIndex = 0;

    /**
     * The test comment field.
     */
    private Comment commentTest;

    /**
     * Information method to test.
     */
    @Before
    public  void infoForTest() {
        testItemOne = new Task("requestOne", "descriptionOne", 100L);
        testItemTwo = new Task("requestThree", "descriptionThree", 130L);
        trackerTest = new Tracker();
        commentTest = new Comment("Test comment");
    }

    /**
     * Test method addComment class Item.
     */
    @Test
    public void whenAddCommentToTaskThenInCommentsArrayIsSameComment() {
        trackerTest.addItem(testItemOne);
        testItemOne.addComment(commentTest);
        assertThat(trackerTest.getAll()[firstIndex].getComments()[firstIndex], is(commentTest));
    }
}
