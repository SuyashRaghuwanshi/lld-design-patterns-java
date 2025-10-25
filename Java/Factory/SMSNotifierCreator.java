
// Step 4: Concrete Creator
public class SMSNotifierCreator extends NotificationCreator {
    @Override
    public Notification createNotification() {
        return new SMSNotification();
    }
}
