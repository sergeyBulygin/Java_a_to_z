package ru.sbulygin;

/**
* Class SortArray.
* @author sbulygin.
* @since 06.12.2016.
* @version 1.0.
*/

public class SortArray {

    /**
    * Method bubbleSort.
    * This method returns an sorting array.
    * @param values array of integer values.
    * @return sorting array.
    */
    public static int[] bubbleSort(int[] values) {
        if (values == null || values.length <= 1) {
            throw new IllegalArgumentException("Array cannot have lenght <= 1 or equal to 0.");
        }
        for (int i = values.length - 1; i > 0; i--) {
            for (int j = 0; j < i; j++) {
                if (values[j] > values[j + 1]) {
                    int tempCell = values[j];
                    values[j] = values[j + 1];
                    values[j + 1] = tempCell;
                }
            }
        }
        return values;
    }
 }