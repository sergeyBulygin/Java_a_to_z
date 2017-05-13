package ru.sbulygin.errors;

/**
 * Class NullAccountException.
 *
 * @author ru.sbulygin.
 * @since 29.04.2017.
 * @version 1.0.
 */
public class NullAccountException extends Exception {

    /**
     * Message on error when not found user account.
     * @param massage error massage.
     */
    public NullAccountException(String massage) {
        super(massage);
    }
}
