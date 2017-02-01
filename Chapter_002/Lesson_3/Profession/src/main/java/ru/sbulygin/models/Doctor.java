package ru.sbulygin.models;

/**
 * Class Doctor.
 * Inherited class from Profession.
 *
 * @author sbulygin.
 * @since 1.02.2017.
 * @version 1.0.
 */
public class Doctor extends Profession {

    /**
     * The category field.
     */
    private String category;

    /**
     * The sick field.
     */
    private boolean sick = true;

    /**
     * The request field.
     */
    private String request;

    /**
     * The newSick field.
     */
    private String newSick = "patient";

    /**
     * Constructor of Doctor class.
     * @param age the age of the doctor.
     * @param fullName the full name of the doctor.
     * @param sex the sex of the doctor.
     * @param specialization the specialization of the doctor.
     * @param diploma the diploma of the doctor.
     * @param category the diploma of the doctor.
     */
    public Doctor(int age, String fullName, String sex, String specialization, boolean diploma, String category) {
        super(age, fullName, sex, specialization, diploma);
        this.category = category;
    }

    /**
     * Getter method for category field.
     * @return category.
     */
    public String getCategory() {
        return category;
    }

    /**
     * Setter method for category field.
     * @param category string for set category.
     */
    public void setCategory(String category) {
        this.category = category;
    }

    /**
     * Method diagnosis return string line.
     * @return request.
     */
    public String diagnosis() {
        if (sick) {
            request = String.format("%s diagnoses %s", getFullName(), newSick);
        } else {
            request = String.format("%s on the weekend.", getFullName());
        }
        return request;
    }

    /**
     * Method healing return string line.
     * @return request.
     */
    public String healing() {
        if (sick) {
            request = String.format("%s treats %s", getFullName(), newSick);
        } else {
            request = String.format("%s on vacation.", getFullName());
        }
        return request;
    }
}
