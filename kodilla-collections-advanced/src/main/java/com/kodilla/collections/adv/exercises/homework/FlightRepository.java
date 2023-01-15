package com.kodilla.collections.adv.exercises.homework;
import java.util.ArrayList;
import java.util.List;


    public class FlightRepository {
        public static List<Flight> getFlightsTable(String airport) {
            List<Flight> flights = new ArrayList<>();
            if (airport.equals("JFK")) {
                flights.add(new Flight("JFK", "LAX"));
                flights.add(new Flight("JFK", "SFO"));
                flights.add(new Flight("JFK", "LHR"));
            } else if (airport.equals("LHR")) {
                flights.add(new Flight("LHR", "JFK"));
                flights.add(new Flight("LHR", "SFO"));
                flights.add(new Flight("LHR", "LAX"));
            } else if (airport.equals("LAX")) {
                flights.add(new Flight("LAX", "JFK"));
                flights.add(new Flight("LAX", "LHR"));
                flights.add(new Flight("LAX", "SFO"));
            }
            return flights;
        }
    }


