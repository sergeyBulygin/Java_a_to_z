package ru.sbulygin.models;

import org.junit.Before;
import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

/**
 * Class EngineerTest.
 *
 * @author sbulygin.
 * @since 01.02.2017.
 * @version 1.0.
 */
public class EngineerTest {



    /**
     * The  engineer field.
     */
    private Engineer testEngin;

    /**
     * Information method to test.
     */
    @Before
    public  void infoForTest() {
        testEngin = new Engineer(35, "Pupkin Ivan Ivanovich", "male", "engineer", true);
    }

    /**
     * Test method designing class Engineer.
     */
    @Test
    public void whenProjectTrueThenStringLine() {
        String result = testEngin.designing();
        String checked = "Pupkin Ivan Ivanovich to take the project";
        assertThat(result, is(checked));
    }

    /**
     * Test method engineering class Engineer.
     */
    @Test
    public void whenProjectTrueThenResultStringLine() {
        String result = testEngin.engineering();
        String checked = "Pupkin Ivan Ivanovich busy project";
        assertThat(result, is(checked));
    }
}
