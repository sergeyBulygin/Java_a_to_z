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
     * The field comment.
     */
    private String comment;
    /**
     * The field position in the array.
     */
    private int position = 0;

    /**
     * The field remark array.
     */
    private String[] remark;

    /**
     * Constructor to create a comment.
     * @param comment comment line.
     */
    public Comment(String comment) {

        this.comment = comment;
    }

    /**
     * Getter method for remark.
     * @return comment.
     */
    public String[] getRemark() {

        return this.remark;
    }

    /**
     * Setter method for remark.
     * @param remark line for setting comment.
     */
    public void setRemark(String[] remark) {

        this.remark = remark;
    }

    /**
     * Add method for comment.
     * @param comment string comment.
     */
    public void addComment(String comment) {
        if (remark == null) {
            remark = new String[position];
        }
        remark[position++] = comment;
    }
 }

