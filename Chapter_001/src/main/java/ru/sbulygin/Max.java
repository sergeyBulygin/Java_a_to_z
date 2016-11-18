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
    * Метод max.
    * Сравнивает 2 числа.
    * @param first первое число.
    * @param second второе число.
    * @return максимальное значение
    */
    public int max(int first, int second) {
        int result;
        if (first > second) {
            result = first;
        } else {
            result = second;
        }
        return result;
    }

    /**
    * Метод max.
    * Сравнивает 3 числа.
    * @param first первое число.
    * @param second второе число.
    * @param third третье число.
    * @return максимальное значение
    */
    public int max(int first, int second, int third) {
        Max calculateMax = new Max();
        return calculateMax.max(first, calculateMax.max(second, third));
        }
 }
