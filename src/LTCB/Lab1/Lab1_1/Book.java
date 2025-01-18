package LTCB.Lab1.Lab1_1;

import java.util.ArrayList;
import java.util.List;

/*
Develop a program that assists bookstore employees.

For each book, the program should track the book’s
title, its price, its year of publication, and the author’s
name, …

Develop an appropriate class diagram (by hand) and
implement it with a class.

Create instances of the class to represent these
three books:

1. Daniel Defoe, Robinson Crusoe, $15.50, 1719;

2. Joseph Conrad, Heart of Darkness, $12.80, 1902;

3. Pat Conroy, Beach Music, $9.50, 1996.
 */
public class Book {
    public String title ;
    public Double price;
    public Integer publishYear;
    public String author ;

    public Book(String title, Double price, Integer publishYear, String author) {
        this.title = title;
        this.price = price;
        this.publishYear = publishYear;
        this.author = author;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public Integer getPublishYear() {
        return publishYear;
    }

    public void setPublishYear(Integer publishYear) {
        this.publishYear = publishYear;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }
    public String toString() {
        return "Title : "+this.title +
                ", Price : "+  this.price +
                "$ Publish Year : "+this.publishYear+ " Author : " + this.author;
    }

    public static void main(String[] args) {
        Book b1 = new Book("Robinson Crusoe",  15.50, 1719, "Daniel Defoe");
        Book b2 = new Book("Heart of Darkness" ,12.80 , 1902 , "Joseph Conrad"  );
        Book b3 = new Book("Beach Music",9.50 , 1996 ,"Pat Conroy" );
        // Print with ArrayList & stream API
        List<Book> list = new ArrayList<Book>();
        list.add(b1);
        list.add(b2);
        list.add(b3);
        list.forEach(System.out::println);
    }
}
