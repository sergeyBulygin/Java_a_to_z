package ru.sbulygin.exeptions;

/**
 * Class OccupiedWayException.
 *
 * @author ru.sbulygin.start.
 * @since 16.03.2017.
 * @version 1.0.
 */
public class OccupiedWayException extends Exception {

    /**
     * The exception is when the path is a different figure.
     * @param msg error message.
     */
    public OccupiedWayException(String msg) {
        super(msg);
    }
}
