package ru.sbulygin.chees;

import ru.sbulygin.exeptions.ImpossibleMoveException;
import static ru.sbulygin.chees.Cell.getObjectCell;

/**
 * Abstract class Figure.
 *
 * @author ru.sbulygin.start.
 * @since 04.03.2017.
 * @version 1.0.
 */
public abstract class Figure {

    /**
     * The field position of the figure on the Board.
     */
    private final Cell position;

    /**
     * Field X coordinate of the destination cell speed figure.
     */
    private int goalX;

    /**
     * Field Y coordinate of the destination cell speed figure.
     */
    private int goalY;

    /**
     * Place in the array direction of the figure.
     */
    private int location = 0;

    /**
     * The array length of the path of movement of the figure.
     */
    private int lengthPath;

    /**
     * The constructor of the Figure class generates the class object.
     * @param position position of the figure on the Board.
     */
    public Figure(Cell position) {
        this.position = position;
    }

    /**
     * The method determines the possibility of movement of shapes on a given cell.
     * @param distance the specified cell on the Board.
     * @return array of the path of movement of the figure.
     * @throws ImpossibleMoveException error of the impossibility of motion figure.
     */
    public abstract Cell[] way(Cell distance) throws ImpossibleMoveException;

    /**
     * The method determines the direction of movement of the figure.
     * @param distance the specified cell on the Board.
     * @return array of the path of movement of the figure.
     * @throws ImpossibleMoveException error of the impossibility of motion figure.
     */
    public Cell[] motionDirection(Cell distance) throws ImpossibleMoveException {

        int posX = position.getPivotX();
        int posY = position.getPivotY();
        int distX = distance.getPivotX();
        int distY = distance.getPivotY();

        if (distX > posX) {
            goalX = 1;
        } else if (distX < posX) {
            goalX = -1;
        } else {
            goalX = 0;
        }

        if (distY > posY) {
            goalY = 1;
        } else if (distY < posY) {
            goalY = -1;
        } else {
            goalY = 0;
        }

        int vectorX = Math.abs(distX - posX);
        int vectorY = Math.abs(distY - posY);

        if (vectorX > vectorY) {
            lengthPath = vectorX;
        } else {
            lengthPath = vectorY;
        }

        Cell[] direction = new Cell[lengthPath + 1];
        for (int value = 0; value != lengthPath + 1; value++) {
            direction[location++] = getObjectCell(posX, posY);
            posX += goalX;
            posY += goalY;
        }
        return direction;
    }

     protected Cell getPosition() {
        return position;
    }

}
