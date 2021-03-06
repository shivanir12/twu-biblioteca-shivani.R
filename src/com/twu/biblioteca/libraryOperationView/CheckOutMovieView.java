package com.twu.biblioteca.libraryOperationView;

import com.twu.biblioteca.io.InputOutput;


public class CheckOutMovieView implements LibraryOperationView {
    private boolean result;
    private final InputOutput inputOutput;

    public CheckOutMovieView(boolean result, InputOutput inputOutput) {
        this.result = result;

        this.inputOutput = inputOutput;
    }

    @Override
    public void display() {
        if (result)
            inputOutput.show("Thank you!! Enjoy the movie");
        else
            inputOutput.show("That movie is not available");
    }

}
