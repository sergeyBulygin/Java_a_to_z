package ru.sbulygin.models;


/**
 * Class Task.
 * Inherited class from Item.
 *
 * @author ru.sbulygin.models.
 * @since 10.01.2017.
 */
public class Task extends Item {

    /**
     * Constructor for creating Task.
     * @param name name of task.
     * @param description description of task.
     * @param dateCreation create time of task.
     */
    public Task(String name, String description, long dateCreation) {
        super(name, description, dateCreation);
    }
}
