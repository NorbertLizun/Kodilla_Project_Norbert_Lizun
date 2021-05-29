package com.kodilla.patterns2.observer.homework;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.List;

public class TasksQue implements Observable {

    private final Deque<Task> tasks;
    private final List<Observer> observerList;
    private final Student student;

    public TasksQue(Student student) {
        this.student = student;
        tasks = new ArrayDeque<>();
        observerList = new ArrayList<>();
    }

    public void addTask(Task task) {
        tasks.offerLast(task);
        notifyObservers();

    }

    @Override
    public void registerObserver(Observer observer) {
        observerList.add(observer);
    }

    @Override
    public void notifyObservers() {
        for (Observer observer : observerList) {
            observer.update(this);
        }
    }

    @Override
    public void removeObserver(Observer observer) {
        observerList.remove(observer);
    }

    public Deque<Task> getTasks() {
        return tasks;
    }

    public List<Observer> getObserverList() {
        return observerList;
    }

    public Student getStudent() {
        return student;
    }
}
