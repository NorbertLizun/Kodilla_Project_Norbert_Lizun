package com.kodilla.good.patterns.loty;


import java.util.ArrayList;
import java.util.Collection;
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

    public void findFlightThrough(String departure, String arrival) {

        List<Flight> flightsFrom = findFlightFrom(departure);
        List<Flight> flightsTo = findFlightTo(arrival);


        List<Flight> flightsIndirect = flightsFrom
                .stream()
                .filter(n -> flightsTo.contains(new Flight(n.getArrival(), arrival)))
                .collect(Collectors.toList());

        List<Flight> flightsTester = flightsTo
                .stream()
                .filter(n -> flightsFrom.contains(new Flight(n.getDeparture(), departure)))
                .collect(Collectors.toList());


        List<List<Flight>> connectList = new ArrayList<>();
            List<Flight> flights = new ArrayList<>();


            flights.addAll(flightsIndirect);

            List<Flight> secondFlight = flightsTo.stream()
                    .filter(n -> n.getArrival().equals(arrival))
                    .collect(Collectors.toList());


            flightsTester.addAll(flights);
            flightsTester.addAll(secondFlight);

            connectList.add(flightsTester);





        System.out.println(connectList);















    }







}
