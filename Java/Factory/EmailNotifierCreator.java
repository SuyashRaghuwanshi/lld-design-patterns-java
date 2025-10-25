
// Step 4: Concrete Creator
public class EmailNotifierCreator extends NotificationCreator {
    @Override
    public Notification createNotification() {
        return new EmailNotification();
    }
}
