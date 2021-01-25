package com.kodilla.good.patterns.loty;

public class SearchForFlights {
    private AllFlights allFlights = new AllFlights();



    public void findADirectFlight(String dep, String arr) {
        allFlights.addFlights();
        allFlights.getAllFlights().stream()
                .filter((n -> n.getDeparture().equals(dep)))
                .filter((n -> n.getArrival().equals(arr)))
                .filter((n -> n.getFlightThroughTheCity().equals("-")))
                .forEach(System.out::println);



    }

    public void findFlightThroughTheCity(String dep, String arr, String throughTheCity) {


        allFlights.getAllFlights().stream()
                .filter((n -> n.getDeparture().equals(dep)))
                .filter((n -> n.getArrival().equals(arr)))
                .filter((n -> n.getFlightThroughTheCity().equals(throughTheCity)))
                .forEach(System.out::println);

    }


}
