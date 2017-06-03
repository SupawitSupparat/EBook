package com.example.gamts.myapplication;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by SONY VAIO on 27/4/2560.
 */

public class MockupBook extends Repository {
    private List<Book> books;
    private static MockupBook instance = null;


    public static MockupBook getInstance() {
        if (instance == null) {
            instance = new MockupBook();
        }
        return instance;
    }

    private MockupBook() {
        books = new ArrayList<Book>();
        books.add(new Book( "Hello World",1, 20.25, 2017,""));
        books.add(new Book( "The Adventure",2, 11.15, 2011,""));
        books.add(new Book( "Game",3, 30.65, 2014,""));
        books.add(new Book( "The lazy gamer",4, 14.10, 2002,""));
        books.add(new Book( "Last day",5, 14.10, 2001,""));
    }

    @Override
    public List<Book> getBooks(String bookName) {
        return books;
    }

    @Override
    public List<Book> getAllBooks() {
        return books;
    }
}