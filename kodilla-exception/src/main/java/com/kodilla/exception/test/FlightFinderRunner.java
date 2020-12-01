package com.kodilla.exception.test;

import javax.swing.plaf.basic.BasicDesktopIconUI;

public class FlightFinderRunner {
    public static void main(String[] args) {
        Flight flight1 = new Flight("Lotnisko3", "Lotnisko1");
        Flight flight2 = new Flight("Lotnisko2", "Lotnisko4");
        Flight flight3 = new Flight("Lotnisko1", "Lotnisko3");
        Flight flight4 = new Flight("Lotnisko7", "Lotnisko4");
        Flight flight5 = new Flight("Lotnisko3", "Lotnisko5");

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

        System.out.println("----------------------------------");

        try {
            flightFinder.findFilght(flight4);
        } catch (RouteNotFoundException e) {
            System.out.println("Error " + e);
        }

        System.out.println("----------------------------------");

        try {
            flightFinder.findFilght(flight5);
        } catch (RouteNotFoundException e) {
            System.out.println("Error " + e);
        }

    }
}
