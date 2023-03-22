package com.kodilla.spring.basic.spring_configuration.homework;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.LocalTime;

@Configuration
public class CarConfiguration {

    @Bean
    public Car getCar() {
        LocalTime now = LocalTime.now();
        String season = getSeason(now.getMonthValue());

        boolean headlightsTurnedOn = now.isAfter(LocalTime.of(20, 0)) || now.isBefore(LocalTime.of(6, 0));

        if (season.equals("summer")) {
            return new Cabrio(headlightsTurnedOn);
        } else if (season.equals("winter")) {
            return new SUV(headlightsTurnedOn);
        } else {
            return new Sedan(headlightsTurnedOn);
        }
    }

    private String getSeason(int month) {
        switch (month) {
            case 12:
            case 1:
            case 2:
                return "winter";
            case 3:
            case 4:
            case 5:
                return "spring";
            case 6:
            case 7:
            case 8:
                return "summer";
            case 9:
            case 10:
            case 11:
                return "autumn";
            default:
                return "unknown";
        }
    }
}