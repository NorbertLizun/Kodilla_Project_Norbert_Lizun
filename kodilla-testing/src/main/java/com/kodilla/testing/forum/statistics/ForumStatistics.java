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

    public int commentsCount() {
        return statistics.commentsCount();
    }

    public int postsCount() {
        return statistics.postsCount();
    }

    public int calculateAdvStatistics(Statistics statistics) {
        if (statistics.commentsCount() == 0)
        return 2;

        return 0;
    }
}
