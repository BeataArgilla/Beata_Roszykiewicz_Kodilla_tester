package com.kodilla.abstracts.homework;

public class Rectangle extends Shape{
    double a;
    double b;

    @Override
    public double area() {
        return a*b;
    }

    @Override
    public double perimeter() {
        return 2*a+2*b;
    }


}
