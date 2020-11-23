package com.kodilla.stream.array;

import org.junit.jupiter.api.Test;

import java.util.stream.IntStream;

import static com.kodilla.stream.array.ArrayOperations.getAverage;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class ArrayOperationsTestSuite {

    @Test
    void testGetAverage() {
        //Given
        int[] numbers = {1,3,4,5,6,2,2,3,1,4,5,3,2,1,3,4,2,1,3,4};

        //When
        double average = getAverage(numbers);
        //Then
        assertEquals(2.95, average);
    }
}
