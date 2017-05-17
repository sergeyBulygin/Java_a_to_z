package ru.sbulygin;

import java.util.Iterator;

/**
 * Class IteratorArray.
 *
 * @author sbulygin.
 * @since 17.05.2017.
 * @version 1.0.
 */
public class IteratorArray implements Iterator {

    /**
     * Array.
     */
    private int[][] array;

    /**
     * Index for row.
     */
    private int rowIndex;

    /**
     * Index for column.
     */
    private int columnIndex;


    /**
     * Constructor.
     * @param array array.
     */
    public IteratorArray(int[][] array) {

        this.array = array;
    }

    @Override
    public boolean hasNext() {

        boolean result = true;

        if (rowIndex < 0 || columnIndex < 0 || array.length <= rowIndex || array[0].length <= columnIndex) {
            result = false;
        }

        return result;

    }

    @Override
    public Object next() {

        int result = array[rowIndex][columnIndex];

        if (columnIndex == array[rowIndex].length - 1) {
            rowIndex += rowIndex;
        }

        columnIndex++;

        return result;
    }

}
