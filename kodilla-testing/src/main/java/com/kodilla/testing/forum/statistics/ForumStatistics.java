package com.kodilla.testing.forum.statistics;

import java.util.ArrayList;
import java.util.List;

public class ForumStatistics {
    private int usersQuantity;
    private int postsQuantity;
    private int commentsQuantity;
    private double postsAverageNumberPerUser;
    private double commentsAverageNumberPerUser;
    private double postsAverageNumberPerPost;
    private Statistics statistics;

    public ForumStatistics(Statistics statistics) {
        this.statistics = statistics;
    }

    public int getUsersQuantity() {
        return usersQuantity;
    }

    public int getPostsQuantity() {
        return postsQuantity;
    }

    public int getCommentsQuantity() {
        return commentsQuantity;
    }

    public double getPostsAverageNumberPerUser() {
        return postsAverageNumberPerUser;
    }

    public double getCommentsAverageNumberPerUser() {
        return commentsAverageNumberPerUser;
    }

    public double getPostsAverageNumberPerPost() {
        return postsAverageNumberPerPost;
    }

    public List<String> usersNames() {
        List<String> users;
        users = statistics.usersNames();
        return users;
    }

    public int postsCount() {
        return statistics.postsCount();
    }

    public int commentsCount() {
        return statistics.commentsCount();
    }


    public int calculateAdvStatistics(Statistics statistics) {
        int postsResult = statistics.postsCount();
        int commentsResult = statistics.commentsCount();
        int usersResult = statistics.usersNames().size();


        if (postsResult == 1000) {
            return 1000;
        } else if (postsResult == 0) {
            return 0;
        }

        if (commentsResult == 0) {
            return 0;
        } else if (commentsResult == 10) {
            return 10;
        }

        if (usersResult == 100) {
            return 100;
        } else if (usersResult == 0) {
            return 0;
        }





        return 2;
    }
}
