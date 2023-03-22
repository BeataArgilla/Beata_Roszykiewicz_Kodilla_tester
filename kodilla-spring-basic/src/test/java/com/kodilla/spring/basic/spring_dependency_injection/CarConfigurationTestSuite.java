package com.kodilla.spring.basic.spring_dependency_injection;
java import com.kodilla.spring.basic.spring_configuration.homework.*;
import org.junit.jupiter.api.Test;
import java.time.LocalTime;
import static org.junit.jupiter.api.Assertions.*;

public class CarConfigurationTestSuite {
    @Test
    public void shouldReturnSUVInWinterAtNight() {
        CarConfiguration carConfiguration = new CarConfiguration();
        LocalTime time = LocalTime.of(23, 0);
        Car car = carConfiguration.getCar(time.getMonthValue(), time);

        assertTrue(car instanceof SUV);
        assertTrue(car.hasHeadlightsTurnedOn());
    }

    @Test
    public void shouldReturnCabrioInSummerAtNight() {
        CarConfiguration carConfiguration = new CarConfiguration();
        LocalTime time = LocalTime.of(23, 0);
        Car car = carConfiguration.getCar(6, time);

        assertTrue(car instanceof Cabrio);
        assertTrue(car.hasHeadlightsTurnedOn());
    }

    @Test
    public void shouldReturnSedanInSpringDuringTheDay() {
        CarConfiguration carConfiguration = new CarConfiguration();
        LocalTime time = LocalTime.of(10, 0);
        Car car = carConfiguration.getCar(4, time);

        assertTrue(car instanceof Sedan);
        assertFalse(car.hasHeadlightsTurnedOn());
    }

    @Test
    public void shouldReturnSedanForUnknownSeason() {
        CarConfiguration carConfiguration = new CarConfiguration();
        LocalTime time = LocalTime.of(10, 0);
        Car car = carConfiguration.getCar(13, time);

        assertTrue(car instanceof Sedan);
        assertFalse(car.hasHeadlightsTurnedOn());
    }
}

}
