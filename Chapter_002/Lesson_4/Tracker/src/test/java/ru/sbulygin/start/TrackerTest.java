package ru.sbulygin.start;

import org.junit.Before;
import org.junit.Test;
import ru.sbulygin.models.Comment;
import ru.sbulygin.models.Item;
import ru.sbulygin.models.Task;


import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

/**
 * Method fot test Tracker class.
 * @author sbulygin
 * @since 12.01.2017.
 */
public class TrackerTest {

    /**
     * The first item field.
     */
    private Item testItemOne;

    /**
     * The second item field.
     */
    private Item testItemEdit;

    /**
     * The third item field.
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
     * Comment array field.
     */
    private Comment comment;


    /**
     * Information method to test.
     */
    @Before
    public  void infoForTest() {
         testItemOne = new Task("requestOne", "descriptionOne", 100L);
         testItemEdit = new Task("requestTwo", "descriptionTwo", 120L);
         testItemTwo = new Task("requestThree", "descriptionThree", 130L);
         trackerTest = new Tracker();
         comment = new Comment();
    }

    /**
     * Test method addItem  class Tracker.
     */
    @Test
    public void whenAddNewItemThenInTrackerIsSameItem() {
        trackerTest.addItem(testItemOne);
        assertThat(trackerTest.getAll()[firstIndex], is(testItemOne));

    }

    /**
     * Test method updateItem class Tracker.
     */
    @Test
    public void whenEditTaskThenResultAnotherTask() {
        trackerTest.addItem(testItemOne);
        testItemEdit.setId(testItemOne.getId());
        trackerTest.updateItem(testItemEdit);
        assertThat(trackerTest.getAll()[firstIndex], is(testItemEdit));
    }

    /**
     * Test method deleteItem class Tracker.
     */
    @Test
    public void whenAddTwoTasksAndDeleteTwoThenArrayWithSecondTask() {
        trackerTest.addItem(testItemOne);
        trackerTest.addItem(testItemTwo);
        trackerTest.deleteItem(testItemOne.getId());
        Item[] resultAfterDel = trackerTest.getAll();
        Item[] result = trackerTest.getAll();
        assertThat(result, is(resultAfterDel));

    }

    /**
     * Test method findByName class Tracker.
     */
    @Test
    public void whenAddTwoTasksAndFindByNameThenFoundTask() {
        trackerTest.addItem(testItemOne);
        trackerTest.addItem(testItemTwo);
        assertThat(trackerTest.findByName(testItemOne.getName()), is(testItemOne));
    }

    /**
     * Test method findById class Tracker.
     */
    @Test
    public void whenAddTwoTasksAndFindByIdThenFoundTask() {
        trackerTest.addItem(testItemOne);
        trackerTest.addItem(testItemTwo);
        assertThat(trackerTest.findById(testItemOne.getId()), is(testItemOne));
    }

    /**
     * Test method getAll class Tracker.
     */
    @Test
    public void whenAddTwoTasksThenResultTwoTask() {
        trackerTest.addItem(testItemOne);
        trackerTest.addItem(testItemTwo);
        Item[] checked = {testItemOne, testItemTwo};
        assertThat(trackerTest.getAll(), is(checked));
    }

    /**
     * Test method addComment class Tracker.
     */
    @Test
    public void whenAddCommentThenCommentsArrayAIsSameComment() {
        trackerTest.addItem(testItemOne);
        trackerTest.addComment(trackerTest.getAll()[firstIndex].getId(), "test");
        assertThat(trackerTest.getAll()[firstIndex].getComment(), is("test"));
    }

}
