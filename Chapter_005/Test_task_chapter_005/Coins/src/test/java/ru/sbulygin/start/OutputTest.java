package ru.sbulygin.start;

import org.junit.After;
import org.junit.Before;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

/**
 * Class OutputTest.
 *
 * @author ru.sbulygin.
 * @since 16.05.2017.
 * @version 1.0.
 */
public abstract class OutputTest {



    /**
     * Creates a new byte array output stream.
     */
    private final ByteArrayOutputStream output = new ByteArrayOutputStream();

    /**
     * Getter for output stream.
     * @return output stream.
     */
    public ByteArrayOutputStream getOutput() {
        return output;
    }

    /**
     * Method reassigns the "standard" output stream.
     */
    @Before
    public void setUpStreams() {
        System.setOut(new PrintStream(output));
    }

    /**
     * Closes output stream and releases any system resources associated with this stream.
     */
    @After
    public void cleanUpStreams() {
        System.setOut(null);
    }
}


