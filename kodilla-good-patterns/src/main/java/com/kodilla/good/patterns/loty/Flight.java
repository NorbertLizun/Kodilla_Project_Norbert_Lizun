package com.kodilla.good.patterns.loty;

public class Flight {
    private String departure;
    private String arrival;
    private String flightThroughTheCity;

    public Flight(String departure, String arrival, String flightThroughTheCity) {
        this.departure = departure;
        this.arrival = arrival;
        this.flightThroughTheCity = flightThroughTheCity;
    }

    public String getDeparture() {
        return departure;
    }

    public String getArrival() {
        return arrival;
    }

    public String getFlightThroughTheCity() {
        return flightThroughTheCity;
    }

    @Override
    public String toString() {
        return "Flight{" +
                "departure='" + departure + '\'' +
                ", arrival='" + arrival + '\'' +
                ", flightThroughTheCity='" + flightThroughTheCity + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Flight flight = (Flight) o;

        if (departure != null ? !departure.equals(flight.departure) : flight.departure != null) return false;
        if (arrival != null ? !arrival.equals(flight.arrival) : flight.arrival != null) return false;
        return flightThroughTheCity != null ? flightThroughTheCity.equals(flight.flightThroughTheCity) : flight.flightThroughTheCity == null;
    }

    @Override
    public int hashCode() {
        int result = departure != null ? departure.hashCode() : 0;
        result = 31 * result + (arrival != null ? arrival.hashCode() : 0);
        result = 31 * result + (flightThroughTheCity != null ? flightThroughTheCity.hashCode() : 0);
        return result;
    }
}
