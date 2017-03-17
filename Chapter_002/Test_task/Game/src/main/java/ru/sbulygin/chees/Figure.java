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
    private  Cell position;

    /**
     * Field X coordinate of the destination cell speed figure.
     */
    private int goalX;

    /**
     * Field Y coordinate of the destination cell speed figure.
     */
    private int goalY;

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

        goalX = distX > posX ? 1 : distX < posX ? -1 : 0;
        goalY = distY > posY ? 1 : distY < posY ? -1 : 0;

        int vectorX = Math.abs(distX - posX);
        int vectorY = Math.abs(distY - posY);

        lengthPath = vectorX > vectorY ? vectorX : vectorY;

        Cell[] direction = new Cell[lengthPath];
        for (int value = 0; value != lengthPath; value++) {
            posX += goalX;
            posY += goalY;
            direction[value] = getObjectCell(posX, posY);
        }
        return direction;
    }

    /**
     * Getter for position.
     * @return position.
     */
    protected Cell getPosition() {
        return position;
    }

    /**
     * Method clone replaces the coordinates of the figure on a new.
     * @param dist the cell move figure.
     */
    public void clone(Cell dist) {
        this.position = dist;
    }
}
