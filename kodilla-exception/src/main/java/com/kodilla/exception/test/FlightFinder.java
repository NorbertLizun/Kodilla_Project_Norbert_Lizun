package com.kodilla.exception.test;

import java.util.HashMap;
import java.util.Map;

public class FlightFinder {

    public boolean findFilght(Flight flight) throws RouteNotFoundException {

        final Map<String, Boolean> theMap = new HashMap<>();
        theMap.put("Lotnisko1", true);
        theMap.put("Lotnisko2", true);
        theMap.put("Lotnisko3", true);
        theMap.put("Lotnisko4", false);
        theMap.put("Lotnisko5", true);

        String departureAirport = flight.getDepartureAirport();
        String arrivalAirport = flight.getArrivalAirport();

        if (theMap.containsKey(departureAirport) && theMap.containsKey(arrivalAirport)) {
            System.out.println(flight);
            return theMap.get(arrivalAirport);
        } else {
            throw new RouteNotFoundException();
        }

    }
}



