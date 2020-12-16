package com.company;

import java.io.Serializable;
import java.util.ArrayList;

public class Library implements Serializable {
    private String name;
    private ArrayList<Book> books = new ArrayList<Book>();

    public String getName() {
        return name;
    }

    public ArrayList<Book> getBooks() {
        return books;
    }
}
