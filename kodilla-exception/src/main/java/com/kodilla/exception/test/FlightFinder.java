package com.kodilla.exception.test;

import java.util.HashMap;
import java.util.Map;

public class FlightFinder {

    public void findFilght(Flight flight) throws RouteNotFoundException {

        Map<String, Boolean> theMap = new HashMap<>();
            theMap.put("Luton International Airport", true);
            theMap.put("Heathrow", true);
            theMap.put("Gatwick", true);

        if (theMap.containsKey(flight.getArrivalAirport())) {
            System.out.println(flight);
        } else {
            throw new RouteNotFoundException("Brak Połączenia");
        }


    }
}
