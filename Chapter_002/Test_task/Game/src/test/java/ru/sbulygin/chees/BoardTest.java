package ru.sbulygin.chees;

import org.junit.Before;
import org.junit.Test;
import ru.sbulygin.exeptions.FigureNotFoundException;
import ru.sbulygin.exeptions.ImpossibleMoveException;
import ru.sbulygin.exeptions.OccupiedWayException;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;
import static ru.sbulygin.chees.Cell.getObjectCell;

/**
 * Class BoardTest.
 *
 * @author ru.sbulygin.start.
 * @since 16.03.2017.
 * @version 1.0.
 */
public class BoardTest {

    /**
     * Field board.
     */
    private Board board;

    /**
     * Field figure object.
     */
    private Figure figure;

    /**
     * Field queen.
     */
    private Queen queen;

    /**
     * Field bishop.
     */
    private Bishop bishop;

    /**
     * Field rook.
     */
    private Rook rook;

    /**
     * Field king.
     */
    private King king;

    /**
     * Field horse.
     */
    private Horse horse;

    /**
     * Field pawn.
     */
    private Pawn pawn;

    /**
     * Fild pawn during the first move.
     */
    private Pawn pawnFestMove;

    /**
     * Information method to test.
     */
    @Before
    public void infoForTest() {
        this.board = new Board();
        this.queen = new Queen(getObjectCell(6, 3));
        this.bishop = new Bishop(getObjectCell(3, 3));
        this.rook = new Rook(getObjectCell(0, 3));
        this.king = new King(getObjectCell(4, 3));
        this.horse = new Horse(getObjectCell(3, 2));
        this.pawn = new Pawn(getObjectCell(6, 2));
        this.pawnFestMove = new Pawn(getObjectCell(4, 1));
    }

    /**
     * Test method  addFigure which puts a figure on the Board.
     */
    @Test
    public void whenAddFigureThatFigureInArray() {
        board.addFigure(bishop);
        figure = board.getFigure(bishop.getPosition());
        assertThat(bishop, is(figure));
    }

    /**
     * Testing the operation of the exception when the wrong coordinates movement figure.
     * @throws ImpossibleMoveException exception in case of impossibility of motion figure.
     * @throws OccupiedWayException exception if there's other figures.
     * @throws FigureNotFoundException exception if the figure is not found.
     */
    @Test(expected = ImpossibleMoveException.class)
    public void whenWrongDirectThenThrowException() throws ImpossibleMoveException, OccupiedWayException, FigureNotFoundException {
        board.addFigure(bishop);
        board.move(bishop.getPosition(), getObjectCell(8, 8));
    }

    /**
     * Testing the movement of the figure of the Queen.
     * @throws ImpossibleMoveException exception in case of impossibility of motion figure.
     * @throws OccupiedWayException exception if there's other figures.
     * @throws FigureNotFoundException exception if the figure is not found.
     */
    @Test
    public void whenQueenMoveThatSheHaveLastCoordinates() throws ImpossibleMoveException, OccupiedWayException, FigureNotFoundException  {
        board.addFigure(queen);
//        board.move(queen.getPosition(), getObjectCell(4, 1));
//        board.move(queen.getPosition(), getObjectCell(1, 1));
//        board.move(queen.getPosition(), getObjectCell(5, 5));
        board.move(queen.getPosition(), getObjectCell(3, 6));
        assertThat(queen.getPosition(), is(getObjectCell(3, 6)));
    }


}