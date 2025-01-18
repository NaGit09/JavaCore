package LTCB.Lab2.Lab2_3;

public interface Image {
    public int size();
    public boolean  isLarger(Image image);
    public boolean  isPortrait ();
    public boolean same (Image image);
    public String sizeString();
    public String getSource();
    public String getQuality();
    public int getWidth();
    public int getHeight();
}
