package com.kodilla.testing.forum.statistics;

import com.kodilla.testing.library.Book;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.*;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)
public class StatisticsForumTestSuite {

    @Mock
    private Statistics statisticsMock;

    private List<Integer> numbersGenerator(int howMany) {
        List<Integer> resultList = new ArrayList<>();
        for (int n = 1; n <= howMany; n++) {
            resultList.add(n);
        }
        return resultList;
    }

    private List<String> usersGenerator(int howMany) {
        List<String> resultList = new ArrayList<>();
        for (int n = 1; n <= howMany; n++) {
            resultList.add("x" + n);
        }
        return resultList;
    }


    @Test
    void test1() {
        //Given
        ForumStatistics statistics = new ForumStatistics(statisticsMock);
        List<Integer> numberOfPostsList = numbersGenerator(0);
        //when(statisticsMock.postsCount()).thenReturn(numberOfPostsList.size());
        //When
        int result = statistics.calculateAdvStatistics(statisticsMock);
        //Then
        assertEquals(0, result);
    }
    @Test
    void test2() {
        //Given
        ForumStatistics statistics = new ForumStatistics(statisticsMock);
        List<Integer> numberOfPostsList = numbersGenerator(1000);
        when(statisticsMock.postsCount()).thenReturn(numberOfPostsList.size());
        //When
        int result = statistics.calculateAdvStatistics(statisticsMock);
        //Then
        assertEquals(1000, result);

    }
    @Test
    void test3() {
        //Given
        ForumStatistics statistics = new ForumStatistics(statisticsMock);
        List<Integer> ab = numbersGenerator(0);
        when(statisticsMock.commentsCount()).thenReturn(ab.size());
        //When
        int result = statistics.calculateAdvStatistics(statisticsMock);
        //Then
        assertEquals(0, result);
    }
//    @Test
//    void test4() {
//        //Given
//        //When
//        //Then
//    }
//    @Test
//    void test5() {
//        //Given
//        //When
//        //Then
//    }
    @Test
    void test6() {
        //Given
        ForumStatistics statistics = new ForumStatistics(statisticsMock);
        List<String> listOfUser = new ArrayList<>();
        when(statisticsMock.usersNames()).thenReturn(listOfUser);
        //When
        int result = statistics.calculateAdvStatistics(statisticsMock);
        //Then
        assertEquals(0, result);
    }
    @Test
    void test7() {
        //Given
        ForumStatistics statistics = new ForumStatistics(statisticsMock);
        List<String> listOf100User = usersGenerator(100);
        when(statisticsMock.usersNames()).thenReturn(listOf100User);
        //When
        int result = statistics.usersNames().size();
        //Then
        assertEquals(100, result);

    }
}
