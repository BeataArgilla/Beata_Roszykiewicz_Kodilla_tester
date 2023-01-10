package kodilla.collections.arrays.homework;

import kodilla.collections.interfaces.homework.Car;
import kodilla.collections.interfaces.homework.Defender;
import kodilla.collections.interfaces.homework.Lamborgini;
import kodilla.collections.interfaces.homework.BMW;

import java.util.Random;

public class CarApplication {
    private static final Random RANDOM = new Random(); // dlaczego RANDOM duże i skąd to wiedzieć?

    public static void main(String[] args) {
        Random random = new Random();
        Car[] cars = new Car[random.nextInt(15) + 1];
        for (int i = 0; i < cars.length; i++)
            cars[i] = drawCar();
        for (Car car : cars)
            CarUtils.describeCar(car);

    }

    public static Car drawCar() {
        Random random = new Random();
        int drawnCarBrand = random.nextInt(3);
        int a = random.nextInt(500+1-100)+100;
       // int a = getRandomSpeed(random);
        System.out.println(a);
        int b =0;
        if (drawnCarBrand == 0)
            return new Defender(a,b);
        else if ( drawnCarBrand == 1)
            return new Lamborgini(a,b);
        else
            return new BMW(a, b);


        }
        private static int getRandomSpeed(Random random){
        return RANDOM.nextInt(500);
        }

    }

