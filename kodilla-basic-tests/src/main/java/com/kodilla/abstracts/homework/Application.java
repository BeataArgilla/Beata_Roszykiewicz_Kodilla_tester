package com.kodilla.abstracts.homework;

public class Application {
    public static void main(String[] args) {
        Square square = new Square();
        Rectangle rectangle = new Rectangle();
        Trapeze trapeze = new Trapeze();

        square.a = 5;
        square.area();
        square.perimeter();
        System.out.println("Pole kwadratu wynosi:   " + square.area() + " , a obwód wynosi:   " + square.perimeter() );

        rectangle.a = 10;
        rectangle.b = 5;
        rectangle.area();
        rectangle.perimeter();
        System.out.println("Pole prostokata wynosi:   " + rectangle.area() + " , a obwód wynosi:   " + rectangle.perimeter() );

        trapeze.a = 2;
        trapeze.b = 3;
        trapeze.area();
        trapeze.perimeter();
        System.out.println("Pole trapezu wynosi:   " + trapeze.area() + " , a obwód wynosi:   " + trapeze.perimeter() );
    }
}
