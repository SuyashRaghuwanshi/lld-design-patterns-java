
// Step 5: Client
public class Client {
    public static void main(String[] args) {
        NotificationCreator creator;

        creator = new EmailNotifierCreator();
        creator.send("Hello via Email");

        creator = new SMSNotifierCreator();
        creator.send("Hello via SMS");
    }
}
