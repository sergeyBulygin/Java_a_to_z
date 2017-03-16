package ru.sbulygin.chees;

/**
 * Class Cell.
 *
 * @author ru.sbulygin.start.
 * @since 03.03.2017.
 * @version 1.0.
 */
public class Cell {

    /**
     * Field coordinates are X squares of the Board.
     */
    private int pivotX;

    /**
     * Field coordinates are Y squares of the Board.
     */
    private int pivotY;

    /**
     * The constructor of the Cell class generates the class object.
     * @param pivotX The X-coordinate of the cell Board.
     * @param pivotY The Y-coordinate of the cell Board.
     */
    private Cell(int pivotX, int pivotY) {
        this.pivotX = pivotX;
        this.pivotY = pivotY;
    }

    /**
     * Static method object of class Cell.
     * @param pivotX The X-coordinate of the cell Board.
     * @param pivotY The Y-coordinate of the cell Board.
     * @return Returns a new object of class.
     */
    public static Cell getObjectCell(int pivotX, int pivotY) {
        return new Cell(pivotX, pivotY);
    }

    /**
     * Access method to the field of X coordinates.
     * @return The X-coordinate of the cell Board.
     */
    public int getPivotX() {
        return this.pivotX;
    }

    /**
     * Access method to the field of Y coordinates.
     * @return The Y-coordinate of the cell Board.
     */
    public int getPivotY() {
        return this.pivotY;
    }

    /**
     * A method for assigning X coordinate value.
     * @param pivotX The X-coordinate of the cell Board.
     */
    public void setPivotX(int pivotX) {
        this.pivotX = pivotX;
    }

    /**
     * A method for assigning Y coordinate value.
     * @param pivotY The Y-coordinate of the cell Board.
     */
    public void setPivotY(int pivotY) {
        this.pivotY = pivotY;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof Cell)) {
            return false;
        }

        Cell cell = (Cell) o;

        if (getPivotX() != cell.getPivotX()) {
            return false;
        }
        return getPivotY() == cell.getPivotY();
    }

    @Override
    public int hashCode() {
        int result = getPivotX();
        result = 31 * result + getPivotY();
        return result;
    }
}
