package Design_Pattern;

public class FactoryCar {
    public machine createCar(String type) {
        if (type.equalsIgnoreCase("car")) { return new Car(); }
        if (type.equalsIgnoreCase("bus")) { return new Bus(); }
        if (type.equalsIgnoreCase("motorbike")) { return new Motorbike(); }
        return null;
    }
    public static void main(String[] args) {
        FactoryCar fc = new FactoryCar();
        machine m = fc.createCar("car");
        m.run();
    }
    public interface machine {
        public void run ();
    }
    private static class Car  implements  machine{

        @Override
        public void run() {
            System.out.println("Car run");
        }
    }
    private static class Bus implements machine {

        @Override
        public void run() {
            System.out.println("Bus run");
        }
    }
    private static class Motorbike implements machine {
        @Override
        public void run() {
            System.out.println("Motorbike run");
        }
    }
}
