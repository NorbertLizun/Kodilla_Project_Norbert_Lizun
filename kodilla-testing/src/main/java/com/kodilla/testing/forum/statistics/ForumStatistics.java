package com.kodilla.testing.forum.statistics;

public class ForumStatistics {
    private int usersQuantity;
    private int postsQuantity;
    private int commentsQuantity;
    private double postsAverageNumberPerUser;
    private double commentsAverageNumberPerUser;
    private double commentsAverageNumberPerPost;

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

    public double getCommentsAverageNumberPerPost() {
        return commentsAverageNumberPerPost;
    }

    public void calculateAdvStatistics(Statistics statistics) {
        usersQuantity = statistics.usersNames().size();
        postsQuantity = statistics.postsCount();
        commentsQuantity = statistics.commentsCount();

        if(usersQuantity == 0) {
            postsAverageNumberPerUser = 0;
            commentsAverageNumberPerUser = 0;
        } else {
            postsAverageNumberPerUser = postsQuantity / (double)usersQuantity;
            commentsAverageNumberPerUser = commentsQuantity / (double)usersQuantity;
        }

        if(postsQuantity == 0) {
            commentsAverageNumberPerPost = 0;
        } else {
            commentsAverageNumberPerPost = commentsQuantity / (double)postsQuantity;
        }


    }
}
