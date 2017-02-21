package ru.sbulygin.start;

import org.junit.Before;
import org.junit.Test;
import ru.sbulygin.models.Item;
import ru.sbulygin.models.Task;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

/**
 * Class MenuTracker.
 *
 * @author ru.sbulygin.start.
 * @since 20.02.2017.
 * @version 1.0.
 */
public class StartUITest {

    /**
     * The first item field.
     */
    private Item testItemOne;

    /**
     * The second item field.
     */
    private Item testItemTwo;

    /**
     * The third item field.
     */
    private Item testItemThree;

    /**
     * The test tracker field.
     */
    private Tracker trackerTest;

    /**
     * The test input field.
     */
    private Input input;

    /**
     * Information method to test.
     */
    @Before
    public  void infoForTest() {
        testItemOne = new Task("requestOne", "descriptionOne", 100L);
        testItemTwo = new Task("requestTwo", "descriptionTwo", 120L);
        testItemThree = new Task("requestThree", "descriptionThree", 130L);
        trackerTest = new Tracker();
    }

    /**
     * Test AddItem class.
     */
    @Test
    public void whenAddNewItemThenInTrackerIsSameItem() {
        input = new StubInput(new String[]{"1", "requestOne", "descriptionOne", "y"});
        new StartUI(input, trackerTest).init();
        assertThat(trackerTest.getAll()[0].getName(), is("requestOne"));
        assertThat(trackerTest.getAll()[0].getDescription(), is("descriptionOne"));

    }
    /**
     * Test UpdateItem class.
     */
    @Test
    public void whenUpdateItemThenNewItem() {
        trackerTest.addItem(testItemOne);
        String id = trackerTest.findByName("requestOne").getId();
        input = new StubInput(new String[]{"3", id, "requestTwo", "descriptionTwo", "y"});
        new StartUI(input, trackerTest).init();
        assertThat(trackerTest.getAll()[0].getName(), is("requestTwo"));
        assertThat(trackerTest.getAll()[0].getDescription(), is("descriptionTwo"));
    }

    /**
     * Test DeleteItem class.
     */
    @Test
    public void whenAddTwoItemAndDeleteFirstThenResultSecondItem() {
        trackerTest.addItem(testItemOne);
        trackerTest.addItem(testItemTwo);
        input = new StubInput(new String[]{"4", trackerTest.getAll()[0].getId(), "y"});
        new StartUI(input, trackerTest).init();
        assertThat(trackerTest.getAll()[0].getName(), is("requestTwo"));
        assertThat(trackerTest.getAll()[0].getDescription(), is("descriptionTwo"));
    }

    /**
     * Test FindItemByName class.
     */
    @Test
    public void whenAddTwoItemAndFindByNameThenResultThatItemName() {
        trackerTest.addItem(testItemOne);
        trackerTest.addItem(testItemTwo);
        input = new StubInput(new String[]{"5", "requestTwo", "y"});
        new StartUI(input, trackerTest).init();
        assertThat(trackerTest.getAll()[1].getName(), is("requestTwo"));
        assertThat(trackerTest.getAll()[1].getDescription(), is("descriptionTwo"));
    }

    /**
     * Test FindItemById class.
     */
    @Test
    public void whenAddTwoItemAndFindByIdThenResultThatItemId() {
        trackerTest.addItem(testItemOne);
        trackerTest.addItem(testItemTwo);
        String id = trackerTest.findByName("requestOne").getId();
        input = new StubInput(new String[]{"6", id, "y"});
        new StartUI(input, trackerTest).init();
        assertThat(trackerTest.getAll()[0].getName(), is("requestOne"));
        assertThat(trackerTest.getAll()[0].getDescription(), is("descriptionOne"));
    }

    /**
     * Test FindItemById class.
     */
    @Test
    public void whenAddCommentThenResultItemWithThatComment() {
        trackerTest.addItem(testItemOne);
        String id = trackerTest.getAll()[0].getId();
        input = new StubInput(new String[]{"7", id, "testComment", "y"});
        new StartUI(input, trackerTest).init();
        assertThat(trackerTest.getAll()[0].getComment(), is("testComment"));
    }
}
