package ru.sbulygin;

/**
* Класс Factorial.
* @author sbulygin.
* @since 28.11.2016.
* @version 1.0.
*/
public class Factorial {

    /**
    * Метод fact.
    * Этот метод вычисляет факториал.
    * @param a это число> = 0.
    * @return возвращает вычисленный факториал.
    * @exeption в случае a < 0 передаеться исключение IllegalArgumentException.
    * @see IllegalArgumentException.
    */
    public long fact(int a) {
        long result = 1L;
        if (a == 0) {
            return result;
        }
        if (a < 0) {
            throw new IllegalArgumentException("The argument value must be > 0.");
        }
        for (int i = 2; i <= a; i++) {
            result *= i;
        }
        return result;
  }
 }