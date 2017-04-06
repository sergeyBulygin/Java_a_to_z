package ru.sbulygin.pattern;

/**
 * Class Paint.
 *
 * @author ru.sbulygin.start.
 * @since 26.02.2017.
 * @version 1.0.
 */
public class Paint {

    /**
     * The shape field.
     */
    private Shape shape;

    /**
     *  Constructor of Paint class.
     * @param shape shape.
     */
    public Paint(Shape shape) {
        this.shape = shape;
    }

    /**
     * Method draw.
     * @param shape shape.
     */
    public  void  draw(Shape shape) {
        System.out.print(shape.pic(shape));
    }


}
