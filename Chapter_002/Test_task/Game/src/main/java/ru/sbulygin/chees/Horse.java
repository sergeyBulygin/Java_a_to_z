package ru.sbulygin.chees;

import ru.sbulygin.exeptions.ImpossibleMoveException;

/**
 * Class Horse.
 *
 * @author ru.sbulygin.start.
 * @since 15.03.2017.
 * @version 1.0.
 */
public class Horse extends Figure {
    /**
     * An array field of the movement of an horse.
     */
    private Cell[] direction = new Cell[2];
    /**
     * Place the coordinates in the array.
     */
    private int spot = 0;

    /**
     * The constructor of the Horse class generates the class object.
     * @param position position of the figure on the Board.
     */
    public Horse(Cell position) {
        super(position);
    }

    /**
     * Way overridden method of the abstract class Figure.
     * @param distance the specified cell on the Board.
     * @return array of the path of movement of the horse.
     * @throws ImpossibleMoveException error of the impossibility of motion horse.
     */
    @Override
    public Cell[] way(Cell distance) throws ImpossibleMoveException {

        int posX = getPosition().getPivotX();
        int posY = getPosition().getPivotY();
        int distX = distance.getPivotX();
        int distY = distance.getPivotY();

        int vectorX = Math.abs(distX - posX);
        int vectorY = Math.abs(distY - posY);

        if (vectorX + vectorY == 3 && posX != distX && posY != distY) {
            direction[spot++] = Cell.getObjectCell(posX, distX);
            direction[spot++] = Cell.getObjectCell(posY, distY);
        } else {
            throw new ImpossibleMoveException("Horse can't walk.");
        }
        return direction;
    }
}
