package ru.sbulygin;

//import static java.lang.Math.sqrt;

/**
* Класс Triangle.
* @author sbulygin.
* @since 18.11.2016.
* @version 1.0.
*/
public class Triangle {

    /**
    *  Добавляем поле Point a.
    */
    private Point a;

    /**
    *  Добавляем поле Point b.
    */
    private Point b;

    /**
    *  Добавляем поле Point c.
    */
    private Point c;

    /**
    * Метод getA.
    * @return  значение a.
    */
    public Point getA() {
        return this.a;
    }

    /**
    * Метод getB.
    * @return  значение b.
    */
    public Point getB() {
        return this.b;
    }

    /**
    * Метод getC.
    * @return  значение c.
    */
    public Point getC() {
         return this.c;
    }

    /**
    * Метод Triangle.
    * Констркутор для создания обьекта класса.
    * @param a точка a.
    * @param b точка b.
    * @param c точка c.
    */
    public Triangle(Point a, Point b, Point c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    /**
    * Метод area.
    * Метод вычисления площади треугольника.
    * Соблюдая условие прикотором треугольник не возможно построить.
    * @return либо значение площади треугольника, либо 0.
    * Если не возможно построить треугольник.
    */
    public double area() {
        double lineAB = this.getA().distanceTo(this.getB());
        double lineBC = this.getB().distanceTo(this.getC());
        double lineAC = this.getA().distanceTo(this.getC());
        double semiPerimetr = (lineAB + lineBC + lineAC) / 2;
        if (lineAB > 0 && lineBC > 0 && lineAC > 0) {
            return Math.sqrt(semiPerimetr * (semiPerimetr - lineAB) * (semiPerimetr - lineBC) * (semiPerimetr - lineAC));
        } else {
            return 0;
        }
    }
 }