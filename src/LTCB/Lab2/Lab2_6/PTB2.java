package LTCB.Lab2.Lab2_6;

public class PTB2 {
    private int a ;
    private int b ;
    private int c ;

    public PTB2(int a, int b, int c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }
    public String nghiem () {
        double delta =  (Math.pow(b,2))-4*a*c;
        if (delta ==0.0) return ""+-b/2*a;
        if (delta > 0.0 ) return "X1 : " +((-b+Math.sqrt(delta))/2*a) +" X2 : " +(-b-Math.sqrt(delta)/2*a);
        return "Vô nghiệm";

    }

    public static void main(String[] args) {
        PTB2 ptb = new PTB2(2,-7,3);
        System.out.println(ptb.nghiem());
    }
}
