package com.twu.biblioteca.libraryOperation;

import com.twu.biblioteca.model.Library;
import com.twu.biblioteca.model.User;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class CheckOutBookTest {
    @Test
    public void returnsTrueIfTheBookIsAvailableInTheAvailableBookList() {
        Library library = mock(Library.class);
        User user = mock(User.class);
        CheckOutBook checkOutBook = new CheckOutBook(library, user);

        when(library.checkoutBook("www", user)).thenReturn(true);

        assertEquals(true, checkOutBook.execute("www"));
    }

    @Test
    public void returnsFalseIfTheBookIsNotAvailableInTheAvailableBookList() {
        Library library = mock(Library.class);
        User user = mock(User.class);
        CheckOutBook checkOutBook = new CheckOutBook(library, user);

        when(library.checkoutBook("www", user)).thenReturn(false);

        assertEquals(false, checkOutBook.execute("ds"));
    }
}
