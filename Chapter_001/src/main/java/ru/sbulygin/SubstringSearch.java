package ru.sbulygin;

/**
* Class SubstringSearch.
* @author sbulygin.
* @since 23.12.2016.
* @version 1.0.
*/

public class  SubstringSearch {

    /**
    * Method contains.
    * This method checks whether the string contains a substring.
    * @param origin in which to search the substring.
    * @param sub substring to check.
    * @return result true if a string contains a substring, and false otherwise.
    */
    boolean contains(String origin, String sub) {
        boolean result = false;
        int count = 0;
        char[] originArray = origin.toCharArray();
        char[] subArray = sub.toCharArray();
        for (int i = 0; i < originArray.length; i++) {
            if (originArray[i] == subArray[0] && subArray.length <= originArray.length) {
                for (int k = 0; k < subArray.length; k++) {
                    if (originArray[i + k] == subArray[k]) {
                        count++;
                    }
                }
                if (count == subArray.length) {
                    result = true;
                }
            }
        }
        return result;
    }
 }