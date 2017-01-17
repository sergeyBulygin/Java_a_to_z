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
     * The field position in the array.
     */
    private int position = 0;

    /**
     * The field remark array.
     */
    private String[] remark;

    /**
     * Getter method for remark.
     * @return comment.
     */
    public String[] getRemark() {

        return this.remark;
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

