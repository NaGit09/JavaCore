package LTCB.Lab1.Lab1_6;

import java.util.GregorianCalendar;

public class BookStore {
    private String title ;
    private double price ;
    private int yearOfPublication ;
    private Author author ;

    public BookStore(String title, double price, int yearOfPublication, Author author) {
        this.title = title;
        this.price = price;
        this.yearOfPublication = yearOfPublication;
        this.author = author;
    }

    @Override
    public String toString() {
        return "BookStore{" +
                "title='" + title + '\'' +
                ", price=" + price +
                ", yearOfPublication=" + yearOfPublication +
                ", author=" + author +
                '}';
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getYearOfPublication() {
        return yearOfPublication;
    }

    public void setYearOfPublication(int yearOfPublication) {
        this.yearOfPublication = yearOfPublication;
    }

    public Author getAuthor() {
        return author;
    }

    public void setAuthor(Author author) {
        this.author = author;
    }

    public static void main(String[] args) {
        BookStore b1 = new BookStore("Robinson Crusoe",  15.50, 1719, new Author("Daniel Defoe" , new GregorianCalendar(1990 , 6,7)));
        BookStore b2 = new BookStore("Heart of Darkness" ,12.80 , 1902 , new Author("Joseph Conrad" , new GregorianCalendar(1991,5,7))  );
        BookStore b3 = new BookStore("Beach Music",9.50 , 1996 ,new Author("Pat Conroy" , new GregorianCalendar(1992,5,7)) );
        System.out.println(b1);
    }
}
