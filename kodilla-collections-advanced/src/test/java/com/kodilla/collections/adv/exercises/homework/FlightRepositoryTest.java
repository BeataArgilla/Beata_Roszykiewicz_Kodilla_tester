package com.kodilla.collections.adv.exercises.homework;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

class FlightRepositoryTest {

    private List<Flight> flights = List.of(
            new Flight("JFK", "LAX"),
            new Flight("JFK", "SFO"),
            new Flight("JFK", "LHR"),
            new Flight("LHR", "JFK"),
            new Flight("LHR", "SFO"),
            new Flight("LHR", "LAX"),
            new Flight("LAX", "JFK"),
            new Flight("LAX", "LHR"),
            new Flight("LAX", "SFO")
    );
    private FlightFinder flightFinder = new FlightFinder(flights);

    @Test
    public void findFlightsFrom() {
        List<Flight> result = flightFinder.findFlightsFrom("JFK");
        assertEquals(3, result.size());
        assertTrue(result.stream().allMatch(f -> f.getDeparture().equals("JFK")));
    }

    @Test
    public void findFlightsTo() {
        List<Flight> result = flightFinder.findFlightsTo("SFO");
        assertEquals(2, result.size());
        assertTrue(result.stream().allMatch(f -> f.getArrival().equals("SFO")));
    }
}

