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
    * Добавляем поле first.
    */
    private int first;
    /**
    * Добавляем поле int second.
    */
    private int second;

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
 }