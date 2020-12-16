package com.company;

import com.company.exomembers.Member;
import com.company.service.BookService;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        BookService bookService = new BookService();
        bookService.run();
////        testbook();
//        Member member = new Member();
//        member.fillMembersList();

    }

//    public static void testbook() {
//
//        Book book1 = new Book(1, "Toto à la plage", "toto se fait bronzer");
//        Book book2 = new Book(2, "Toto à la montagne", "toto fait du ski");
//        Book book3 = new Book(3, "Toto a la dalle", "toto se fait un sandwich");
//        Book book4 = new Book(4, "Toto rencontre Martine", "pas mal le crossover non ?");
//        Book bookToDelete = new Book(4);
//
//        ArrayList<Book> books = new ArrayList<>();
//        books.add(book1);
//        books.add(book2);
//        books.add(book3);
//        books.add(book4);
//    if(book1.equals(book2)){
//        System.out.println("c'est les mêmes");
//    }
//    else{
//        System.out.println("ils sont differents !");
//    }
//        for(Book b : books){
//            System.out.println(b.toString());
//        }
//        if (books.contains(bookToDelete)) {
//            books.remove(bookToDelete);
//            System.out.println("book removed !");
//            for(Book b : books){
//                System.out.println(b.toString());
//            }
//
//        }
//    }
}
