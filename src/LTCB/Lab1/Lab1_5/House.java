package LTCB.Lab1.Lab1_5;

import java.util.Arrays;
import java.util.List;

/*
Develop a "real estate assistant'' program.
The "assistant'' helps the real estate agent locate
houses of interest for clients. The information about a
house includes its kind, the number of rooms, the
asking price, and its address. An address consists of a
house number, a street name, and a city.

Represent the following examples using your classes:

Ranch, 7 rooms, $375,000, 23 Maple Street, Brookline

Colonial, 9 rooms, $450,000, 5 Joye Road, Newton

Cape, 6 rooms, $235,000, 83 Winslow Road, Waltham
 */
public class House {
    private String kind ;
    private int numberOfRooms;
    private double price ;
    private String address;
    private String city;

    public House(String kind, int numberOfRooms, double price, String address, String city) {
        this.kind = kind;
        this.numberOfRooms = numberOfRooms;
        this.price = price;
        this.address = address;
        this.city = city;
    }

    @Override
    public String toString() {
        return "House{" +
                "kind='" + kind + '\'' +
                ", numberOfRooms=" + numberOfRooms +
                ", price= $" + price +
                ", address='" + address + '\'' +
                ", city='" + city + '\'' +
                '}';
    }

    public static void main(String[] args) {
        House h1 = new House("Ranch", 7 , 375.000, "23 Maple Street", "Brookline");
        House h2 = new House("Colonial,", 9 , 450.000, "5 Joye Road     ", "Newton");
        House h3 = new House("Cape ", 6 , 235.000, "83 Winslow Road", "Waltham");
        List<House> houses = Arrays.asList(h1, h2, h3);
        houses.forEach(System.out::println);
    }
}
