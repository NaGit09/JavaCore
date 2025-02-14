package DI;

public class emailMessage implements MessageService{
    @Override
    public void sendMessage(String message) {
        System.out.println("Email sent to "+message);
    }
}
