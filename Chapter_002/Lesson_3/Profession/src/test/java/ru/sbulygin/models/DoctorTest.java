package ru.sbulygin.models;

import org.junit.Before;
import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

/**
 * Class DoctorTest.
 *
 * @author sbulygin.
 * @since 01.02.2017.
 * @version 1.0.
 */
public class DoctorTest {

    /**
     * The  doctor field.
     */
    private Doctor testDoc;

    /**
     * Information method to test.
     */
    @Before
    public  void infoForTest() {
        testDoc = new Doctor(35, "Pupkin Ivan Ivanovich", "male", "doctor", true, "therapist");
    }

    /**
     * Test method getCategory and setCategory class Profession.
     */

    @Test
    public void whenGetCategoryThenReturnCategory() {
        testDoc.setCategory("therapist");
        String result = testDoc.getCategory();
        String checked = "therapist";
        assertThat(result, is(checked));
    }

    /**
     * Test method diagnosis class Doctor.
     */
    @Test
    public void whenPatientTrueAddThenStringLine() {
        String result = testDoc.diagnosis();
        String checked = "Pupkin Ivan Ivanovich diagnoses patient";
        assertThat(result, is(checked));
    }

    /**
     * Test method healing class Doctor.
     */
    @Test
    public void whenPatientHealingThenStringLine() {
        String result = testDoc.healing();
        String checked = "Pupkin Ivan Ivanovich treats patient";
        assertThat(result, is(checked));
    }
}
