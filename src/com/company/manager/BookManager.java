package com.company.manager;


import com.company.Book;
import com.company.Library;
import com.company.UserActions;

import java.io.*;
import java.util.ArrayList;

public class BookManager implements Serializable {
    String currentpath = "\\JAVA_SE\\Library\\";
    Library l = new Library();


    public void addBook() {

        System.out.println("Choose Id :");
        int id = Integer.parseInt(UserActions.userInput());
        System.out.println("Enter title");
        String title = (UserActions.userInput());
        System.out.println("Enter author");
        String author = (UserActions.userInput());
        System.out.println("enter description");
        String desc = UserActions.userInput();

        Book book = new Book(id, title, author, desc);
        l.getBooks().add(book);
    }


    public void listBooks() {
        for (Book b : l.getBooks()) {
            System.out.println(b.toString());

        }
    }

    public void fillLibrary() {
        Book book1 = new Book(1,"toto fait du vélo","toto","Bah toto fait du vélo quoi");
        Book book2 = new Book(2,"martine a la plage","inconnu","tout est dans le titre");
        Book book3 = new Book(3,"la divine comedie","Dante","pas envie de spoiler");
        Book book4 = new Book(4,"le Java pour les nuls","barry burd","apprendre le java de la base");
        l.getBooks() =


    }

}






