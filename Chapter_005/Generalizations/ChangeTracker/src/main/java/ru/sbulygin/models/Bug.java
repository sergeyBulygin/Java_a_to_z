package ru.sbulygin.models;

/**
 * Class Bug.
 * Inherited class from Item.
 *
 * @author ru.sbulygin.models.
 * @since 10.01.2017.
 */
public class Bug extends Item {

    /**
     * Constructor for creating bug reports.
     * @param name name of task.
     * @param description description of task.
     * @param dateCreation create time of task.
     */
    public Bug(String name, String description, long dateCreation) {
        super(name, description, dateCreation);
    }
}
