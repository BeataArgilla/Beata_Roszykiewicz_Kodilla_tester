package com.kodilla.abstracts.homework;

public class Square extends Shape {
    double a;

    @Override
    public double area() {
        return a * a;
    }

    @Override
    public double perimeter() {
        return  4 * a;
    }

}
