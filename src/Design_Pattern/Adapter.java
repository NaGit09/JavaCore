package Design_Pattern;

public class Adapter {
    public interface Bird {
        public void fly();

        public void MakeSound();
    }

    public static class Duck implements Bird {
        public void fly() {
            System.out.println("Duck is flying ");
        }

        public void MakeSound() {
            System.out.println("Quack quack ");
        }
    }

    public interface PlasticToy {
        public void fly();

        public void MakeSound();

    }

    public static class duckToy implements PlasticToy {
        public void fly() {
            System.out.println("duck doesn't fly ");
        }

        @Override
        public void MakeSound() {
            System.out.println("Quack quack ");
        }
    }

    public static  class DuckAdapter implements Bird {
        private PlasticToy plasticToy;

        public DuckAdapter(PlasticToy plasticToy) {
            this.plasticToy = plasticToy;
        }

        @Override
        public void fly() {
            plasticToy.fly();
        }

        @Override
        public void MakeSound() {
            plasticToy.MakeSound();
        }
    }

    public static void main(String[] args) {
        Bird bird = new Duck();
        bird.fly();
        bird.MakeSound();
        PlasticToy duckToy = new duckToy();
        duckToy.fly();
        duckToy.MakeSound();
        DuckAdapter duckAdapter = new DuckAdapter(duckToy);
        duckAdapter.fly();
        duckAdapter.MakeSound();
    }
}
