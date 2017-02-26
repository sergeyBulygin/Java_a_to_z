package ru.sbulygin.pattern;

/**
 * Class Triangle.
 *
 * @author ru.sbulygin.start.
 * @since 26.02.2017.
 * @version 1.0.
 */
public class Triangle implements Shape {

    /**
     * The heightFigure field.
     */
    private int heightFigure;

    /**
     * Constructor of Triangle class.
     * @param heightFigure height figure.
     */
    public Triangle(int heightFigure) {
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
        StringBuilder triangle = new StringBuilder();

        for (int external = 0; external < heightFigure; external++) {
            for (int leftPart = 0; leftPart < heightFigure - external; leftPart++) {
                triangle.append(" ");
            }
            for (int middlePart = 0; middlePart < external * 2 + 1; middlePart++) {
                if (middlePart % 2 == 0) {
                    triangle.append("*");
                } else {
                    triangle.append(" ");
                }

            }
            for (int rightPart = 0; rightPart < heightFigure - external; rightPart++) {
                triangle.append(" ");
            }
            triangle.append("\r\n");
        }
        return triangle.toString();
    }
}
