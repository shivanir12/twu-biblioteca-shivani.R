package com.twu.biblioteca;

import org.junit.Test;
import java.util.ArrayList;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;


public class LibraryTest {

    @Test
    public void showTheHeader() {
        InputOutput view = mock(InputOutput.class);
        ArrayList<Book> bookList = new ArrayList<>();
        Library library = new Library(view, bookList);
        library.displayHeader();
        String headerOfBookList = String.format("%-20s%-20s%-20s","Name Of Book", "Author", "Year Published");
        verify(view).show(headerOfBookList);
        verify(view).show("=========================================================================================");
    }

    @Test
    public void showListOfBooks() {
        InputOutput view = mock(InputOutput.class);
        Book book1 = new Book("Head First Java", "sierra", "1950");
        Book book2 = new Book("WWW", "robert", "1950");
        ArrayList<Book> availableBookList = new ArrayList<>();
        availableBookList.add(book1);
        availableBookList.add(book2);
        Library library = new Library(view, availableBookList);

        library.displayListOf();

        verify(view).show("Head First Java     sierra              1950");
        verify(view).show("WWW                 robert              1950");
    }

    /*@Test
    public void checkoutTheBook() {
        InputOutput view = mock(InputOutput.class);
        Book book1 = new Book("Head First Java", "sierra", "1950");
        Book book2 = new Book("WWW", "sierra", "1945");
        ArrayList<Book> bookList = new ArrayList<>();
        bookList.add(book1);
        bookList.add(book2);
        Library library = new Library(view, bookList);
        library.checkoutBook("Head First Java");

        assertEquals(true,library.checkoutBook("Head First Java"));
    }

    @Test
    public void checkoutTheBookWhenBookIsNotAvailable() {
        InputOutput view = mock(InputOutput.class);
        Book book1 = new Book("Head First Java", "sierra", "1950");
        ArrayList<Book> bookList = new ArrayList<>();
        bookList.add(book1);
        Library library = new Library(view, bookList);
        assertEquals(false, library.checkoutBook("Java"));
    }

   /* @Test
    public void returnBookToTheLibraryIsSuccessful() {
        InputOutput view = mock(InputOutput.class);
        Book book1 = new Book("Head First Java", "sierra", "1950");
        ArrayList<Book> checkOutList = new ArrayList<>();
        checkOutList.add(book1);
        Library library = new Library(view, checkOutList);
        assertEquals(true, library.checkInBook("Head First Java"));
    }

    @Test
    public void returnBookToTheLibraryIsUnsuccessful() {
        InputOutput view = mock(InputOutput.class);
        Book book1 = new Book("Head First Java", "sierra", "1950");
        ArrayList<Book> bookList = new ArrayList<>();
        bookList.add(book1);
        Library library = new Library(view, bookList);
        assertEquals(false, library.checkInBook("java"));
    }*/
}
