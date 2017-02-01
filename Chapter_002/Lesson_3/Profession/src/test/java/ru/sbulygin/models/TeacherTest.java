package ru.sbulygin.models;

import org.junit.Before;
import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

/**
 * Class TeacherTest.
 *
 * @author sbulygin.
 * @since 01.02.2017.
 * @version 1.0.
 */
public class TeacherTest {

    /**
     * The  teacher field.
     */
    private Teacher testTeach;

    /**
     * Information method to test.
     */
    @Before
    public  void infoForTest() {
        testTeach = new Teacher(35, "Pupkin Ivan Ivanovich", "male", "teacher", true);
    }

    /**
     * Test method teaching class Teacher.
     */
    @Test
    public void whenStudentAddThenStringLine() {
        String result = testTeach.teaching();
        String checked = "Pupkin Ivan Ivanovich teaches the student";
        assertThat(result, is(checked));
    }

    /**
     * Test method admissionExam  class Teacher.
     */
    @Test
    public void whenExamTrueThenResultTrue() {
        boolean result = testTeach.admissionExam();
        boolean checked = true;
        assertThat(result, is(checked));
    }
}
