package LTCB.Lab1.Lab1_3;
/*
------------------------
-       AutoMobile     -
------------------------
- String model         -
- int price            -
- double mileage       -
- boolean Used         -
------------------------

 */
public class AutoMobile {
    private String model;
    private Integer price;
    private Double mileage;
    private Boolean Used ;

    public AutoMobile(String model, Integer price, Double mileage, Boolean used) {
        this.model = model;
        this.price = price;
        this.mileage = mileage;
        Used = used;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public Integer getPrice() {
        return price;
    }

    public void setPrice(Integer price) {
        this.price = price;
    }

    public Double getMileage() {
        return mileage;
    }

    public void setMileage(Double mileage) {
        this.mileage = mileage;
    }

    public Boolean getUsed() {
        return Used;
    }

    public void setUsed(Boolean used) {
        Used = used;
    }

    @Override
    public String toString() {
        return "AutoMobile{" +
                "model='" + model + '\'' +
                ", price=" + price +
                ", mileage=" + mileage +
                ", Used=" + Used +
                '}';
    }
}
