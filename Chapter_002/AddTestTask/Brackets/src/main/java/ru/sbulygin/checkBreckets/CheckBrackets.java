package ru.sbulygin.checkBreckets;

/**
 * Class CheckBrackets.
 *
 * @author ru.sbulygin.start.
 * @since 19.03.2017.
 * @version 1.0.
 */
public class CheckBrackets {

    /**
     *  The method checkSymbol checks the closed brackets in the string.
     * @param line string line.
     * @return boolean value.
     */
    public boolean checkSymbol(String line) {
        String[] origin = line.split("");
        boolean result = false;
        int value = 0;
        for (String symbol : origin) {
            if (symbol.equals("(")) {
                value++;
            } else if (symbol.equals(")")) {
                if (--value < 0) {
                    result = false;
                    break;
                }
            }
            if (value == 0) {
                result = true;
            }
        }
        return result;
    }

}
