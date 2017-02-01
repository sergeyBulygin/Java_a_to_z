package ru.sbulygin.models;

/**
 * Class Teacher.
 * Inherited class from Profession.
 *
 * @author sbulygin.
 * @since 31.01.2017.
 * @version 1.0.
 */
public class Teacher extends Profession {

    /**
     * The learner field.
     */
    private String learner = "student";

    /**
     * The student field.
     */
    private boolean student = false;
    /**
     * The exam field.
     */
    private boolean exam = true;
    /**
     * The request field.
     */
    private String request;

    /**
     * Constructor of Teacher class.
     * @param age the age of the teacher.
     * @param fullName the full name of the teacher.
     * @param sex the sex of the teacher.
     * @param specialization the specialization of the teacher.
     * @param diploma the diploma of the teacher.
     */
    public Teacher(int age, String fullName, String sex, String specialization, boolean diploma) {
        super(age, fullName, sex, specialization, diploma);
    }

    /**
     * Method teaching return string line.
     * @return request.
     */
    public String teaching() {
        if (!student) {
            request = String.format("%s teaches the %s", getFullName(), learner);
        } else {
            request = String.format("%s missed the lesson.", learner);
        }
        return request;
    }

    /**
     * Method admissionExam return boolean result.
     * @return result.
     */
    public boolean admissionExam() {
        boolean result;
        if (exam) {
            result = true;
        } else {
            result = false;
        }
        return result;
    }
}
