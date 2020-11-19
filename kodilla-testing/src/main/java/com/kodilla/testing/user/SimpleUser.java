package com.kodilla.testing.user;

public class SimpleUser {
    private String userName;
    private String realName;


    public SimpleUser(String userName) {
        this.userName = userName;
    }

    public SimpleUser(String userName, String realName) {
        this.userName = userName;
        this.realName = realName;
    }

    public String getRealName() {
        return realName;
    }

    public String getUserName() {
        return userName;
    }
}
