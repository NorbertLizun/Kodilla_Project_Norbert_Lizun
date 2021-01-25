package com.kodilla.good.patterns.loty;

public class Main {
    public static void main(String[] args) {


        SearchForFlights searchForFlights = new SearchForFlights();
        searchForFlights.findADirectFlight("GDANSK", "WROCLAW");
        System.out.println("-----------------------");
        searchForFlights.findFlightThroughTheCity("GDANSK", "WROCLAW", "KRAKOW");

    }
}
