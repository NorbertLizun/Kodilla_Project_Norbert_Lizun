package com.kodilla.patterns.prototype.library;

import com.kodilla.patterns.prototype.Prototype;
import com.kodilla.patterns.prototype.TaskList;

import java.util.HashSet;
import java.util.Set;

public final class Library extends Prototype<Library> {

     private String name;
     private Set<Book> books = new HashSet<>();

    public Library(final String name) {
        this.name = name;
    }



    public void setName(String name) {
        this.name = name;
    }

    public void setBooks(Set<Book> books) {
        this.books = books;
    }

    public Library shallowCopy() throws CloneNotSupportedException {
        return this.clone();
    }

    public Library deepCopy() throws CloneNotSupportedException {
        Library clonedLibrary = this.clone();
        clonedLibrary.books = new HashSet<>();
        for (Book book : books) {
            clonedLibrary.getBooks().add(book);
        }

        return clonedLibrary;
    }

    public String getName() {
        return name;
    }

    public Set<Book> getBooks() {
        return books;
    }

    @Override
    public String toString() {
        String s = "Library [" + name + "]\n";
        for (Book book : books) {
            s = s + book.toString() + "\n";
        }
        return s;
    }
}
