package ru.sbulygin.start;

import java.util.ArrayList;
import java.util.List;


/**
 * Created by anonymus on 15.05.17.
 */
public class ExchengeCoins {

    private void exch(int[] coins, List<Integer> usedCoins, int sum, int level) {
        if (level >= coins.length) {
            return;
        }
        while (sum > getSumm(usedCoins)) {
            exch(coins, new ArrayList<>(usedCoins), sum, level + 1);
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

    private static int getSumm(List<Integer> all)
    {
        int summ = 0;
        for(int i = 0; i < all.size(); i++)
            summ += all.get(i);
        return summ;
    }

    public void process(int[] coins, int sum) {
        exch(coins,  new ArrayList<>(), sum, 0);
    }

    public static void main(String[] args) {
        ExchengeCoins coins = new ExchengeCoins();
        coins.process(new int[]{5, 1, 10}, 20);

    }


}
