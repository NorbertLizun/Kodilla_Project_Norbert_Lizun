package com.kodilla.good.patterns.loty;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class AllFlights {
    private List <Flight> allFlights = new ArrayList<>();


    public void addFlights() {
        allFlights.add(new Flight("GDANSK", "WROCLAW","-"));
        allFlights.add(new Flight("GDANSK", "WROCLAW","KRAKOW"));
        allFlights.add(new Flight("GDANSK", "WROCLAW","-"));
    }

    public List<Flight> getAllFlights() {
        return allFlights;
    }

}
