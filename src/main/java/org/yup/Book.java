package org.yup;

import java.util.ArrayList;
import java.util.Scanner;

import static org.yup.NeighborhoodLibraryApp.getBooks;

public class Book {

    //we named all the properties of what makes a book.
    private int id;
    private String isbn;
    private String title;
    private String checkedOutTo;
    private boolean isCheckedOut;

    public Book(int id, String isbn, String title) {

        this.id = id;
        this.isbn = isbn;
        this.title = title;
        this.isCheckedOut = false;
        this.checkedOutTo = checkedOutTo;
    }



    public void checkOutABook(String name) {
        this.setCheckedOutTo(name);
        this.setCheckedOut(true);
    }

    public void checkInABook() {
        this.setCheckedOutTo("");
        this.setCheckedOut(false);
    }

    public int getId() {
        return id;
    }

    public String getIsbn() {
        return isbn;
    }

    public String getTitle() {
        return title;
    }

    public String getCheckedOutTo() {
        return checkedOutTo;
    }

    public boolean isCheckedOut() {
        return isCheckedOut;
    }

    public void setCheckedOutTo(String checkedOutTo) {
        this.checkedOutTo = checkedOutTo;
    }

    public void setCheckedOut(boolean checkedOut) {
        isCheckedOut = checkedOut;
    }

//    public String showAvailableBooks() {
//
//        if (int i = 0; i <  )
//    }

}