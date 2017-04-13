package ru.sbulygin;

import sun.font.GlyphLayout;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * Class ConvertList.
 *
 * @author ru.sbulygin.
 * @since 13.04.2017.
 * @version 1.0.
 */
public class ConvertList {

    /**
     * A method converts a two-dimensional array to an ArrayList.
     * @param array two-dimensional array.
     * @return collection ArrayList.
     */
    public List<Integer> toList(int[][] array) {
        List<Integer> arrayList = new ArrayList<>();
        for (int[] index : array) {
            for (int value : index) {
                arrayList.add(value);
            }
        }
        return arrayList;

    }

    /**
     * Method converts an ArrayList into a two-dimensional array.
     * @param list collection.
     * @param rows the number of rows.
     * @return array.
     */
    public int[][] toArray(List<Integer> list, int rows) {
        int length = list.size() / rows;
        if (list.size() % rows != 0) {
            length += 1;
        }
        int[][] listArray = new int[rows][length];
        Iterator<Integer> iterator = list.iterator();
        for (int row = 0; row != rows; row++) {
            for (int column = 0; column != length; column++) {
                if (iterator.hasNext()) {
                    listArray[row][column] = iterator.next();
                } else {
                    listArray[row][column] = 0;
                }
            }
        }
        return listArray;

    }

}
