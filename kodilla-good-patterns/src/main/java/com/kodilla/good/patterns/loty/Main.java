package com.kodilla.good.patterns.loty;

public class Main {
    public static void main(String[] args) {


        SearchForFlights searchForFlights = new SearchForFlights();
        System.out.println(searchForFlights.findFlightFrom("GDANSK"));
        System.out.println("------------------------");
        System.out.println(searchForFlights.findFlightTo("WROCLAW"));
        System.out.println("------------------------");
        System.out.println(searchForFlights.findFlightThrough("WARSZAWA", "GDANSK"));


    }
}
