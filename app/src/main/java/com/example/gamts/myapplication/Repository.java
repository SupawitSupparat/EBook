package com.example.gamts.myapplication;

import java.util.List;
import java.util.Observable;

/**
 * Created by Supawit on 6/2/2017.
 */

public abstract class Repository extends Observable {
    public abstract List<Book> getAllBooks();
    public abstract List<Book> getBooks(String bookName);
}