package LTCB.Lab2.Lab2_3;

public class ImageExt implements Image {
    private int height;
    private int width;
    private String source;
    private String quality;

    public ImageExt(int height, int width, String source, String quality) {
        this.height = height;
        this.width = width;
        this.source = source;
        this.quality = quality;
    }

    /* sizeString produces one of three strings, depending on the number of pixels in the image:
    "small" for images with 10,000 pixels or fewer;
    "medium" for images with between 10,001 and 1,000,000pixels;
    "large" for images that are even larger than that.*/

    @Override
    public String sizeString() {
        if (this.size() < 100000) return "Small";
        if (10001 < this.size() || this.size() > 1000000) return "Medium";
        return "large";
    }
    /* isPortrait, which determines whether the image’s height is larger than its width;*/

    public boolean isPortrait() {
        return this.height > this.width;
    }
    /* size, which computes how many pixels the image contains; */

    @Override
    public boolean same(Image image) {
        if (image.getHeight() != this.height) return false;
        if (image.getWidth() != this.width) return false;
        if (!image.getSource().equals(this.source)) return false;
        if (!image.getQuality().equals(this.quality)) return false;
        return true;
    }

    /* size, which computes how many pixels the image contains; */
    public int size() {
        return this.height * this.width;
    }

    /* isLarger, which determines whether one image contains more pixels than some other image; */
    public boolean isLarger(Image image) {
        return this.size() > image.size();
    }

    @Override
    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    @Override
    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    @Override
    public String getSource() {
        return source;
    }

    public void setSource(String source) {
        this.source = source;
    }

    @Override
    public String getQuality() {
        return quality;
    }

    public void setQuality(String quality) {
        this.quality = quality;
    }

    public static void main(String[] args) {
        Image img1 = new ImageExt(500,500,"/src/lab1","Small");
        Image img2 = new ImageExt(800,2000,"/src/lab1","Large");
        Image img3 = new ImageExt(500,500,"/src/lab1","Small");
        System.out.println(img1.isPortrait());
        System.out.println(img1.same(img2));
        System.out.println(img1.same(img3));


    }
}
