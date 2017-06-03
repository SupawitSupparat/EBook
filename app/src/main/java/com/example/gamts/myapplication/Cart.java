package com.example.gamts.myapplication;
import java.util.ArrayList;

/**
 * Created by SONY VAIO on 27/4/2560.
 */

public class Cart {
    ArrayList<Book> books;
    double Price;
    ArrayList<String> cartList;

    public Cart() {
        books = new ArrayList<Book>();
        Price = 0;
        cartList = new ArrayList<String>();
    }

    public void addToCart(Book book) {
        books.add(book);
        Price+=book.getPrice();
    }

    public void clear() {
        this.Price = 0;
        cartList.clear();
        books.clear();
    }

    public ArrayList<Book> getBooks(){
        return books;
    }

    public ArrayList<String> getDummyCart(){
        return cartList;
    }

    public double getSumPrice() {
        return this.Price;
    }

    public void addDummyCart(String book){
        cartList.add(book);
    }
}
