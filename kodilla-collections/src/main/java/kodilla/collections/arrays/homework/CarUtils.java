package kodilla.collections.arrays.homework;

import kodilla.collections.interfaces.homework.BMW;
import kodilla.collections.interfaces.homework.Car;
import kodilla.collections.interfaces.homework.Defender;
import kodilla.collections.interfaces.homework.Lamborgini;

public class CarUtils {

    public static void describeCar(Car car) {
        System.out.println("-----------------------------");
        System.out.println("Car brand: " + CarUtils.getCarName(car));
        car.increaseSpeed();
        car.decreaseSpeed();
        System.out.println("Speed of the car: " + car.getSpeed());
    }

    private static String getCarName(Car car) {
        if (car instanceof BMW)
            return "BMW";
        else if (car instanceof Defender)
            return "Defender";
        else if (car instanceof Lamborgini)
            return "Lamborghini";
        else
            return "Unknown car brand";
    }


    }

