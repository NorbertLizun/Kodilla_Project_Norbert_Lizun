package com.kodilla.good.patterns.loty;

import java.util.ArrayList;
import java.util.List;

public class AllFlights {
    private List <Flight> allFlights = new ArrayList<>();


    public void addFlights() {
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
