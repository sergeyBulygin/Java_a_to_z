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
     *
     * @return remark remark array of comments.
     */
    public String[] getRemark() {

        return this.remark;
    }

    /**
     * Add method for comment.
     *
     * @param comment string comment.
     */
    public void addComment(String comment) {
            if (remark == null) {
                remark = new String[1];
            } else {
                String[] temp = new String[position + 1];
                System.arraycopy(remark, 0, temp, 0, position);
                this.remark = temp;
            }
            remark[position++] = comment;

    }

}