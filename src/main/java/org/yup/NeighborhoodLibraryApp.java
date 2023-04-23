package org.yup;

import java.util.ArrayList;

public class NeighborhoodLibraryApp {

    public static void main(String[] args) {

        ArrayList<Book> bookList = new ArrayList<>();

        Book theBible = new Book(1,"978-01-294-2","The Holy Bible","");
        Book here = new Book(2,"21-212-1221-2","HERE","");
        Book there = new Book(3,"234-43-243-3","THERE","");
        Book everywhere = new Book(4,"56-765-89-0","EVRYWHERE","");
        Book atOnce = new Book(5,"00-111-01-101-1","At Once","");

        bookList.add(theBible);
        bookList.add(here);
        bookList.add(there);
        bookList.add(everywhere);
        bookList.add(atOnce);



    }


    }
