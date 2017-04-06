package ru.sbulygin.chees;

import ru.sbulygin.exeptions.FigureNotFoundException;
import ru.sbulygin.exeptions.ImpossibleMoveException;
import ru.sbulygin.exeptions.OccupiedWayException;

/**
 * Class Board.
 *
 * @author ru.sbulygin.start.
 * @since 16.03.2017.
 * @version 1.0.
 */
public class Board {

    /**
     * The array of figures field.
     */
    private Figure[] figures;

    /**
     * The maximum value of the coordinates of the cell.
     */
    private int maxPivot = 7;

    /**
     * The minimum value of the coordinates of the cell.
     */
    private int minPivot = 0;

    /**
     *  The field position the figure in the array.
     */
    private int figureCount = 0;

    /**
     * Method getFigure of obtaining the figures.
     * @param source the cell where the figure.
     * @return the desired figure.
     */
    public Figure getFigure(Cell source) {
        Figure result = null;
        for (int index = 0; index != figureCount; index++) {
            if (figures[index].getPosition().equals(source) && figures[index] != null) {
                result = figures[index];
                break;

            }
        }
        return result;
    }

    /**
     * Method addFigure add figure on Board.
     * @param figure figure that I should add.
     */
    public void addFigure(Figure figure) {
        if (figures == null) {
            figures = new Figure[1];
        } else {
            Figure[] temp = new Figure[figureCount + 1];
            System.arraycopy(figures, 0, temp, 0, figureCount);
            this.figures = temp;
        }
        this.figures[figureCount++] = figure;
    }

    /**
     * Method move tests the ability to move figure.
     * @param source the cell where the figure.
     * @param dist the cell move figure.
     * @return true.
     * @throws ImpossibleMoveException exception in case of impossibility of motion figure.
     * @throws OccupiedWayException exception if there's other figures.
     * @throws FigureNotFoundException exception if the figure is not found.
     */
    boolean move(Cell source, Cell dist) throws ImpossibleMoveException, OccupiedWayException, FigureNotFoundException {
        if (!(dist.getPivotX() > maxPivot || dist.getPivotX() < minPivot || dist.getPivotY() > maxPivot || dist.getPivotY() < minPivot)) {
            Figure figure = getFigure(source);
            if (figure != null) {
                Cell[] cells = figure.way(dist);
                for (Cell cell : cells) {
                    if (cell != null) {
                        if (getFigure(cell) != null) {
                            throw new OccupiedWayException("On the route there is a figure!");
                        }
                    }
                }
            } else {
                throw new FigureNotFoundException("The cell has no figure!");
            }
            figure.clone(dist);
        } else {
            throw new ImpossibleMoveException("Not the right coordinate! You went beyond the Board!");
        }
        return true;

    }


}
