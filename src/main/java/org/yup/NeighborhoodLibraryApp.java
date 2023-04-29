package org.yup;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Scanner;

public class NeighborhoodLibraryApp {

    public static ArrayList<Book> getBooks() {

        ArrayList<Book> bookList = new ArrayList<>();

        bookList.add(new Book(1, "978-01-294-2", "The Holy Bible"));
        bookList.add(new Book(2, "21-212-1221-2", "HERE"));
        bookList.add(new Book(3, "234-43-243-3", "THERE"));
        bookList.add(new Book(4, "56-765-89-0", "EVRYWHERE"));
        bookList.add(new Book(5, "00-111-01-101-1", "At Once"));

        return bookList;
    }

    public static void getMyAvailableInfo() {

        String answer = null;
        ArrayList<Book> availableBooks = getBooks();

        System.out.println("Below are the books we carry: ");

        for (int i = 0; i < availableBooks.size(); i++) {
            Book book = availableBooks.get(i);

            if (!book.isCheckedOut()) {

                answer = String.format("id: %d  Title: %s - ISBN: %s\n",
                        book.getId(), book.getTitle(), book.getIsbn());

                System.out.println(answer);
            }
        }
    }

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        ArrayList<Book> availableBooks = getBooks();

        System.out.println("Press ENTER to be brought into the land of local literature");

        //user presses ENTER or they don't
        //now they're in the main menu

        String enter = scan.nextLine().toLowerCase();

        System.out.println("Welcome to the Library!");
        System.out.println("");
        System.out.println("Press 1 to view available books");
        System.out.println("Press 2 to check-in a book");
        System.out.println("Press 3 to exit the application");

        int userSelection = scan.nextInt();
        String screen = "";

        switch (userSelection) {

            case 1:
                //availableBooks - method to show books
                getMyAvailableInfo();

                System.out.println("Enter the id of the book you wish to checkout");
                int id = scan.nextInt();

                if(id == availableBooks.get(id).getId()) {

                    

                }





                    break;

                    case 2:
//                checkInBooks() {...}
                        System.out.println("Enter the id of the book you'd like to check in.");

                        int bookBack = scan.nextInt();

                        for (Book myBook : availableBooks) {

                            if (bookBack == myBook.getId()) {
                                myBook.checkInABook();
                                System.out.println("Thank you your book" + myBook.getTitle() + " has been checked in");
                            }
                        }
                        break;
                    case 3:
                        //exitTheApplication() {...}
                    default:
                        screen = "Invalid Selection";
                }
        }
    }
//}
//
//     /* available books
//              for (int i = 0; i < bookList.size(); i++) {
//
//                        /*books array list with                                                                        //isCheckedOut variable set to
//                       // false.
//        //choose an available book and run the checkOut() method.
//
//        System.out.println("Here are all the available books: "
//                + bookList + "\n");
//
//        System.out.println("Enter the id of the book you would like to checkout.");
//
//        bookList.get(scan.nextInt()).checkOutABook(scan.nextLine()); //could be another
//
//        //context of this section. I am going to be using the getter for the
//        //'book' variable in way of the 'Book' class.
////                    bookList.get(scan.nextInt()).isCheckedOut(); //MAYBE
//        //will be getting the full info for a 'book'
//        //this includes: id, isbn, title, boolean false;
//        //they can be able to choose a book
//        // when they choose a book they choose a book run checkOut() method.
//        bookList.get(scan.nextInt()).checkOutABook(bookList.get(scan.nextInt()).getTitle()); //could be one
//    } */

    /* checkin books

                System.out.println("Enter the id of the book you wish to check in");

                bookList.get(scan.nextInt()).checkInABook();
    //checkIn() {...} method application that tells user to identify the book using its id. Once checked in.
                System.out.println(book "" + " has been checked in. Thank You!"); */




