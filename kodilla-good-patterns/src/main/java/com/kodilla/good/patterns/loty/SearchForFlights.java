package com.kodilla.good.patterns.loty;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;


public class SearchForFlights {
    private AllFlights allFlights = new AllFlights();



    public void findFromFlight(String dep) {
        allFlights.addFlights();
        allFlights.getAllFlights().stream()
                .filter((n -> n.getDeparture().equals(dep)))
                .forEach(System.out::println);



    }

    public void findToFlight(String arr) {


        allFlights.getAllFlights().stream()
                .filter((n -> n.getArrival().equals(arr)))
                .forEach(n -> System.out.println(n.getDeparture() + " to " + n.getArrival()));

    }

    public void findFromToFlight(String dep, String arr, String city) {
















    }





// Wrocław = Gdańsk + Gdańsk  = Warszawa

}
