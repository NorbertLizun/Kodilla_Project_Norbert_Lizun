package com.kodilla.testing.shape;

import org.junit.jupiter.api.*;
import java.util.List;

@DisplayName("Shape Collector Test Suite")
public class ShapeCollectorTestSuite {

    @BeforeEach
    public void before() {
        System.out.println("Test Case: begin");
    }

    @AfterEach
    public void after() {
        System.out.println("Test Case: end");
    }


    @Nested
    class TestShapeCollector {

        @Test
        @DisplayName( "When added new object to expectedResult, " +
                "then getShapeList should return list with this object")
        void testAddObjectToTheList() {
            //Given
            Shape rec = new Rectangle("Rectangle", 20, 15);
            ShapeCollector collector = new ShapeCollector();
            List <Shape> expectedResult = collector.addFigure(rec);
            //When
            List<Shape> result = collector.getShapeList();
            //Then
            Assertions.assertEquals(expectedResult, result);
        }

        @Test
        @DisplayName("When deleted object in expectedResult, " +
                "then getShapeList should return list without this object")
        void testRemoveObjectFromTheList() {
            //Given
            Shape tri = new Triangle(20, 15, "Triangle");
            ShapeCollector collector = new ShapeCollector();
            collector.addFigure(tri);
            List <Shape> expectedResult = collector.removeFigure(tri);
            //When
            List<Shape> result = collector.getShapeList();
            //Then
            Assertions.assertEquals(expectedResult, result);
        }

        @Test
        @DisplayName( "When selected object in expectedResult, " +
                "then getShapeList should return this object")
        void testGetObjectFromTheList() {
            //Given
            Shape tri = new Triangle(20, 15, "Triangle");
            ShapeCollector collector = new ShapeCollector();
            collector.addFigure(tri);
            Shape expectedResult = collector.getFigure(0);
            //When
            Shape result = collector.getShapeList().get(0);
            //Then
            Assertions.assertEquals(expectedResult, result);
        }

        @Test
        @DisplayName("When created expectedResult with object names " +
                "then getShapeList should return the same values")
        void testReturnObjectNamesFromTheList() {
            //Given
            Shape tri = new Triangle(20, 15, "Triangle");
            Shape rec = new Rectangle("Rectangle", 20, 15);
            ShapeCollector collector = new ShapeCollector();
            collector.addFigure(tri);
            collector.addFigure(rec);
            String expectedResult = collector.showFigures();
            //When
            String result = collector.getShapeList().toString();
            //Then
            Assertions.assertEquals(expectedResult, result);
        }


    }

}
