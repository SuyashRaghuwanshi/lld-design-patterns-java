
// Step 3: Creator Abstract Class
public abstract class NotificationCreator {
    public abstract Notification createNotification();

    public void send(String msg) {
        Notification notification = createNotification();
        notification.send(msg);
    }
}
