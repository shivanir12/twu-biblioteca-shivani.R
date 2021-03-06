package com.twu.biblioteca.libraryOperation;

import com.twu.biblioteca.model.Library;
import com.twu.biblioteca.model.User;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;


public class CheckInBookTest {
    @Test
    public void returnsTrueIfTheBookIsAvailableInTheCheckedOutBookList() {
        Library library = mock(Library.class);
        User user = mock(User.class);
        CheckInBook checkInBook = new CheckInBook(library, user);

        when(library.checkInBook("www", user)).thenReturn(true);

        assertEquals(true, checkInBook.execute("www"));
    }

    @Test
    public void returnsFalseIfTheBookIsNotAvailableInTheCheckedOutBookList() {
        Library library = mock(Library.class);
        User user = mock(User.class);
        CheckInBook checkInBook = new CheckInBook(library, user);

        when(library.checkInBook("www", user)).thenReturn(false);

        assertEquals(false, checkInBook.execute("www"));
    }
}
