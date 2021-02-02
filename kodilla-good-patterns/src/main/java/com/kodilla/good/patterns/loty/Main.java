package com.kodilla.good.patterns.loty;

public class Main {
    public static void main(String[] args) {


        SearchForFlights searchForFlights = new SearchForFlights();
        searchForFlights.findFlightFrom("GDANSK");
        System.out.println("------------------------");
        searchForFlights.findFlightTo("WROCLAW");
        System.out.println("------------------------");
        searchForFlights.findFlightThrough("WARSZAWA",  "GDANSK");



    }
}
