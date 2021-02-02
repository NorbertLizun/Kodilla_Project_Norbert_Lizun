package com.kodilla.spring.portfolio;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;


@SpringBootTest
public class BoardTestSuite {

    @Test
    void testTaskAdd() {
        //Given
        ApplicationContext context = new AnnotationConfigApplicationContext("com.kodilla.spring");
        Board board = context.getBean(Board.class);


        //When

            board.getToDoList().getTasks().add("Do zrobienia");
            board.getDoneList().getTasks().add("Zrobione");
            board.getInProgressList().getTasks().add("Progres");

        //Then
        System.out.println(board.getDoneList().getTasks());
        System.out.println(board.getInProgressList().getTasks());
        System.out.println(board.getToDoList().getTasks());


    }

}
