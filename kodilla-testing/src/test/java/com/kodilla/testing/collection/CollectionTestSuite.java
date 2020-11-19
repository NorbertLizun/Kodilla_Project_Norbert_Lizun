package com.kodilla.testing.collection;

import org.junit.jupiter.api.*;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@DisplayName("Collection  Test Suite")
public class CollectionTestSuite {
    @BeforeEach
    public void before() {
        System.out.println("Test Case: begin");
    }

    @AfterEach
    public void after() {
        System.out.println("Test Case: end");
    }

    @DisplayName(
            "When created expectedResult without values, " +
            "then getEvenList should return empty list"
                )
    @Test
    void testOddNumbersExterminatorEmptyList() {
        //Given
        List<Integer> testList = new ArrayList<>();
        OddNumbersExterminator oddNumbersExterminator = new OddNumbersExterminator(testList);
        List<Integer> addList = Arrays.asList();
        List<Integer> expectedResult = oddNumbersExterminator.exterminate(addList);
        //When
        List<Integer> result = oddNumbersExterminator.getEvenList();
        //Then
        Assertions.assertEquals(expectedResult, result);
    }

    @DisplayName(
            "When created expectedResult with values, " +
                    "then getEvenList should return list with even values"
    )
    @Test
    void testOddNumbersExterminatorNormalList() {
        //Given
        List<Integer> testList = new ArrayList<>();
        OddNumbersExterminator oddNumbersExterminator = new OddNumbersExterminator(testList);
        List<Integer> addList =  Arrays.asList(1,2,3,4,5,6,7,8,9,10,11);
        List<Integer> expectedResult = oddNumbersExterminator.exterminate(addList);
        //When
        List<Integer> result =  oddNumbersExterminator.getEvenList();
        //Then
        Assertions.assertEquals(expectedResult, result);
        //assertIterableEquals
        
    }
}
