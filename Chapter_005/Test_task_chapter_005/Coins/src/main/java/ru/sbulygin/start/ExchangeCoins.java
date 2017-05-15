package ru.sbulygin.start;

import java.util.ArrayList;
import java.util.List;

/**
 * Class ExchangeCoins.
 *
 * @author ru.sbulygin.
 * @since 28.04.2017.
 * @version 1.0.
 */
public class ExchangeCoins {

    /**
     * A recursive method of exchange of the sum of these values.
     * @param coins an array of the values of coin.
     * @param usedCoins collection with sets of options exchange.
     * @param sum the amount of exchange.
     * @param level the level of recursion depth.
     */
    private void exchange(int[] coins, List<Integer> usedCoins, int sum, int level) {
        if (level >= coins.length) {
            return;
        }
        while (sum > getSumm(usedCoins)) {
            exchange(coins, new ArrayList<>(usedCoins), sum, level + 1);
            usedCoins.add(coins[level]);
            if (sum == getSumm(usedCoins)) {
                for (Integer index : usedCoins) {
                    System.out.print(index + " ");
                }
                System.out.println();

                break;
            }
        }
    }

    /**
     * Method that returns the sum of the values added to the collection.
     * @param all A collection of the values added to the collection.
     * @return the sum of the values of.
     */
    private static int getSumm(List<Integer> all) {
        int summ = 0;
        for (int i = 0; i < all.size(); i++) {
            summ += all.get(i);
        }
        return summ;
    }

    /**
     * The method of performing the exchange with the specified task parameters.
     * @param coins an array of the values of coin.
     * @param sum the amount of exchange.
     */
    public void process(int[] coins, int sum) {
        exchange(coins,  new ArrayList<>(), sum, 0);
    }


}
