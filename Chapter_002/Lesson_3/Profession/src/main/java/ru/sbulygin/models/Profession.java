package ru.sbulygin.models;

/**
 * Class Profession.
 *
 * @author sbulygin.
 * @since 31.01.2017.
 * @version 1.0.
 */

public class Profession {

    /**
     * The age field.
     */
    private int age;

    /**
     * The fullName field.
     */
    private String fullName;

    /**
     * The sex field.
     */
    private String sex;

    /**
     * The skills field.
     */
    private String[] skills;

    /**
     * The married field.
     */
    private boolean married;

    /**
     * The specialization field.
     */
    private String specialization;

    /**
     * The diploma field.
     */
    private boolean diploma;

    /**
     * Constructor of Profession class.
     * @param age the age of the employee.
     * @param fullName the full name of the employee.
     * @param sex the sex of the employee.
     * @param specialization the specialization of the employee.
     * @param diploma the diploma of the employee.
     */
    public Profession(int age, String fullName, String sex, String specialization, boolean diploma) {
        this.age = age;
        this.fullName = fullName;
        this.sex = sex;
        this.specialization = specialization;
        this.diploma = diploma;
    }

    /**
     * Getter method for age field.
     * @return age.
     */
    public int getAge() {
        return this.age;
    }

    /**
     * Setter method for age field.
     * @param age int for age name.
     */
    public void setAge(int age) {
        this.age = age;
    }

    /**
     * Getter method for fullName field.
     * @return fullName.
     */
    public String getFullName() {
        return this.fullName;
    }

    /**
     * Setter method for fullName field.
     * @param fullName string for set fullName.
     */
    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    /**
     * Getter method for sex field.
     * @return sex.
     */
    public String getSex() {
        return this.sex;
    }

    /**
     * Setter method for sex field.
     * @param sex string for set sex.
     */
    public void setSex(String sex) {
        this.sex = sex;
    }

    /**
     * Getter method for skills field.
     * @return skills.
     */
    public String[] getSkills() {
        return this.skills;
    }

    /**
     * Setter method for skills field.
     * @param skills string for set skills.
     */
    public void setSkills(String[] skills) {
        this.skills = skills;
    }

    /**
     * Getter method for married field.
     * @return married.
     */
    public boolean isMarried() {
        return this.married;
    }

    /**
     * Setter method for married field.
     * @param married boolean for set married.
     */
    public void setMarried(boolean married) {
        this.married = married;
    }

    /**
     * Getter method for specialization field.
     * @return specialization.
     */
    public String getSpecialization() {
        return this.specialization;
    }

    /**
     * Setter method for specialization field.
     * @param specialization string for set specialization.
     */
    public void setSpecialization(String specialization) {
        this.specialization = specialization;
    }

    /**
     * Getter method for diploma field.
     * @return diploma.
     */
    public boolean isDiploma() {
        return this.diploma;
    }

    /**
     * Setter method for diploma field.
     * @param diploma boolean for set diploma.
     */
    public void setDiploma(boolean diploma) {
        this.diploma = diploma;
    }
}
