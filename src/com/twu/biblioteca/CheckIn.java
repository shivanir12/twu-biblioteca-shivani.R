package com.twu.biblioteca;

public class CheckIn implements LibraryOperation {
    private Library library;
    private User user;

    public CheckIn(Library library, User user){

        this.library = library;
        this.user = user;
    }

    @Override
    public boolean execute(String bookName) {
        return library.checkInBook(bookName,user);
    }

}
