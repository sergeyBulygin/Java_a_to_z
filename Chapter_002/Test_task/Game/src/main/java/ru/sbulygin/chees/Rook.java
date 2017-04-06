package ru.sbulygin.chees;

import ru.sbulygin.exeptions.ImpossibleMoveException;

/**
 * Class Rook.
 *
 * @author ru.sbulygin.start.
 * @since 14.03.2017.
 * @version 1.0.
 */
public class Rook extends Figure {

    /**
     * An array field of the movement of an rook.
     */
    private Cell[] direction;

    /**
     * The constructor of the Rook class generates the class object.
     * @param position position of the figure on the Board.
     */
    public Rook(Cell position) {
        super(position);
    }

    /**
     * Way overridden method of the abstract class Figure.
     * @param distance the specified cell on the Board.
     * @return array of the path of movement of the rook.
     * @throws ImpossibleMoveException error of the impossibility of motion rook.
     */
    @Override
    public Cell[] way(Cell distance) throws ImpossibleMoveException {

        int posX = getPosition().getPivotX();
        int posY = getPosition().getPivotY();
        int distX = distance.getPivotX();
        int distY = distance.getPivotY();

        if (posX == distX || posY == distY) {
            direction = motionDirection(distance);
        } else {
            throw new ImpossibleMoveException("Rook can't walk.");
        }
        return direction;
    }

}
