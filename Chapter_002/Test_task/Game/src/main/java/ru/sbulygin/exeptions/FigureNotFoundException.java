package ru.sbulygin.exeptions;

/**
 * Class FigureNotFoundException.
 *
 * @author ru.sbulygin.start.
 * @since 16.03.2017.
 * @version 1.0.
 */
public class FigureNotFoundException extends Exception  {

    /**
     * The exception is when the figure is not found.
     * @param msg error massage.
     */
    public FigureNotFoundException(String msg) {
        super(msg);
    }
}
