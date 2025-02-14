package DI;

public class smsMessage  implements MessageService{
    @Override
    public void sendMessage(String message) {
        System.out.println("Sms message: " + message);
    }
}
