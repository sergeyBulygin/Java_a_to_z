package ru.sbulygin;

/**
* Class MergeSort.
* @author sbulygin.
* @since 22.12.2016.
* @version 1.0.
*/

public class MergeSort {

    /**
    * Method bubbleSort.
    * This method merges two sorted arrays and returns a sorted array.
    * @param firstArray array of integer values.
    * @param secondArray array of integer values.
    * @return sortArray sorting array.
    */
    public int[] merg(int[] firstArray, int[] secondArray) {
        if (firstArray == null || firstArray.length <= 1 || secondArray == null || secondArray.length <= 1) {
            throw new IllegalArgumentException("Array cannot have lenght <= 1 or equal to 0.");
        }
        int newLength = firstArray.length + secondArray.length;
        int[] sortArray = new int[newLength];
        int indexOne = 0;
        int indexTwo = 0;
        for (int i = 0; i < newLength; i++) {
            if (indexOne == firstArray.length) {
                sortArray[i] = secondArray[indexTwo++];
            } else if (indexTwo == secondArray.length) {
                sortArray[i] = firstArray[indexOne++];
            } else if (firstArray[indexOne] < secondArray[indexTwo]) {
                sortArray[i] = firstArray[indexOne++];
            } else {
                sortArray[i] = secondArray[indexTwo++];
            }
        }
        return sortArray;
    }
 }