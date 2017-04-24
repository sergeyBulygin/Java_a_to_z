package ru.sbulygin.models;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;


/**
 * Class CommentTest.
 *
 * @author ru.sbulygin.
 * @since 24.04.2017.
 * @version 1.0.
 */
public class CommentTest {

    /**
     * Test comment field.
     */
    private String testComment = "test";

    /**
     * Test comment field.
     */
    private String testCommentTwo = "test";

    /**
     * Test instance comment field.
     */
    private Comment testComm = new Comment();

    /**
     * Test method class Comment.
     * @throws Exception Exception when errors test.
     */
    @Test
    public void whenAddCommentThatGetThisComment() throws Exception {
        testComm.addComment(testComment);
        assertThat(testComm.getRemark()[0], is(testComment));
    }

    /**
     * Test method class Comment.
     * @throws Exception Exception when errors test.
     */
    @Test
    public void whenAddTwoCommentThatGetSecondComment() throws Exception {
        testComm.addComment(testComment);
        testComm.addComment(testCommentTwo);
        assertThat(testComm.getRemark()[1], is(testCommentTwo));
    }

}