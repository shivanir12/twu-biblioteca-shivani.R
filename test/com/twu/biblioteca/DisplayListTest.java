package com.twu.biblioteca;

import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

public class DisplayListTest {
    @Test
    public void returnsTheListOfBooks() {
        Book book1 = new Book("Head First Java", "sierra", "1950");
        ArrayList<Book> bookList = new ArrayList<>();
        bookList.add(book1);
        ArrayList<Book> checkoutBookList = new ArrayList<>();
        ArrayList<Movie> movieList = new ArrayList<>();
        ArrayList<Movie> checkOutMovieList = new ArrayList<>();
        Library library = new Library(bookList, checkoutBookList, movieList, checkOutMovieList);
        DisplayList displayList = new DisplayList();
        String list =displayList.display(library);
        assertEquals(list,"Head First Java     sierra              1950\n");
    }
}