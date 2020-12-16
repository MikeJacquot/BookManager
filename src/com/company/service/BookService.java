package com.company.service;

import com.company.Library;
import com.company.manager.BookManager;
import com.company.DisplayBook;
import com.company.UserActions;
import com.company.model.Borrow;

import java.time.LocalDateTime;
import java.util.ArrayList;

public class BookService {
    BookManager bookManager = new BookManager();
    Library l = new Library();
    ArrayList<Borrow> borrows;


    public void run() {
        boolean rightAnswer = false;
        String choice;


        DisplayBook.drawLine();
        System.out.println("Welcome to the library manager app !");
        DisplayBook.drawLine();
        do {
            do {
                System.out.println("What do you want to do ?");
                System.out.println(UserActions.EXIT.getValue() + " - " + UserActions.EXIT.getDesc());
                System.out.println(UserActions.ADD_BOOK.getValue() + " - " + UserActions.ADD_BOOK.getDesc());
                System.out.println(UserActions.REMOVE_BOOK.getValue() + " - " + UserActions.REMOVE_BOOK.getDesc());
                System.out.println(UserActions.BORROW_BOOK.getValue() + " - " + UserActions.BORROW_BOOK.getDesc());
                System.out.println(UserActions.RETURN_BOOK.getValue() + " - " + UserActions.RETURN_BOOK.getDesc());
                System.out.println(UserActions.LIST_BOOK.getValue() + " - " + UserActions.LIST_BOOK.getDesc());
                System.out.println(UserActions.LIST_LOANS.getValue() + " - " + UserActions.LIST_LOANS.getDesc());
                System.out.println(UserActions.FILL_LIBRARY.getValue() + " - " + UserActions.FILL_LIBRARY.getDesc());


                choice = UserActions.userInput();
                if (UserActions.containsAction(choice)) {
                    rightAnswer = true;

                }
            } while (!rightAnswer);
            if (choice.equalsIgnoreCase(UserActions.REMOVE_BOOK.getValue())) {
                removeBook();

            }
            if (choice.equalsIgnoreCase(UserActions.LIST_BOOK.getValue())) {
                listBooks();

            }
            if (choice.equalsIgnoreCase(UserActions.ADD_BOOK.getValue())) {
                addBook();
            }
            if (choice.equalsIgnoreCase(UserActions.RETURN_BOOK.getValue())) {
                returnBook();
            }
            if (choice.equalsIgnoreCase(UserActions.LIST_LOANS.getValue())) {
                listBorrows();


            }
            if (choice.equalsIgnoreCase(UserActions.BORROW_BOOK.getValue())) {
                borrowBook();

            }
            if (choice.equalsIgnoreCase(UserActions.FILL_LIBRARY.getValue())) {
                fillLibrary();



            }
        }
        while (!choice.equals("0"));

    }

    public void addBook() {
        DisplayBook.drawLine();
        System.out.println("ADD BOOK");
        DisplayBook.drawLine();
        bookManager.addBook();
        System.out.println("Book successfully added !");
    }

    public void listBooks() {
        DisplayBook.drawLine();
        System.out.println("LISTING BOOKS");
        DisplayBook.drawLine();
        bookManager.listBooks();

    }

    public void fillLibrary() {
        bookManager.fillLibrary();
        System.out.println("full of books !!");
    }

    public void borrowBook() {
        listBooks();
        String choice;
        if (bookManager.getL().getBooks().isEmpty()) {
            System.out.println("This library has no books ....");
            return;
        }


        do {
            System.out.println("which one would you like to borrow ?");
            choice = UserActions.userInput();


        } while ((Integer.parseInt(choice) < 0) && Integer.parseInt(choice) > l.getBooks().size());

        if (bookManager.getL().getBooks().get(Integer.parseInt(choice) - 1).getIsBorrowed()) {
            System.out.println("this book has already been borrowed !!");
            return;
        }


        System.out.println("Who is the borrower ?");
        String name = UserActions.userInput();
        bookManager.borrowBook(choice);
        Borrow newBorrow = new Borrow(LocalDateTime.now(),name);
        bookManager.getBorrows().add(newBorrow);

        System.out.println("enjoy !");
    }

    public void returnBook() {
        listBorrows();
        String choice;
        if(borrows!=null){


        do {
            System.out.println("which one would you like to return ?");
            choice = UserActions.userInput();

        } while ((Integer.parseInt(choice) < 0) && Integer.parseInt(choice) > borrows.size());
        bookManager.returnBook(choice);
        bookManager.getBorrows().get(Integer.parseInt(choice)-1).setReturnDate(LocalDateTime.now());
        }

    }




    public void listBorrows(){
        DisplayBook.drawLine();
        System.out.println("LISTING BORROWS");
        DisplayBook.drawLine();
        bookManager.listBorrows();
    }

    public void removeBook(){
        DisplayBook.drawLine();
        System.out.println("REMOVE BOOK");
        DisplayBook.drawLine();
        listBooks();
        System.out.println("Which one would you like to delete ?");
        String choice = UserActions.userInput();
        bookManager.removeBook(choice);

    }


}




