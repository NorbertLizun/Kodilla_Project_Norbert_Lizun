package com.kodilla.patterns2.observer.homework;

public class Mentor implements Observer{

    private final String name;
    private int newTasksCount;

    public Mentor(String name) {
        this.name = name;

    }

    @Override
    public void update(TasksQue tasksQue) {
        System.out.println(name + ": New task to check " + tasksQue.getTasks() + "\n" +
                " (total: " + tasksQue.getTasks().size() + " messages)");

        newTasksCount++;
    }

    public String getName() {
        return name;
    }

    public int getNewTasksCount() {
        return newTasksCount;
    }
}
