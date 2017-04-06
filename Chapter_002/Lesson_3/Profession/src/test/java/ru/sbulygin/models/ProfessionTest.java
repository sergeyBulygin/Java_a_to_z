package ru.sbulygin.models;


import org.junit.Before;
import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

/**
 * Class ProfessionTest.
 *
 * @author sbulygin.
 * @since 01.02.2017.
 * @version 1.0.
 */
public class ProfessionTest {

    /**
     * The  profession field.
     */
    private Profession testProf;

    /**
     * Information method to test.
     */
    @Before
    public  void infoForTest() {
        testProf = new Profession(35, "Pupkin Ivan Ivanovich", "male", "doctor", true);
    }

    /**
     * Test method getAge and setAge class Profession.
     */
    @Test
    public void whenGetNewAgeThenReturnNewAge() {
        testProf.setAge(40);
        int result = testProf.getAge();
        int checked = 40;
        assertThat(result, is(checked));
    }

    /**
     * Test method getFullName and setFullName class Profession.
     */
    @Test
    public void whenGetFullNameThenReturnFullName() {
        testProf.setFullName("Pupkin Ivan Ivanovich");
        String result = testProf.getFullName();
        String checked = "Pupkin Ivan Ivanovich";
        assertThat(result, is(checked));
    }

    /**
     * Test method getSex and setSex class Profession.
     */
    @Test
    public void whenGetSexThenReturnSex() {
        testProf.setSex("male");
        String result = testProf.getSex();
        String checked = "male";
        assertThat(result, is(checked));
    }

    /**
     * Test method getSkills and setSkills class Profession.
     */
    @Test
    public void whenGetSkillsThenReturnSkills() {
        String[] testSkills = {"competent speech", "humanism"};
        testProf.setSkills(testSkills);
        assertThat(testProf.getSkills(), is(testSkills));
    }

    /**
     * Test method isMarried and setMarried class Profession.
     */
    @Test
    public void whenMarriedTrueThenResultTrue() {
        testProf.setMarried(true);
        boolean result = testProf.isMarried();
        boolean checked = true;
        assertThat(result, is(checked));
    }

    /**
     * Test method getSpecialization and setSpecialization class Profession.
     */
    @Test
    public void whenGetSpecializationThenReturnNewSpecialization() {
        testProf.setSpecialization("therapist");
        String result = testProf.getSpecialization();
        String checked = "therapist";
        assertThat(result, is(checked));
    }

    /**
     * Test method isDiploma and setDiploma class Profession.
     */
    @Test
    public void whenSetDiplomaTrueThenResultTrue() {
        testProf.setDiploma(true);
        boolean result = testProf.isDiploma();
        boolean checked = true;
        assertThat(result, is(checked));
    }
}
