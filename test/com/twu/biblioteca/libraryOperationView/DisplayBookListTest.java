package com.twu.biblioteca.libraryOperationView;

import com.twu.biblioteca.io.InputOutput;
import com.twu.biblioteca.model.Library;
import org.junit.Test;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;


public class DisplayBookListTest {
    @Test
    public void displaysTheListOfAvailableBooks() {
        Library library = mock(Library.class);
        InputOutput inputOutput = mock(InputOutput.class);
        DisplayBookList displayBookList = new DisplayBookList(library,inputOutput);

        when(library.getBookListFromLibrary()).thenReturn("Head First Java     sierra              1950\n");

        displayBookList.display();
        verify(inputOutput).show("Head First Java     sierra              1950\n");
    }
}
