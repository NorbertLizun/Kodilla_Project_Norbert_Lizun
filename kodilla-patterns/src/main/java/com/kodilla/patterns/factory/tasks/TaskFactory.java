package com.kodilla.patterns.factory.tasks;

public class TaskFactory {
    public static final String SHOPPING_TASK = "SHOPPING_TASK";
    public static final String PAINTING_TASK = "PAINTING_TASK";
    public static final String DRIVING_TASK = "DRIVING_TASK";

    public final Task executeTask(final String taskClass) {
        switch (taskClass) {
            case SHOPPING_TASK:
                return new ShoppingTask("Domowe", "Proszek do prania", 1);
            case PAINTING_TASK:
                return new PaintingTask("Obraz", "czarno-biały", "las");
            case DRIVING_TASK:
                return new DrivingTask("Pojechać po brata", "Jelenia Góra", "auto");
            default:
                return null;
        }
    }
}
