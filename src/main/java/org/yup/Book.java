package org.yup;

import java.util.ArrayList;
import java.util.Scanner;

public class Book {

    //we named all the properties of what makes a book.
    private int id;
    private String isbn;
    private String title;
    private String checkedOutTo;
    private boolean isCheckedOut;

    public Book(int id, String isbn, String title, String checkedOutTo) {
        Scanner scan = new Scanner(System.in);

        this.id = id;
        this.isbn = isbn;
        this.title = title;
        this.checkedOutTo = checkedOutTo = scan.nextLine();
        this.isCheckedOut = false;
    }

    public void checkOutABook(String name) {
        checkedOutTo = name;
        isCheckedOut = true;
    }

    public void checkInABook() {
        checkedOutTo = "";
        isCheckedOut = false;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getCheckedOutTo() {
        return checkedOutTo;
    }

    public void setCheckedOutTo(String checkedOutTo) {
        this.checkedOutTo = checkedOutTo;
    }

    public boolean isCheckedOut() {
        return isCheckedOut;
    }

    public void setCheckedOut(boolean checkedOut) {
        isCheckedOut = checkedOut;
    }

}