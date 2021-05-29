package com.kodilla.patterns2.adapter.book;

import com.kodilla.patterns2.adapter.bookclasifier.MedianAdapter;
import com.kodilla.patterns2.adapter.bookclasifier.librarya.Book;
import org.junit.jupiter.api.Test;

import java.util.HashSet;
import java.util.Set;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MedianAdapterTestSuite {

    @Test
    public void testMedian() {
        //Given
        Book book1 = new Book("A1", "T1", 1996, "S1");
        Book book2 = new Book("A2", "T2", 1921, "S2");
        Book book3 = new Book("A3", "T3", 2020, "S3");
        Book book4 = new Book("A4", "T4", 1999, "S4");
        Book book5 = new Book("A5", "T5", 2010, "S5");
        Book book6 = new Book("A6", "T6", 2011, "S6");

        Set<Book> bookSet = new HashSet<>();
        bookSet.add(book1);
        bookSet.add(book2);
        bookSet.add(book3);
        bookSet.add(book4);
        bookSet.add(book5);
        bookSet.add(book6);

        //When
        MedianAdapter medianAdapter = new MedianAdapter();

        //Then
        assertEquals(2010, medianAdapter.publicationYearMedian(bookSet));
    }
}
