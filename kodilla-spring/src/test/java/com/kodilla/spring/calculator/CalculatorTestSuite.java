package com.kodilla.spring.calculator;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class CalculatorTestSuite {

    @Autowired
    Calculator calculator;

    @Test
    void testCalculations() {
        //Given
        //When
        calculator.add(2,2);
        calculator.sub(5, 4);
        calculator.mul(2,2);
        calculator.div(8,2);
        //Then
    }
}
