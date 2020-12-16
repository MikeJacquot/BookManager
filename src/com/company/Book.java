package com.company;

import java.util.ArrayList;
import java.util.Objects;

public class Book {
    private int id;
    private String title;
    private String description;
    private String author;

    public Book(int id) {
        this.id = id;
    }

    public Book() {

    }

    public Book(int id, String title, String author ,String description) {
        this.id = id;
        this.title = title;
        this.description = description;
        this.author = author;
    }

    public int getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public String getDescription() {
        return description;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Book book = (Book) o;
        return id == book.id;
    }


    @Override
    public String toString(){
        return  id +" - title : "+title+" author : "+author;
    }
    }

