package com.company.service;

import com.company.Library;
import com.company.manager.BookManager;
import com.company.DisplayBook;
import com.company.UserActions;

public class BookService {
    BookManager bookManager = new BookManager();




    public void run() {
        boolean rightAnswer = false;
        String choice;


        DisplayBook.drawLine();
        System.out.println("Welcome to the library manager app !");
        DisplayBook.drawLine();
        do{
        do {
            System.out.println("What do you want to do ?");
            System.out.println(UserActions.EXIT.getValue() + " - " + UserActions.EXIT.getDesc());
            System.out.println(UserActions.CREATE_LIBRARY.getValue() + " - " + UserActions.CREATE_LIBRARY.getDesc());
            System.out.println(UserActions.DELETE_LIBRARY.getValue() + " - " + UserActions.DELETE_LIBRARY.getDesc());
            System.out.println(UserActions.ADD_BOOK.getValue() + " - " + UserActions.ADD_BOOK.getDesc());
            System.out.println(UserActions.REMOVE_BOOK.getValue() + " - " + UserActions.REMOVE_BOOK.getDesc());
            System.out.println(UserActions.LIST_BOOK.getValue() + " - " + UserActions.LIST_BOOK.getDesc());
            System.out.println(UserActions.LIST_LIBRARIES.getValue() + " - " + UserActions.LIST_LIBRARIES.getDesc());

            choice = UserActions.userInput();
            if (UserActions.containsAction(choice)) {
                rightAnswer = true;

            }
        } while (!rightAnswer);
        if (choice.equalsIgnoreCase(UserActions.ADD_BOOK.getValue())) {
            addBook();

        }
        if (choice.equalsIgnoreCase(UserActions.LIST_BOOK.getValue())){
            listBooks();

        }
        if (choice.equalsIgnoreCase(UserActions.CREATE_LIBRARY.getValue())){


        }
        if(choice.equalsIgnoreCase(UserActions.LIST_LIBRARIES.getValue())){

        }}
        while(!choice.equals("0"));

    }

        public void addBook() {
            DisplayBook.drawLine();
            System.out.println("ADD BOOK");
            DisplayBook.drawLine();
            bookManager.addBook();
        }

        public void listBooks(){
            bookManager.listBooks();
            System.out.println("Book successfully added !");
        }
    }




