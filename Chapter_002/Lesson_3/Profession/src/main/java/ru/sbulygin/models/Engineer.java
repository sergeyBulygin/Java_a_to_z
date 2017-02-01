package ru.sbulygin.models;

/**
 * Class Engineer.
 * Inherited class from Profession.
 *
 * @author sbulygin.
 * @since 31.01.2017.
 * @version 1.0.
 */
public class Engineer extends Profession {

    /**
     * The project field.
    / */
    private boolean project = false;

    /**
     * The request field.
     */
    private String request;

    /**
     * The work field.
     */
    private String work = "project";

    /**
     * Constructor of Engineer class.
     * @param age the age of the engineer.
     * @param fullName the full name of the engineer.
     * @param sex the sex of the engineer.
     * @param specialization the specialization of the engineer.
     * @param diploma the diploma of the engineer.
     */
    public Engineer(int age, String fullName, String sex, String specialization, boolean diploma) {
        super(age, fullName, sex, specialization, diploma);
    }

    /**
     * Method designing return string line.
     * @return request.
     */
    public String designing() {
        if (!project) {
            request = String.format("%s to take the %s", getFullName(), work);
        } else {
            request = String.format("%s free %s", getFullName(), work);
        }
        return request;
    }

    /**
     * Method engineering return string line.
     * @return request.
     */
    public String engineering() {
        if (!project) {
            request = String.format("%s busy %s", getFullName(), work);
        } else {
            request = String.format("%s in the search %s", getFullName(), work);
        }
        return  request;
    }
 }
