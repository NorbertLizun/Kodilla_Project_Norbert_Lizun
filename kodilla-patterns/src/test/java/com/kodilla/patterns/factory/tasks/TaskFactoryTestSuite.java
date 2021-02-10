package com.kodilla.patterns.factory.tasks;


import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class TaskFactoryTestSuite {


    @Test
    void testFactoryDrivingTask() {
        //Given
        TaskFactory factory = new TaskFactory();

        //When
        Task drivingTask = factory.executeTask(TaskFactory.DRIVING_TASK);

        //Then
        assertEquals("Pojechać po brata", drivingTask.getTaskName());
        assertTrue(drivingTask.isTaskExecuted(drivingTask.getTaskName()));

    }

    @Test
    void testFactoryPaintingTask() {
        //Given
        TaskFactory factory = new TaskFactory();

        //When
        Task paintingTask = factory.executeTask(TaskFactory.PAINTING_TASK);

        //Then
        assertEquals("Obraz", paintingTask.getTaskName());
        assertTrue(paintingTask.isTaskExecuted(paintingTask.getTaskName()));

    }

    @Test
    void testFactoryShoppingTask() {
        //Given
        TaskFactory factory = new TaskFactory();

        //When
        Task shoppingTask = factory.executeTask(TaskFactory.SHOPPING_TASK);

        //Then
        assertEquals("Domowe", shoppingTask.getTaskName());
        assertTrue(shoppingTask.isTaskExecuted(shoppingTask.getTaskName()));

    }

}
