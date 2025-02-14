import DI.Client;
import DI.MessageService;
import DI.emailMessage;
import DI.smsMessage;

import java.io.PrintStream;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        MessageService sms = new smsMessage();
        MessageService email = new emailMessage();
        // Constructor injection
        Client client = new Client(sms);
        client.sendMessage("Hello nhựt anh !");
        client = new Client(email);
        client.sendMessage("Ok nhựt anh ");
        // setter injection
        client.setService(sms);
        client.sendMessage("Change service to sms!");
        // interface injection
        client.service(email);
        client.sendMessage("Email message !");

    }
}