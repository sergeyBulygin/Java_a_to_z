package ru.sbulygin.errors;

/**
 * Class NullUserException.
 *
 * @author ru.sbulygin.
 * @since 29.04.2017.
 * @version 1.0.
 */
public class NullUserException extends Exception {

    /**
     * Message with error when user not found.
     * @param message error message.
     */
    public NullUserException(String message) {
        super(message);
    }
}
