
// Step 2: Concrete Product
public class EmailNotification implements Notification {
    @Override
    public void send(String msg) {
        System.out.println("Email sent with message: " + msg);
    }
}
