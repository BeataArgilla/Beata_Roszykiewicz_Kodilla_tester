package com.kodilla.basic_assertion;

public class Application {
    public static void main(String[] args) {

        Calculator calculator = new Calculator();
        Calculator calculator1 = new Calculator();
        Calculator calculator2 = new Calculator();
        int a = 5;
        int b = 8;

        int sumResult = calculator.sum(a,b);
        int subResult = calculator1.sub(a,b);

        double c = 5;
        double d = 3;
        double potResult = calculator2.potega(c,d);




        boolean correct = ResultChecker.assertEquals(13, sumResult);  // nie rozumiem, skąd bierze się "expected:13" i dalej ponizej, ja wpisałam ręcznie
        if (correct) {
            System.out.println("Metoda sum działa poprawnie dla liczb " + a + " i " + b);
        } else {
            System.out.println("Metoda sum nie działa poprawnie dla liczb " + a + " i " + b);
        }


        boolean correct2 = ResultChecker.assertEquals2(-3, subResult);
        if (correct2) {
            System.out.println("Metoda sub działa poprawnie dla liczb " + a + " i " + b);
        } else {
            System.out.println("Metoda sub nie działa poprawnie dla liczb " + a + " i " + b);
        }



        boolean correct3 = ResultChecker.assertEquals3(125, potResult);
        if (correct3) {
            System.out.println("Metoda potęgowania działa poprawnie dla liczb " + c + " i " + d);
        } else {
            System.out.println("Metoda potegowania nie działa poprawnie dla liczb " + c + " i " + d);
        }

    }
}
