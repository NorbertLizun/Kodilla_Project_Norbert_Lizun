package com.kodilla.good.patterns.loty;

import java.util.ArrayList;
import java.util.List;

public class FlightsRepository {
    private List <Flight> allFlights = new ArrayList<>();


    public FlightsRepository() {
        allFlights.add(new Flight("GDANSK", "WROCLAW"));
        allFlights.add(new Flight("GDANSK", "WARSZAWA"));
        allFlights.add(new Flight("WARSZAWA", "WROCLAW"));
        allFlights.add(new Flight("WARSZAWA", "WROCLAW"));
        allFlights.add(new Flight("WROCLAW", "POZNAN"));
    }

    public List<Flight> getAllFlights() {
        return allFlights;
    }


}
