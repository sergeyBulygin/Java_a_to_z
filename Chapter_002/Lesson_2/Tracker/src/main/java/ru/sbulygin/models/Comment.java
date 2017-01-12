package ru.sbulygin.models;

/**
 * Class Comment.
 *
 * @author sbulygin.
 * @since 09.01.2017.
 * @version 1.0.
 */
public class Comment {

    /**
     * The comment field.
     */
    private String comment;

    /**
     * Constructor to create a comment.
     * @param comment comment line.
     */
    public Comment(String comment) {

        this.comment = comment;
    }

    /**
     * Getter method for comment.
     * @return comment.
     */
    public String getComment() {

        return this.comment;
    }

    /**
     * Setter method for comment.
     * @param comment line for setting comment.
     */
    public void setComment(String comment) {

        this.comment = comment;
    }

 }

