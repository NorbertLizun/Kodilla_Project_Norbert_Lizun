package com.kodilla.testing.weather.mock;

import com.kodilla.testing.weather.stub.Temperatures;
import com.kodilla.testing.weather.stub.WeatherForecast;
import org.junit.jupiter.api.*;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.*;

import static org.mockito.Mockito.*;
@ExtendWith(MockitoExtension.class)
class WeatherForecastTestSuite {

    @Mock
    private Temperatures temperaturesMock;

    @BeforeEach
    public void before() {
        Map<String, Double> temperaturesMap = new HashMap<>();
        temperaturesMap.put("Rzeszow", 25.5);
        temperaturesMap.put("Krakow", 26.2);
        temperaturesMap.put("Wroclaw", 24.8);
        temperaturesMap.put("Warszawa", 25.2);
        temperaturesMap.put("Gdansk", 26.1);

        when(temperaturesMock.getTemperatures()).thenReturn(temperaturesMap);
    }

    @Nested
    class TestsWeatherForecast {
        @Test
        void testCalculateForecastWithMock() {
            //Given
            WeatherForecast weatherForecast = new WeatherForecast(temperaturesMock);

            //When
            int quantityOfSensors = weatherForecast.calculateForecast().size();

            //Then
            Assertions.assertEquals(5, quantityOfSensors);
    }

        @Test
        void testCalculateAverageWithMock() {
            //Given
            WeatherForecast weatherForecast = new WeatherForecast(temperaturesMock);
            //When
            double average = weatherForecast.average();
            //Then
            Assertions.assertEquals(25.56, average);
    }

        @Test
        void testCalculateMedianWithMock() {
            //Given
            WeatherForecast weatherForecast = new WeatherForecast(temperaturesMock);
            //When
            double median = weatherForecast.median();
            //Then
            Assertions.assertEquals(25.5, median);
        }
    }


}