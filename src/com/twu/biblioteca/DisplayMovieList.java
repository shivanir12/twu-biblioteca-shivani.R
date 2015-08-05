package com.twu.biblioteca;

import com.twu.biblioteca.View.InputOutput;
import com.twu.biblioteca.View.Iview;
import com.twu.biblioteca.View.UserMenuView;

public class DisplayMovieList implements Iview {

    private Library library;
    private InputOutput inputOutput;
    private UserMenuView userMenuView;

    public DisplayMovieList(Library library, InputOutput inputOutput, UserMenuView userMenuView) {

        this.library = library;
        this.inputOutput = inputOutput;
        this.userMenuView = userMenuView;
    }

    @Override
    public void show() {
        String list = library.getMovieListFromLibrary();
        inputOutput.show(list);
        userMenuView.showUserMenu();
    }

}
