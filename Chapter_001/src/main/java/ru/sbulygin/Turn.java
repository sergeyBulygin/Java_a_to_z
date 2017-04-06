package ru.sbulygin;

/**
* Class Turn.
* @author sbulygin.
* @since 06.12.2016.
* @version 1.0.
*/

public class Turn {

    /**
    * Method back.
    * This method returns an array of inverted.
    * @param arr array of integer values.
    * @return inverted array.
    */
    public int[] back(int[] arr) {
        if (arr == null || arr.length <= 1) {
            throw new IllegalArgumentException("Array cannot have lenght <= 1 or equal to 0.");
        }
        for (int i = 0; i < arr.length / 2; i++) {
            int tmpCell = arr[i];
            arr[i] = arr[arr.length - 1 - i];
            arr[arr.length - 1 - i] = tmpCell;
        }
        return arr;
    }
 }