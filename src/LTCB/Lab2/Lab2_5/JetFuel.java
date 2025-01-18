package LTCB.Lab2.Lab2_5;

public class JetFuel {
    private int quantitySold ;
    private String quantityLevel ;
    private int basePrice ;

    public JetFuel(int quantitySold, String quantityLevel, int basePrice) {
        this.quantitySold = quantitySold;
        this.quantityLevel = quantityLevel;
        this.basePrice = basePrice;
    }

    public int getQuantitySold() {
        return quantitySold;
    }

    public void setQuantitySold(int quantitySold) {
        this.quantitySold = quantitySold;
    }

    public String getQuantityLevel() {
        return quantityLevel;
    }

    public void setQuantityLevel(String quantityLevel) {
        this.quantityLevel = quantityLevel;
    }

    public int getBasePrice() {
        return basePrice;
    }
    public void setBasePrice(int basePrice) {
        this.basePrice = basePrice;
    }
    public double totalCost (){
        return quantitySold * basePrice - discountPrice();
    }
    public double discountPrice (){
        return (quantitySold > 10000)  ? ((quantitySold * basePrice) * 0.1) : 0;
    }

    public static void main(String[] args) {
        JetFuel jetFuel = new JetFuel(5000,"High" , 100);
        System.out.println(jetFuel.totalCost());
    }
}
