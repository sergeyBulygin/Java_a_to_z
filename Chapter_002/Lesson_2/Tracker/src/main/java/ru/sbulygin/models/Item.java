package ru.sbulygin.models;


/**
 * Class Item.
 *
 * @author sbulygin.
 * @since 09.01.2017.
 * @version 1.0.
 */
public class Item {

    /**
     * The id field.
     */
    private String id;
    /**
     * The name field.
     */
    private String name;
    /**
     * Description field.
     */
    private String description;
    /**
     * Creation date field.
     */
    private long dateCreation;
    /**
     * The comment field of the array.
     */
    private Comment[]comments = new Comment[3];
    /**
     * The field position in the array.
     */
    private int position = 0;

    /**
     * Constructor of Item class.
     * @param name name of item.
     * @param description description of item.
     * @param dateCreation create time of item.
     */
    public Item(String name, String description, long dateCreation) {
        this.name = name;
        this.description = description;
        this.dateCreation = dateCreation;
    }

    /**
     * Getter method for name field.
     * @return name.
     */
    public String getName() {
        return this.name;
    }

    /**
     * Getter method for description field.
     * @return description.
     */
    public String getDescription() {
        return this.description;
    }

    /**
     * Getter method for dateCreation field.
     * @return dateCreation.
     */
    public long getDateCreation() {
        return this.dateCreation;
    }

    /**
     * Getter method for id field.
     * @return id.
     */
    public String getId() {
        return this.id;
    }

    /**
     * Getter method for comments.
     * @return comment.
     */
    public Comment[] getComments() {
        Comment[] result = new Comment[this.position];
        for (int index = 0; index != this.position; index++) {
            result[index] = comments[index];
        }
        return result;
    }

    /**
     * Setter method for name field.
     * @param name string for set name.
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Setter method for description field.
     * @param description string for set description.
     */
    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * Setter method for dateCreation field.
     * @param dateCreation number for set create.
     */
    public void setDateCreation(long dateCreation) {
        this.dateCreation = dateCreation;
    }

    /**
     * Setter method for id field.
     * @param id string for set id.
     */
    public void setId(String id) {
        this.id = id;
    }

    /**
     * Method for adding comment to item.
     * @param comment comment for adding.
     */
    public void addComment(Comment comment) {
        this.comments[position++] = comment;
    }


}
