package com.kodilla.patterns2.observer.homework;

public class Student {
    private String name;
    private TasksQue tasksQue;

    public Student(String name) {
        this.name = name;
        this.tasksQue = new TasksQue(this);
    }

    public void addTask(Task task) {
        tasksQue.addTask(task);
    }

    public String getName() {
        return name;
    }

    public TasksQue getTasksQue() {
        return tasksQue;
    }
}
