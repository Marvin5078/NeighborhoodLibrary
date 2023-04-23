package org.yup;

import java.util.Scanner;

public class Xtra {

    public static void main2(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Press ENTER to be brought into the land of local literature");

        //user presses ENTER or they don't
        //now they're in the main menu

        System.out.println("Welcome to the Library!");
        System.out.println("");
        System.out.println("Press 1 to view available books");
        System.out.println("Press 2 to check-in a book");
        System.out.println("Press 3 to exit the application");

        int userSelection = scan.nextInt();
        String screen = "";

        switch(userSelection) {

            case 1:
                //show available books
                for (int i = 0; i < 5; i++) {
                    System.out.println("Here are all the available books: " + "" /*books array list with
                                                                             //isCheckedOut variable set to
                                                                            // false. */ );
                    //choose an available book and run the checkOut() method.

                    //context of this section. I am going to be using the getter for the
                    //'book' variable in way of the 'Book' class.
                    //will be getting the full info for a 'book'
                    //this includes: id, isbn, title, boolean false;
                    //they can be able to choose a book
                    // when they choose a book they choose a book run checkOut() method.
                }
                break;
            case 2:
                //check in books process
                //checkIn() {...} method application that tells user to identify the book using its id. Once checked in.
                System.out.println(/* book */"" + " has been checked in. Thank You!");
                break;
            case 3:
                //exits the application.
                //have to return user back to home screen.
            default:
                screen = "Invalid Selection";
        }
        System.out.println(screen);
    }


}
