package Design_Pattern;

public interface AbstractFactory {
    public Fan createFan (String type);
    public Light createLight(String type );

    public static void main(String[] args) {
        AbstractFactory abstractFactory = new FactoryVn();
        Fan fan = abstractFactory.createFan("vn");
        fan.fanOn();
         abstractFactory = new FactoryUs();
         fan = abstractFactory.createFan("us");
        fan.fanOn();
    }
    public class FactoryUs implements AbstractFactory {

        @Override
        public Fan createFan(String type ) {
            if (type.equals("us")) return new FanUs();
            if (type.equals("vn")) return new FanVn();
            return null;
        }

        @Override
        public Light createLight(String type) {
            if (type.equals("us")) return new LightUs();
            if (type.equals("vn")) return new LightVn();
            return null;
        }
    }
    public class FactoryVn implements AbstractFactory {


        @Override
        public Fan createFan(String type) {
            if (type.equals("us")) return new FanUs();
            if (type.equals("vn")) return new FanVn();
            return null;
        }

        @Override
        public Light createLight(String type) {
            if (type.equals("us")) return new LightUs();
            if (type.equals("vn")) return new LightVn();
            return null;
        }
    }
    public interface Light {
        public void lightOn();
    }
    public class LightUs implements Light {
        @Override
        public void lightOn() {
            System.out.println("Light is On");
        }
    }
    public class LightVn implements Light {

        @Override
        public void lightOn() {
            System.out.println("Đèn đang bật ");
        }
    }
    public interface Fan  {
        public void fanOn();
    }
    public class FanUs implements Fan {

        @Override
        public void fanOn() {
            System.out.println("Fan is On");
        }
    }
    public class FanVn implements Fan {

        @Override
        public void fanOn() {
            System.out.println("Quạt đang quay ");
        }
    }

}
