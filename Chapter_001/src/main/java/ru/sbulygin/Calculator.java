package ru.sbulygin;

/**
* Класс калькулятор.
* @author sbulygin.
* @since 13.11.2016.
* @version 1.0.
*/ 

pablic class Calculator {

    private Double result;

    pablic void add(double first, double second) {
        this.result = first + second;
    }

    pablic void subtract(double first, double second) {
        this.result = first - second;
    }

    pablic void multiply(double first, double second) {
         this.result = first * second;
    }

    pablic void div(double first, double second) {
         this.result = first / second;
    }
 }