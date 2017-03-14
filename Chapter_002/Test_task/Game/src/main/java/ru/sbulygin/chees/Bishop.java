package ru.sbulygin.chees;

import ru.sbulygin.exeptions.ImpossibleMoveException;

/**
 * Class Bishop.
 *
 * @author ru.sbulygin.start.
 * @since 06.03.2017.
 * @version 1.0.
 */
public class Bishop extends Figure {

    /**
     * An array field of the movement of an bishop.
     */
    private Cell[] direction;

    /**
     * The constructor of the Bishop class generates the class object.
     * @param position position of the figure on the Board.
     */
    public Bishop(Cell position)1 {
        super(position);
    }

    /**
     * Way overridden method of the abstract class Figure.
     * @param distance the specified cell on the Board.
     * @return array of the path of movement of the bishop.
     * @throws ImpossibleMoveException error of the impossibility of motion bishop.
     */
    @Override
    public Cell[] way(Cell distance) throws ImpossibleMoveException {
        int posX = getPosition().getPivotX();
        int posY = getPosition().getPivotY();
        int distX = distance.getPivotX();
        int distY = distance.getPivotY();

        if (Math.abs(distX - posX) == Math.abs(distY - posY)) {
            direction = motionDirection(distance);
        } else {
            throw new ImpossibleMoveException("Bishop can't walk.");
        }
        return direction;
    }

}