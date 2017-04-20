package ru.sbulygin;

import org.junit.Before;
import org.junit.Test;
import ru.sbulygin.models.Comment;
import ru.sbulygin.models.Item;
import ru.sbulygin.models.Task;
import ru.sbulygin.start.Tracker;

import java.util.Arrays;
import java.util.List;

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
    private Item testsItemOne;

    /**
     * The second item field.
     */
    private Item testsItemEdit;

    /**
     * The third item field.
     */
    private Item testsItemTwo;
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
    public  void infoForTests() {
         testsItemOne = new Task("requestOne", "descriptionOne", 100L);
         testsItemEdit = new Task("requestTwo", "descriptionTwo", 120L);
         testsItemTwo = new Task("requestThree", "descriptionThree", 130L);
         trackerTest = new Tracker();
         comment = new Comment();
    }

    /**
     * Test method addItem  class Tracker.
     */
    @Test
    public void whenAddNewItemThenInTrackerIsSameItem() {
        trackerTest.addItem(testsItemOne);
        assertThat(trackerTest.getAll().get(firstIndex), is(testsItemOne));

    }

    /**
     * Test method updateItem class Tracker.
     */
    @Test
    public void whenEditTaskThenResultAnotherTask() {
        trackerTest.addItem(testsItemOne);
        testsItemEdit.setId(testsItemOne.getId());
        trackerTest.updateItem(testsItemEdit);
        assertThat(trackerTest.getAll().get(firstIndex), is(testsItemEdit));
    }

    /**
     * Test method deleteItem class Tracker.
     */
    @Test
    public void whenAddTwoTasksAndDeleteTwoThenArrayWithSecondTask() {
        trackerTest.addItem(testsItemOne);
        trackerTest.addItem(testsItemTwo);
        trackerTest.deleteItem(testsItemOne.getId());
        List<Item> resultAfterDel = trackerTest.getAll();
        List<Item> result = trackerTest.getAll();
        assertThat(result, is(resultAfterDel));

    }

    /**
     * Test method findByName class Tracker.
     */
    @Test
    public void whenAddTwoTasksAndFindByNameThenFoundTask() {
        trackerTest.addItem(testsItemOne);
        trackerTest.addItem(testsItemTwo);
        assertThat(trackerTest.findByName(testsItemOne.getName()), is(testsItemOne));
    }

    /**
     * Test method findById class Tracker.
     */
    @Test
    public void whenAddTwoTasksAndFindByIdThenFoundTask() {
        trackerTest.addItem(testsItemOne);
        trackerTest.addItem(testsItemTwo);
        assertThat(trackerTest.findById(testsItemOne.getId()), is(testsItemOne));
    }

    /**
     * Test method getAll class Tracker.
     */
    @Test
    public void whenAddTwoTasksThenResultTwoTask() {
        trackerTest.addItem(testsItemOne);
        trackerTest.addItem(testsItemTwo);
        List<Item> checked = Arrays.asList(testsItemOne, testsItemTwo);
        assertThat(trackerTest.getAll(), is(checked));
    }

    /**
     * Test method addComment class Tracker.
     */
    @Test
    public void whenAddCommentThenCommentsArrayAIsSameComment() {
        trackerTest.addItem(testsItemOne);
        trackerTest.addComment(trackerTest.getAll().get(firstIndex).getId(), "test");
        assertThat(trackerTest.getAll().get(firstIndex).getComment(), is("test"));
    }

}
