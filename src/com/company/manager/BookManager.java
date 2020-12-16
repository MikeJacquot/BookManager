package com.company.manager;


import com.company.Book;
import com.company.Library;
import com.company.UserActions;
import com.company.model.Borrow;

import java.io.*;

import java.util.ArrayList;
import java.util.Arrays;

public class BookManager implements Serializable {
    String currentpath = "\\JAVA_SE\\Library\\";
    Library l = new Library();
    ArrayList<Borrow> borrows;

    public ArrayList<Borrow> getBorrows() {
        checkInstance();
        return borrows;
    }

    public void setBorrows(ArrayList<Borrow> borrows) {
        this.borrows = borrows;
    }

    public Library getL() {
        return l;
    }

    public void addBook() {

        System.out.println("Choose Id :");
        int id = Integer.parseInt(UserActions.userInput());
        System.out.println("Enter title");
        String title = (UserActions.userInput());
        System.out.println("Enter author");
        String author = (UserActions.userInput());
        System.out.println("enter description");
        String desc = UserActions.userInput();

        Book book = new Book(id, title, author, desc,false);
        l.getBooks().add(book);
    }


    public void listBooks() {
        for (Book b : l.getBooks()) {
            if(!b.getIsBorrowed())
            System.out.println(b.toString());
            else
            System.out.println(b.toString()+" --->  [actually unavailable]");
        }

    }

    public void fillLibrary() {
        Book book1 = new Book(1, "toto fait du vélo", "toto", "Bah toto fait du vélo quoi",false);
        Book book2 = new Book(2, "martine a la plage", "inconnu", "tout est dans le titre",false);
        Book book3 = new Book(3, "la divine comedie", "Dante", "pas envie de spoiler",false);
        Book book4 = new Book(4, "le Java pour les nuls", "barry burd", "apprendre le java de la base",false);
        ArrayList<Book> books = new ArrayList<>(Arrays.asList(book1, book2, book3, book4));
        l.setBooks(books);
    }

    public void borrowBook(String choice) {

        Book choosenOne = l.getBooks().get(Integer.parseInt(choice) - 1);
        choosenOne.setBorrowed(true);

    }

    public void returnBook(String choice){
        Book choosenOne = l.getBooks().get(Integer.parseInt(choice) - 1);
        choosenOne.setBorrowed(false);


    }

    public void listBorrows(){
        int counter = 1;
        for(Borrow b : borrows){
            System.out.println(counter+" "+b.toString());
            counter++;
        }
    }

    public void checkInstance(){
        if(this.borrows == null){
            this.borrows = new ArrayList<Borrow>();
            return;
        }
    }







}






