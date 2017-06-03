package com.example.gamts.myapplication;

/**
 * Created by SONY VAIO on 27/4/2560.
 */

public class Book {
    private String Bookname;
    private double price;
    private int id;
    private int publicyear;
    private String imgUrl;

    public Book(String Bookname, int id , double price, int publicationYear, String img_url) {
        this.id = id;
        this.price = price;
        this.Bookname = Bookname;
        this.publicyear = publicationYear;
        this.imgUrl = img_url;
    }

    public String getTitle() {
        return Bookname;
    }

    public double getPrice() {
        return price;
    }

    public int getPublicationYear() {return publicyear;}

    public String getImageUrl() {
        return imgUrl;
    }

    public void setImageUrl(String imageUrl) {
        this.imgUrl = imgUrl;
    }

    public String toString() {
        return getTitle() + " " + getPublicationYear();
    }

    public void setTitle(String title){
        this.Bookname = title;
    }
}
