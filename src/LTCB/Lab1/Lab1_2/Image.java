package LTCB.Lab1.Lab1_2;

import java.util.HashMap;
import java.util.Map;

/*
Add a constructor to the following partial class definition
and draw the class diagram

// represent computer images
class Image {
int height; // pixels
int width; // pixels
String source; // file name
String quality; // informal
}

Explain what the expressions mean in the problem
context and write test class:

new Image(5, 10, "small.gif", "low")

new Image(120, 200, "med.gif", "low")

new Image(1200, 1000, "large.gif", "high")
 */
public class Image {
    public int height ;
    public int width ;
    public String source ;
    public String quality ;

    public Image(int height, int width, String source, String quality) {
        this.height = height;
        this.width = width;
        this.source = source;
        this.quality = quality;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public String getSource() {
        return source;
    }

    public void setSource(String source) {
        this.source = source;
    }

    public String getQuality() {
        return quality;
    }

    public void setQuality(String quality) {
        this.quality = quality;
    }

    @Override
    public String toString() {
        return "Image{" +
                "height=" + height +
                ", width=" + width +
                ", source='" + source + '\'' +
                ", quality='" + quality + '\'' +
                '}';
    }

    public static void main(String[] args) {
        Image image1 = new Image(5, 10, "small.gif", "low");
        Image image2 = new Image(120, 200, "med.gif", "low");
        Image image3 = new Image(1200, 1000, "large.gif", "high");

        Map<Integer , Image> hashmap = new HashMap<Integer, Image>();
        hashmap.put(1, image1);
        hashmap.put(2, image2);
        hashmap.put(3, image3);
        hashmap.forEach(  (x,y) -> System.out.println( x + " " + y.toString()));
    }

}
