package ru.sbulygin;

/**
* Класс Calculator.
* @author sbulygin.
* @since 13.11.2016.
* @version 1.0.
*/
public class Calculator {

    /**
    * Добавляем поле result.
    */
    private double result;

    /**
    * Метод add.
    * @param first первое слогаемое.
    * @param second второе слогаемое.
    */
    public void add(double first, double second) {
        this.result = first + second;
    }

    /**
    * Метод subtract.
    * @param first уменьшаемое.
    * @param second вычитаемое.
    */
    public void subtract(double first, double second) {
        this.result = first - second;
    }

    /**
    * Метод multiply.
    * @param first множимое.
    * @param second множитель.
    */
    public void multiply(double first, double second) {
         this.result = first * second;
    }

    /**
    * Метод div.
    * @param first делимое.
    * @param second делитель.
    */
    public void div(double first, double second) {
         this.result = first / second;
  }

    /**
    * Метод getResult.
    * @return полученое значение result
    */
    public double getResult() {
        return this.result;
  }
 }