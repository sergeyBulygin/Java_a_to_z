package ru.sbulygin.pattern;

/**
 * Class Square.
 *
 * @author ru.sbulygin.start.
 * @since 26.02.2017.
 * @version 1.0.
 */
public class Square implements Shape {

    /**
     * The heightFigure field.
     */
    private int heightFigure;

    /**
     * Constructor of Square class.
     * @param heightFigure height figure.
     */
    public Square(int heightFigure) {
        this.heightFigure = heightFigure;
    }

    /**
     * Method pic.
     * @param shape shape.
     * @return returns a string of pseudo.
     */
    @Override
    public String pic(Shape shape) {
        if (heightFigure <= 0) {
            throw new IllegalArgumentException("Figure cannot have height less or equal to 0.");
        }
        StringBuilder square = new StringBuilder();

        for (int row = 0; row < heightFigure; row++) {
            for (int column = 0; column < heightFigure * 2 - 1; column++) {
                if (column % 2 == 0) {
                    square.append("*");
                } else {
                    square.append(" ");
                }
            }
            square.append("\r\n");
        }
        return square.toString();
    }
}
