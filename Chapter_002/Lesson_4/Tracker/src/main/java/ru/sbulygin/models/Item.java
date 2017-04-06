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
    private Comment comments = new Comment();

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
     * Getter method for comment array field.
     * @return result result sting line comments.
     */
    public String getComment() {
        String result = "";
        String[] allRemarks = this.comments.getRemark();
        if (allRemarks != null) {
            for (String temp : allRemarks) {
                if (result != "") {
                    result += System.lineSeparator();
                }
                result += temp;
            }
        }
        return result;
    }

    /**
     * Setter method for comment array field.
     * @param comment comments.
     */
    public void setComment(String comment) {
        this.comments.addComment(comment);
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

}
