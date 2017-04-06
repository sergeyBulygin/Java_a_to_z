package ru.sbulygin;

//import static java.lang.Math.sqrt;
//import static java.lang.Math.pow;

/**
* Класс Point.
* @author sbulygin.
* @since 17.11.2016.
* @version 1.0.
*/

public class Point {

    /**
    * Добавляем поле double x.
    */
    private double x;
    /**
    * Добавляем поле double y.
    */
    private double y;

    /**
    * Метод Point.
    * Констркутор для создания обьекта класса.
    * @param x координата по оси х.
    * @param y координата по оси y.
    */
    public Point(double x, double y) {
        this.x = x;
        this.y = y;
    }

    /**
    * Метод getX.
    * @return полученое значение x.
    */
    public double getX() {
        return this.x;
    }

    /**
    * Метод getY.
    * @return полученое значение y.
    */
    public double getY() {
        return this.y;
    }

    /**
    * Метод distanceTo.
    * Метод определяет расстояние между двумя точками.
    * @param point вторая point.
    * @return расстояние между двумя точками.
    */
    public double distanceTo(Point point) {
        return Math.sqrt(Math.pow(point.x - this.x, 2) + Math.pow(point.y - this.y, 2));
    }
 }