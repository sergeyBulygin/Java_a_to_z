package ru.sbulygin;

/**
* Class RotationArray.
* @author sbulygin.
* @since 11.12.2016.
* @version 1.0.
*/

public class  RotationArray {

    /**
    * Method turn.
    * This method array rotates 90 degrees.
    * @param value array of integer values.
    * @return inverted array.
    */
    public int[][] turn(int[][] value) {
        if (value == null || value.length <= 1) {
            throw new IllegalArgumentException("Array cannot have lenght <= 1 or equal to 0.");
        }
        for (int i = 0; i < value.length / 2; i++) {
            for (int k = 0; k < value.length - 1 - i; k++) {
            int tmpCell = value[i][k];
            value[i][k] = value[k][value.length - 1 - i];
            value[k][value.length - 1 - i] = value[value.length - 1 - i][value.length - 1 - k];
            value[value.length - 1 - i][value.length - 1 - k] = value[value.length - 1 - k][i];
            value[value.length - 1 - k][i] = tmpCell;
            }
        }
        return value;
    }
 }