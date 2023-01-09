package kodilla.collections.interfaces.homework;

public class CarRace {
    public static void main(String[] args) {
        Lamborgini lamborgini = new Lamborgini(100, 0);
        doRace(lamborgini);
        BMW bmw = new BMW(50, -20);
        doRace(bmw);
        Defender defender = new Defender(200, -50);
        doRace(defender);
    }

    private static void doRace(Car car) {
        car.increaseSpeed();
        car.increaseSpeed();
        car.increaseSpeed();
        car.decreaseSpeed();
        car.decreaseSpeed();
        System.out.println("Speed:  " + car.getSpeed());
    }
}
