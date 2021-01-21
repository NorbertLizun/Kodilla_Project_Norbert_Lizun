package com.kodilla.good.patterns.challenges;

public class User {

    private String firstName;
    private String surName;

    public User(String firstName, String surName) {
        this.firstName = firstName;
        this.surName = surName;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getSurName() {
        return surName;
    }
}
