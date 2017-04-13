package ru.sbulygin;

import java.util.ArrayList;
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
            return arrayList;
        }




    }
}
