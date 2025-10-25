
// Step 2: Concrete Product
public class SMSNotification implements Notification {
    @Override
    public void send(String msg) {
        System.out.println("SMS sent with message: " + msg);
    }
}
