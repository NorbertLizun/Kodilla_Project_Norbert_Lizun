package com.kodilla.good.patterns.loty;

public class Main {
    public static void main(String[] args) {


        SearchForFlights searchForFlights = new SearchForFlights();
        searchForFlights.findFromFlight("GDANSK");
        System.out.println("------------------------");
        searchForFlights.findToFlight("WROCLAW");
        System.out.println("------------------------");
        searchForFlights.findFromToFlight("WARSZAWA", "POZNAN", "WROCLAW");



    }
}
