package Design_Pattern;

public class Decorator {

    public interface drink {
        public String getDescription();
        public double getPrice();
    }
    public static class Coffee implements drink {
        private String name;
        private double price;

        public Coffee(String name, double price) {
            this.name = name;
            this.price = price;
        }
        @Override
        public String getDescription() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }
        @Override
        public double getPrice() {
            return price;
        }

        public void setPrice(double price) {
            this.price = price;
        }
    }

    public static  class CoffeeDecorator implements drink {
        drink coffee;

        public CoffeeDecorator(drink coffee) {
            this.coffee = coffee;
        }
@Override
        public String getDescription() {
            return coffee.getDescription();
        }
@Override
        public double getPrice() {
            return coffee.getPrice();
        }
    }

    public static  class MilkDecorator extends CoffeeDecorator {
        public MilkDecorator(drink coffee) {
            super(coffee);

        }

        @Override
        public String getDescription() {
            return super.getDescription() + " Milk";
        }

        @Override
        public double getPrice() {
            return super.getPrice() + 20.4;
        }
    }
    public static  class JellyDecorator extends CoffeeDecorator {
        public JellyDecorator(drink coffee) {
            super(coffee);

        }

        @Override
        public String getDescription() {
            return super.getDescription() + " Jelly";
        }

        @Override
        public double getPrice() {
            return super.getPrice() + 10;
        }
    }
    public static void main(String[] args) {
        drink c = new Coffee("espresso" , 20);
         c = new MilkDecorator(c);
         c = new JellyDecorator(c);
        System.out.println(c.getDescription());
        System.out.println(c.getPrice());
    }
}

