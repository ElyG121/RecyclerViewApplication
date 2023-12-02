package com.example.recyclerviewapplication;

import java.util.ArrayList;

public class DataSource {

    public static ArrayList<Book> loadBooks(){
        ArrayList<Book> books = new ArrayList<Book>();

        books.add(new Book("The Chamber of Secrets", "J.K.Rowling"));
        books.add(new Book("The Lightning Thief", "Rick Riordan"));
        books.add(new Book("The Two Towers", "J.R.R.Tolkien"));
        books.add(new Book("I, Robot", "Isaac Asimov"));
        books.add(new Book("The Half-Blood Prince", "J.K.Rowling"));
        books.add(new Book("Words of Radiance", "Brandon Sanderson"));
        books.add(new Book("Nine Princes to Amber", "Roger Zilazny"));
        books.add(new Book("The Blade Itself", "Joe Abercrobie"));
        books.add(new Book("Ender's game", "Orson Scott Card"));
        books.add(new Book("A Brief History of Time", "Stephen Hawking"));

        return books;
    }
}
