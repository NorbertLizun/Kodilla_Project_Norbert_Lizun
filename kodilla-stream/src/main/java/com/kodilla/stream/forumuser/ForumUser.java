package com.kodilla.stream.forumuser;

import java.time.*;

public final class ForumUser {
    private final int userId;
    private final String userName;
    private final char sex;
    private final LocalDate dateOfBirth;
    private final int postedPosts;

    public ForumUser(final int userId,final String userName,final char sex,final int yearOfBirth,
                     final int monthOfBirth,final int dayOfBirth,final int postedPosts) {
        this.userId = userId;
        this.userName = userName;
        this.sex = sex;
        this.dateOfBirth = LocalDate.of(yearOfBirth, monthOfBirth, dayOfBirth);
        this.postedPosts = postedPosts;
    }

    public int getUserId() {
        return userId;
    }

    public String getUserName() {
        return userName;
    }

    public char getSex() {
        return sex;
    }

    public LocalDate getDateOfBirth() {
        return dateOfBirth;
    }

    public int ageControl() {
        LocalDate today = LocalDate.now();
        LocalDate dateOfBirth = getDateOfBirth();
        int age = Period.between(dateOfBirth, today).getYears();
        return age;
    }

    public int getPostedPosts() {
        return postedPosts;
    }

    @Override
    public String toString() {
        return "User{" +
                "user name='" + userName + '\'' +
                ", sex='" + sex + '\'' +
                ", date of birth=" + dateOfBirth +
                ", posted posts='" + postedPosts + '\'' +
                ", user ID='" + userId + '\'' +
                '}';
    }
}
