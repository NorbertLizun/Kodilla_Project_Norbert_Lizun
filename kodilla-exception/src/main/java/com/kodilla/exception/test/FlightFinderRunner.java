package com.kodilla.exception.test;

public class FlightFinderRunner {
    public static void main(String[] args) {
        Flight flight1 = new Flight("Heathrow", "Luton International Airport");
        Flight flight2 = new Flight("Heathrow", "Warszawa Okęcie");
        Flight flight3 = new Flight("Luton International Airport", "Heathrow");

        FlightFinder flightFinder = new FlightFinder();

        try {
            flightFinder.findFilght(flight1);
        } catch (RouteNotFoundException e) {
            System.out.println("Error " + e);
        }

        System.out.println("----------------------------------");

        try {
            flightFinder.findFilght(flight2);
        } catch (RouteNotFoundException e) {
            System.out.println("Error " + e);
        }

        System.out.println("----------------------------------");

        try {
            flightFinder.findFilght(flight3);
        } catch (RouteNotFoundException e) {
            System.out.println("Error " + e);
        }

    }
}
