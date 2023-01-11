package kodilla.collections.lists.homework;

import kodilla.collections.interfaces.homework.Car;
import kodilla.collections.interfaces.homework.Defender;
import kodilla.collections.arrays.homework.CarUtils;

import java.util.ArrayList;
import java.util.List;

public class CarsListApplication {
    public static void main(String[] args) {
        List<Defender> brand = new ArrayList<>();
        brand.add(new Defender(100, 50));
        brand.add(new Defender(200, 50));
        brand.add(new Defender(180, 30));
        brand.add(new Defender(150, 52));

        System.out.println("Size of the list   " + brand.size()); // to dla moich potrzeb

        brand.remove(1);
        System.out.println("Size of the list   " + brand.size());

        Defender defender = new Defender(180, 30);
        brand.remove(defender);
        System.out.println("Size of the listy   " + brand.size());

        for (Car car : brand) // zrobiłam to, ale nie rozumiem
            CarUtils.describeCar(car);

        System.out.println("--------------------------");
        System.out.println("Size of the list   " + brand.size());

        }

    }



