package ru.sbulygin;

import java.util.Arrays;

/**
* Class RotationArray.
* @author sbulygin.
* @since 14.12.2016.
* @version 1.0.
*/

public class  RemoveRepetition {

    /**
    * Method findDestroy.
    * This method is repeated elements of an array.
    * And creates a copy of the array without repetition.
    * @param array array of string values.
    * @return new array without repetition.
    */
    public String[] findDestroy(String[] array) {
        if (array == null || array.length <= 1) {
            throw new IllegalArgumentException("Array cannot have lenght <= 1 or equal to 0.");
        }
        int countRepetition = 0;
        for (int i = 0; i < array.length - 1; i++) {
                for (int k = i + 1; k < array.length; k++) {
                    if (array[i] != null && array[k] != null && array[i].equals(array[k])) {
                        array[k] = null;
                        countRepetition++;
                    }
                }
                for (int n = array.length - 1; n >= 0; n--) {
                    for (int j = 0; j < n; j++) {
                        if (array[j] == null) {
                            array[j] = array[j + 1];
                            array[j + 1] = null;
                        }
                    }
                }
        }
        return Arrays.copyOf(array, array.length - countRepetition);
    }
 }