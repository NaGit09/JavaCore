package Design_Pattern;

import java.sql.Connection;

public class Singleton {
    private Connection connection;
    private static Singleton instance;
    private Singleton() {
        if (Singleton.instance == null) {
            Singleton.instance = new Singleton();
        }
    }
    public static Singleton getInstance() {
        return Singleton.instance;
    }

    public static void main(String[] args) {
        Singleton singleton = Singleton.getInstance();
    }
}
