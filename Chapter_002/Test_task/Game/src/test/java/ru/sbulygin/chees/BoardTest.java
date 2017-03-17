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
     * Information method to test.
     */
    @Before
    public void infoForTest() {
        this.board = new Board();
        this.queen = new Queen(getObjectCell(6, 3));
        this.bishop = new Bishop(getObjectCell(3, 3));
        this.rook = new Rook(getObjectCell(3, 0));
        this.king = new King(getObjectCell(4, 3));
        this.horse = new Horse(getObjectCell(3, 2));
        this.pawn = new Pawn(getObjectCell(5, 1));
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

    /*
    QUEEN.
     */

    /**
     * Testing the movement of the figure of the Queen.
     * @throws ImpossibleMoveException exception in case of impossibility of motion figure.
     * @throws OccupiedWayException exception if there's other figures.
     * @throws FigureNotFoundException exception if the figure is not found.
     */
    @Test
    public void whenQueenMoveThatSheHaveLastCoordinates() throws ImpossibleMoveException, OccupiedWayException, FigureNotFoundException  {
        board.addFigure(queen);
        board.move(queen.getPosition(), getObjectCell(4, 1));
        board.move(queen.getPosition(), getObjectCell(1, 1));
        board.move(queen.getPosition(), getObjectCell(5, 5));
        board.move(queen.getPosition(), getObjectCell(3, 5));
        assertThat(queen.getPosition(), is(getObjectCell(3, 5)));
    }

    /**
     * Testing the operation of the exception when the wrong coordinates movement Queen.
     * @throws ImpossibleMoveException exception in case of impossibility of motion figure.
     * @throws OccupiedWayException exception if there's other figures.
     * @throws FigureNotFoundException exception if the figure is not found.
     */
    @Test(expected = ImpossibleMoveException.class)
    public void whenQueenWrongDirectThatTrowException() throws ImpossibleMoveException, OccupiedWayException, FigureNotFoundException {
        board.addFigure(queen);
        queen.way(getObjectCell(5, 5));
    }

    /**
     * Testing the operation of the exception when on the way of stroke has a different figure.
     * @throws ImpossibleMoveException exception in case of impossibility of motion figure.
     * @throws OccupiedWayException exception if there's other figures.
     * @throws FigureNotFoundException exception if the figure is not found.
     */
    @Test(expected = OccupiedWayException.class)
    public void whenOtherFigureOnMoveQueenThanTrowException() throws ImpossibleMoveException, OccupiedWayException, FigureNotFoundException {
        board.addFigure(bishop);
        board.addFigure(queen);
        board.move(queen.getPosition(), getObjectCell(1, 3));
    }

    /*
    BISHOP
     */

    /**
     * Testing the movement of the figure of the Bishop.
     * @throws ImpossibleMoveException exception in case of impossibility of motion figure.
     * @throws OccupiedWayException exception if there's other figures.
     * @throws FigureNotFoundException exception if the figure is not found.
     */
    @Test
    public void whenBishopMoveThatHeHasLastCoordinates()  throws ImpossibleMoveException, OccupiedWayException, FigureNotFoundException {
        board.addFigure(bishop);
        board.move(bishop.getPosition(), getObjectCell(1, 5));
        board.move(bishop.getPosition(), getObjectCell(3, 7));
        board.move(bishop.getPosition(), getObjectCell(6, 4));
        board.move(bishop.getPosition(), getObjectCell(4, 2));
        assertThat(bishop.getPosition(), is(getObjectCell(4, 2)));
    }

    /**
     * Testing the operation of the exception when the wrong coordinates movement Bishop.
     * @throws ImpossibleMoveException exception in case of impossibility of motion figure.
     * @throws OccupiedWayException exception if there's other figures.
     * @throws FigureNotFoundException exception if the figure is not found.
     */
    @Test(expected = ImpossibleMoveException.class)
    public void whenBishopWrongDirectThatTrowException() throws ImpossibleMoveException, OccupiedWayException, FigureNotFoundException {
        board.addFigure(bishop);
        bishop.way(getObjectCell(1, 3));
    }

    /**
     * Testing the operation of the exception when on the way of stroke has a different figure.
     * @throws ImpossibleMoveException exception in case of impossibility of motion figure.
     * @throws OccupiedWayException exception if there's other figures.
     * @throws FigureNotFoundException exception if the figure is not found.
     */
    @Test(expected = OccupiedWayException.class)
    public void whenOtherFigureOnMoveBishopThanTrowException() throws ImpossibleMoveException, OccupiedWayException, FigureNotFoundException {
        board.addFigure(bishop);
        board.addFigure(pawn);
        board.move(bishop.getPosition(), getObjectCell(6, 0));
    }

    /*
    ROOK.
     */

    /**
     * Testing the movement of the figure of the Rook.
     * @throws ImpossibleMoveException exception in case of impossibility of motion figure.
     * @throws OccupiedWayException exception if there's other figures.
     * @throws FigureNotFoundException exception if the figure is not found.
     */
    @Test
    public void whenRookMoveThatHeHasLastCoordinates()  throws ImpossibleMoveException, OccupiedWayException, FigureNotFoundException {
        board.addFigure(rook);
        board.move(rook.getPosition(), getObjectCell(6, 0));
        board.move(rook.getPosition(), getObjectCell(6, 2));
        board.move(rook.getPosition(), getObjectCell(2, 2));
        board.move(rook.getPosition(), getObjectCell(2, 5));
        assertThat(rook.getPosition(), is(getObjectCell(2, 5)));
    }

    /**
     * Testing the operation of the exception when the wrong coordinates movement Rook.
     * @throws ImpossibleMoveException exception in case of impossibility of motion figure.
     * @throws OccupiedWayException exception if there's other figures.
     * @throws FigureNotFoundException exception if the figure is not found.
     */
    @Test(expected = ImpossibleMoveException.class)
    public void whenRookWrongDirectThatTrowException() throws ImpossibleMoveException, OccupiedWayException, FigureNotFoundException {
        board.addFigure(rook);
        rook.way(getObjectCell(5, 1));
    }

    /**
     * Testing the operation of the exception when on the way of stroke has a different figure.
     * @throws ImpossibleMoveException exception in case of impossibility of motion figure.
     * @throws OccupiedWayException exception if there's other figures.
     * @throws FigureNotFoundException exception if the figure is not found.
     */
    @Test(expected = OccupiedWayException.class)
    public void whenOtherFigureOnMoveRookThanTrowException() throws ImpossibleMoveException, OccupiedWayException, FigureNotFoundException {
        board.addFigure(rook);
        board.addFigure(bishop);
        board.move(rook.getPosition(), getObjectCell(3, 4));
    }

    /*
    KING.
     */

    /**
     * Testing the movement of the figure of the King.
     * @throws ImpossibleMoveException exception in case of impossibility of motion figure.
     * @throws OccupiedWayException exception if there's other figures.
     * @throws FigureNotFoundException exception if the figure is not found.
     */
    @Test
    public void whenKingMoveThatHeHasLastCoordinates()  throws ImpossibleMoveException, OccupiedWayException, FigureNotFoundException {
        board.addFigure(king);
        board.move(king.getPosition(), getObjectCell(4, 4));
        board.move(king.getPosition(), getObjectCell(5, 3));
        board.move(king.getPosition(), getObjectCell(4, 2));
        board.move(king.getPosition(), getObjectCell(3, 1));
        assertThat(king.getPosition(), is(getObjectCell(3, 1)));
    }

    /**
     * Testing the operation of the exception when the wrong coordinates movement King.
     * @throws ImpossibleMoveException exception in case of impossibility of motion figure.
     * @throws OccupiedWayException exception if there's other figures.
     * @throws FigureNotFoundException exception if the figure is not found.
     */
    @Test(expected = ImpossibleMoveException.class)
    public void whenKingWrongDirectThatTrowException() throws ImpossibleMoveException, OccupiedWayException, FigureNotFoundException {
        board.addFigure(king);
        king.way(getObjectCell(5, 5));
    }

    /**
     * Testing the operation of the exception when on the way of stroke has a different figure.
     * @throws ImpossibleMoveException exception in case of impossibility of motion figure.
     * @throws OccupiedWayException exception if there's other figures.
     * @throws FigureNotFoundException exception if the figure is not found.
     */
    @Test(expected = OccupiedWayException.class)
    public void whenOtherFigureOnMoveKingThanTrowException() throws ImpossibleMoveException, OccupiedWayException, FigureNotFoundException {
        board.addFigure(king);
        board.addFigure(bishop);
        board.move(king.getPosition(), getObjectCell(3, 3));
    }

    /*
    HORSE.
     */

    /**
     * Testing the movement of the figure of the Horse.
     * @throws ImpossibleMoveException exception in case of impossibility of motion figure.
     * @throws OccupiedWayException exception if there's other figures.
     * @throws FigureNotFoundException exception if the figure is not found.
     */
    @Test
    public void whenHorseMoveThatHeHasLastCoordinates()  throws ImpossibleMoveException, OccupiedWayException, FigureNotFoundException {
        board.addFigure(horse);
        board.move(horse.getPosition(), getObjectCell(1, 3));
        board.move(horse.getPosition(), getObjectCell(0, 5));
        board.move(horse.getPosition(), getObjectCell(2, 4));
        board.move(horse.getPosition(), getObjectCell(4, 3));
        assertThat(horse.getPosition(), is(getObjectCell(4, 3)));
    }

    /**
     * Testing the operation of the exception when the wrong coordinates movement Horse.
     * @throws ImpossibleMoveException exception in case of impossibility of motion figure.
     * @throws OccupiedWayException exception if there's other figures.
     * @throws FigureNotFoundException exception if the figure is not found.
     */
    @Test(expected = ImpossibleMoveException.class)
    public void whenHorseWrongDirectThatTrowException() throws ImpossibleMoveException, OccupiedWayException, FigureNotFoundException {
        board.addFigure(horse);
        horse.way(getObjectCell(0, 2));
    }

    /**
     * Testing the operation of the exception when on the way of stroke has a different figure.
     * @throws ImpossibleMoveException exception in case of impossibility of motion figure.
     * @throws OccupiedWayException exception if there's other figures.
     * @throws FigureNotFoundException exception if the figure is not found.
     */
    @Test(expected = OccupiedWayException.class)
    public void whenOtherFigureOnMoveHorseThanTrowException() throws ImpossibleMoveException, OccupiedWayException, FigureNotFoundException {
        board.addFigure(horse);
        board.addFigure(rook);
        board.move(rook.getPosition(), getObjectCell(2, 0));
        board.move(horse.getPosition(), getObjectCell(2, 0));
    }

    /*
    PAWN.
     */

    /**
     * Testing the movement of the figure of the Pawn.
     * @throws ImpossibleMoveException exception in case of impossibility of motion figure.
     * @throws OccupiedWayException exception if there's other figures.
     * @throws FigureNotFoundException exception if the figure is not found.
     */
    @Test
    public void whenPawnMoveThatHeHasLastCoordinates()  throws ImpossibleMoveException, OccupiedWayException, FigureNotFoundException {
        board.addFigure(pawn);
        board.move(pawn.getPosition(), getObjectCell(5, 2));
        board.move(pawn.getPosition(), getObjectCell(5, 3));
        board.move(pawn.getPosition(), getObjectCell(5, 4));
        board.move(pawn.getPosition(), getObjectCell(5, 5));
        assertThat(pawn.getPosition(), is(getObjectCell(5, 5)));
    }

    /**
     * Testing the movement of the figure of the Pawn when the course first .
     * @throws ImpossibleMoveException exception in case of impossibility of motion figure.
     * @throws OccupiedWayException exception if there's other figures.
     * @throws FigureNotFoundException exception if the figure is not found.
     */
    @Test
    public void whenPawnMoveFirstThatHeHasLastCoordinates()  throws ImpossibleMoveException, OccupiedWayException, FigureNotFoundException {
        board.addFigure(pawn);
        board.move(pawn.getPosition(), getObjectCell(5, 3));
        board.move(pawn.getPosition(), getObjectCell(5, 4));
        board.move(pawn.getPosition(), getObjectCell(5, 5));
        board.move(pawn.getPosition(), getObjectCell(5, 6));
        assertThat(pawn.getPosition(), is(getObjectCell(5, 6)));
    }

    /**
     * Testing the operation of the exception when the wrong coordinates movement Pawn.
     * @throws ImpossibleMoveException exception in case of impossibility of motion figure.
     * @throws OccupiedWayException exception if there's other figures.
     * @throws FigureNotFoundException exception if the figure is not found.
     */
    @Test(expected = ImpossibleMoveException.class)
    public void whenPawnWrongDirectThatTrowException() throws ImpossibleMoveException, OccupiedWayException, FigureNotFoundException {
        board.addFigure(pawn);
        pawn.way(getObjectCell(4, 2));
    }

    /**
     * Testing the operation of the exception when on the way of stroke has a different figure.
     * @throws ImpossibleMoveException exception in case of impossibility of motion figure.
     * @throws OccupiedWayException exception if there's other figures.
     * @throws FigureNotFoundException exception if the figure is not found.
     */
    @Test(expected = OccupiedWayException.class)
    public void whenOtherFigureOnMovePawnThanTrowException() throws ImpossibleMoveException, OccupiedWayException, FigureNotFoundException {
        board.addFigure(pawn);
        board.addFigure(queen);
        board.move(queen.getPosition(), getObjectCell(5, 2));
        board.move(pawn.getPosition(), getObjectCell(5, 2));
    }


}