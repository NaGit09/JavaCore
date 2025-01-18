package LTCB.Lab2.Lab2_1;

public class Employee {
    private String name ;
    private int hours;

    public Employee(String name, int hours) {
        this.name = name;
        this.hours = hours;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getHours() {
        return hours;
    }

    public void setHours(int hours) {
        this.hours = hours;
    }
    public double Wage () {
        return hours * 12;
    }
    public double Tax () {
        return Wage() *  0.15;
    }
    public double netPay () {
        return Wage() - Tax();
    }
    public double raiseWage () {
        return netPay() +   14;
    }
    public Boolean checkOverTime () {
        return hours > 100;
    }
    // Extended
    public  double TaxExt () {
        if (Wage()  <= 240) return 0;

        if (240 < Wage()  && Wage()< 480) return Wage() * 0.15;

        return Wage() * 0.28;
    }
    public double netPayExt () {
        return Wage() - TaxExt();
    }
    public static void main(String[] args) {
        Employee e1 = new Employee("Name", 20);
        Employee e2 = new Employee("Mai", 30);
        Employee e3 = new Employee("Minh", 102);
        System.out.println("Test wage method");
        System.out.println(e1.Wage());
        System.out.println(e2.Wage());
        System.out.println(e3.Wage());
        System.out.println("Test tax method");
        System.out.println(e1.Tax());
        System.out.println(e2.Tax());
        System.out.println(e3.Tax());
        System.out.println("Test netPay method");
        System.out.println(e1.netPay());
        System.out.println(e2.netPay());
        System.out.println(e3.netPay());
        System.out.println("Test raiseWage method");
        System.out.println(e1.raiseWage());
        System.out.println(e2.raiseWage());
        System.out.println(e3.raiseWage());
        System.out.println("Test checkOverTime method");
        System.out.println(e1.checkOverTime());
        System.out.println(e2.checkOverTime());
        System.out.println(e3.checkOverTime());
        System.out.println("Test TaxExt method");
        System.out.println(e1.TaxExt());
        System.out.println(e2.TaxExt());
        System.out.println(e3.TaxExt());
        System.out.println("Test netPayExt method");
        System.out.println(e1.netPayExt());
        System.out.println(e2.netPayExt());
        System.out.println(e3.netPayExt());
    }
}
