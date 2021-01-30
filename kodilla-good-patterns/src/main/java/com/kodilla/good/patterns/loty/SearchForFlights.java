package com.kodilla.good.patterns.loty;


import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class SearchForFlights {
    private FlightsRepository flightsRepository = new FlightsRepository();

    public List<Flight> findFlightFrom(String departure) {

        return flightsRepository.getAllFlights()
                .stream()
                .filter(n -> n.getDeparture().equals(departure))
                .collect(Collectors.toList());

    }

    public List<Flight> findFlightTo(String arrival) {

        return flightsRepository.getAllFlights()
                .stream()
                .filter(n -> n.getArrival().equals(arrival))
                .collect(Collectors.toList());

    }

    public List<List <Flight>> findFlightThrough(String departure, String arrival) {

        List<Flight> flightsFrom = findFlightFrom(departure);
        List<Flight> flightsTo = findFlightTo(arrival);

        List<Flight> flightsIndirect = flightsFrom
                .stream()
                .filter(n -> flightsTo.contains(new Flight(n.getArrival(), arrival)))
                .collect(Collectors.toList());


        List<List<Flight>> connectList = new ArrayList<>();


        for (Flight flight : flightsIndirect) {

            List<Flight> flights = new ArrayList<>();
            flights.add(flight);
            flightsTo.stream()
                    .filter(n -> flight.getArrival().equals(n.getDeparture()))
                    .forEach(flights::add);

            connectList.add(flights);


        }

        return connectList;










    }







}
