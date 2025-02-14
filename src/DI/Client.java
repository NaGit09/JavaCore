package DI;

public class Client  implements  InjectionService{
    private MessageService service;
    // Constructor injection
    public Client(MessageService service) {
        this.service = service;
    }

    public Client() {
    }
    // Setter injection
    public void setService(MessageService param) {
        this.service = param;
    }
    public void sendMessage(String param) {
        service.sendMessage(param);
    }
    // Interface injection
    @Override
    public void service(MessageService service) {
        this.service = service;
    }
}
