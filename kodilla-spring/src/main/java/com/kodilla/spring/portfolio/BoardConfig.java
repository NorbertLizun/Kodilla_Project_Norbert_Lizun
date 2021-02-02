package com.kodilla.spring.portfolio;


import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.ArrayList;



@Configuration
public class BoardConfig {



    @Bean
    public Board getBoard() {
        return new Board(getToDoList(),getInProgress(),getDoneList());
    }

    @Bean
    public TaskList getToDoList() {
        return new TaskList(new ArrayList<>());
    }

    @Bean
    public TaskList getInProgress() {
        return new TaskList(new ArrayList<>());
    }

    @Bean
    public TaskList getDoneList() {
        return new TaskList(new ArrayList<>());
    }





}
