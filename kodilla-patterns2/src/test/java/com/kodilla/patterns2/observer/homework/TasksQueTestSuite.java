package com.kodilla.patterns2.observer.homework;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
public class TasksQueTestSuite {


    @Test
    public void test() {

        //Given
        Student s1 = new Student("student");
        Student s2 = new Student("student2");

        Task t1 = new Task("T1");
        Task t2 = new Task("T2");
        Task t3 = new Task("T3");

        TasksQue que1 = s1.getTasksQue();
        TasksQue que2 = s2.getTasksQue();

        Mentor mentor = new Mentor("mentor");
        Mentor mentor2 = new Mentor("mentor2");


        que1.registerObserver(mentor);
        que2.registerObserver(mentor2);

        //When
        que1.addTask(t1);
        que2.addTask(t2);
        que2.addTask(t3);

        //Then
        assertEquals(1, mentor.getNewTasksCount());
        assertEquals(2, mentor2.getNewTasksCount());



    }
}

