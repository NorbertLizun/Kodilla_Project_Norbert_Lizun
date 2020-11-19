package com.kodilla.testing.weather.stub;

import java.util.*;

public class WeatherForecast {
    private Temperatures temperatures;
    private double average;
    private double median;

    public WeatherForecast(Temperatures temperatures) {
        this.temperatures = temperatures;
    }

    public Map<String, Double> calculateForecast() {
        Map<String, Double> resultMap = new HashMap<>();

        for (Map.Entry<String, Double> temperature :
                temperatures.getTemperatures().entrySet()) {

            // adding 1 celsius degree to current value
            // as a temporary weather forecast
            resultMap.put(temperature.getKey(), temperature.getValue() + 1.0); // [1]
        }
        return resultMap;
    }

    public double average() {
        double temp = 0.0;

        for (Map.Entry<String, Double> temperature : temperatures.getTemperatures().entrySet()) {
            temp = temp +  temperature.getValue();
        }

        average =  temp / temperatures.getTemperatures().size();
        return average;
    }

    public double median() {

        List<Double> list = new ArrayList<>();
        for (Map.Entry<String, Double> temperature : temperatures.getTemperatures().entrySet()) {
            list.add(temperature.getValue());
        }

        Collections.sort(list);
        if(list.size() % 2 == 0) {
            median = ((double)list.get(list.size()/2) + (double)list.get(list.size()/2 -1)) / 2;
        } else {
            median = (double)list.get(list.size()/2);
        }

        return median;
    }




}

