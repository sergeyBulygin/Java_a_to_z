package ru.sbulygin;


//import static java.lang.Math.max;

/**
* Класс Max.
* @author sbulygin.
* @since 18.11.2016.
* @version 1.0.
*/

public class Max {

    /**
    * Добавляем поле int first.
    */
    private int first;
    /**
    * Добавляем поле int second.
    */
    private int second;

    /**
    * Добавляем поле int third.
    */
    private int third;

    /**
    * Добавляем поле int value.
    */
    private int value;

    /**
    * Метод getValue.
    * @return полученое значение value.
    */
    public int getValue() {
        return this.value;
    }

    /**
    * Метод getFirst.
    * @return полученое значение first.
    */
    public int getFirst() {
        return this.first;
    }

    /**
    * Метод getSecond.
    * @return полученое значение second.
    */
    public int getSecond() {
        return this.second;
    }

    /**
    * Метод getThird.
    * @return полученое значение third.
    */
    public int getThird() {
        return this.third;
    }

    /**
    * Метод max.
    * Сравнивает 2 числа.
    * @param first первое число.
    * @param second второе число.
    * @return максимальное значение
    */
    public int max(int first, int second) {
        if (first == second) {
            return 0;
        } else if (first > second) {
            return first;
        } else {
            return second;
        }
    }

    /**
    * Метод maxThree.
    * Сравнивает 3 числа.
    * @param first первое число.
    * @param second второе число.
    * @param third третье число.
    * @return максимальное значение
    */
    public int maxThree(int first, int second, int third) {
        if (first == second || second == third || first == first) {
            return 0;
        } else {
            return Math.max(first, Math.max(second, third));
        }
    }
 }