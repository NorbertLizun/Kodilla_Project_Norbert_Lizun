package com.kodilla.testing.forum.statistics;

import com.kodilla.testing.library.Book;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.*;

import static java.util.Arrays.asList;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;
import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)
public class StatisticsForumTestSuite {

    @Mock
    private Statistics statisticsMock;

    /*
    gdy liczba postów = 0,
    gdy liczba postów = 1000,
    gdy liczba komentarzy = 0,
    gdy liczba komentarzy < liczba postów,
    gdy liczba komentarzy > liczba postów,
    gdy liczba użytkowników = 0,
    gdy liczba użytkowników = 100.
     */

    @Test
    void calulateForumStatsWhenPostsCountIs0() {
        //Given
        ForumStatistics statistic = new ForumStatistics();
        when(statisticsMock.usersNames()).thenReturn(asList("abc", "bbb"));
        when(statisticsMock.postsCount()).thenReturn(0);
        when(statisticsMock.commentsCount()).thenReturn(100);
        //When
        statistic.calculateAdvStatistics(statisticsMock);

        //Then
        assertEquals(0, statistic.getPostsQuantity());
        assertEquals(100, statistic.getCommentsQuantity());
        assertEquals(2, statistic.getUsersQuantity());
        assertEquals(0, statistic.getPostsAverageNumberPerUser());
        assertEquals(50, statistic.getCommentsAverageNumberPerUser());
        assertEquals(0, statistic.getCommentsAverageNumberPerPost());
    }

}
