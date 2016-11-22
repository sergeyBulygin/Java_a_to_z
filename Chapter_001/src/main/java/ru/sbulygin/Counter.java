package ru.sbulygin;

/**
* Класс Counter.
* @author sbulygin.
* @since 22.11.2016.
* @version 1.0.
*/
public class Counter {
    /**
    * Метод Triangle.
    * Констркутор для создания обьекта класса.
    * @param start начало диапозона.
    * @param finish конец диапозона.
    * @return возвращает скмму четных чисел.
    */
    public int add(int start, int finish) {
        int sum = 0;
        for (int i = start; i <= finish; i++) {
            if (i % 2 == 0) {
                sum += i;
            }
        }
        return sum;
    }
 }