package ru.sbulygin.exeptions;

/**
 * Class ImpossibleMoveException.
 *
 * @author ru.sbulygin.start.
 * @since 05.03.2017.
 * @version 1.0.
 */
public class ImpossibleMoveException extends Exception {
    /**
     * Exception when the wrong color of the figure or of the impossibility of motion.
     * @param msg error message.
     */
    public ImpossibleMoveException(String msg) {
        super(msg);
    }
}
