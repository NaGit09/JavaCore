package LTCB.Lab2.Lab2_7;

public class Transaction {
    public String name;
    public double deposit;
    public int maturity;

    public Transaction(String name, double deposit, int maturity) {
        this.name = name;
        this.deposit = deposit;
        this.maturity = maturity;
    }
    public double  interest () {
        if (deposit <= 1000 ) return deposit * 0.04;
        if ( 1000<deposit && deposit <= 5000) return deposit * 0.045;
        return deposit * 0.05;
    }
    public double payBack (int charge) {
        if (  charge< 500) return 0.0025;
        if ( 500 < charge && charge <= 1500) return charge * 0.005;
        if ( 1500 < charge && charge <= 2500) return charge * 0.0075;
        return charge * 0.01;
    }

    public static void main(String[] args) {
        Transaction t1 = new Transaction("John Smith", 5000, 5);
        System.out.println(t1.interest());
        System.out.println(t1.payBack(5000));
    }
}
