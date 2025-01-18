package LTCB.Lab2.Lab2_4;

public class Coffee {
    private String kind ;
    private double  unitPrice;
    private int weight;

    public Coffee(String kind, double unitPrice, int weight) {
        this.kind = kind;
        this.unitPrice = unitPrice;
        this.weight = weight;
    }

    public String getKind() {

        return kind;
    }

    public void setKind(String kind) {
        this.kind = kind;
    }

    public double getUnitPrice() {
        return unitPrice;
    }

    public void setUnitPrice(double unitPrice) {
        this.unitPrice = unitPrice;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }
    public double cost () {
       return (weight * unitPrice) - discount();
    }
    public double discount () {
        if (weight < 5000) return 0;
        if (5001 < weight && weight < 20000) return (weight * unitPrice) * 0.1;
        return (weight * unitPrice) * 0.25;
    }

    public static void main(String[] args) {
        Coffee coffee = new Coffee("coffee", 120, 600);
        System.out.println(coffee.cost());
    }
}
