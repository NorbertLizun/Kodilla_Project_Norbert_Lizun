package com.kodilla.spring.portfolio;


import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

import java.util.ArrayList;



@Configuration
public class BoardConfig {



    @Bean
    public Board getBoard() {
        return new Board(getList(),getList(),getList());
    }

    @Bean
    @Scope("prototype")
    public TaskList getList() {
        return new TaskList(new ArrayList<>());
    }







}
