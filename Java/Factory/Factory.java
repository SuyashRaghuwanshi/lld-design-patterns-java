package Java.Factory;
public class Factory {
    //Normal if else use
    public class EmailNotificationService {
        public void send(){
            System.out.println("Email sent");
        }
    }
    public class SMSService {
        public void send(){
            System.out.println("SMS sent");
        }
    }

    public class NotificationService {
        public void sendNotification(String message, String type){
            if(type.equals("SMS")){
                SMSService smsService = new SMSService();
                smsService.send();
            }
            else if(type.equals("Email")){
                EmailNotificationService emailService = new EmailNotificationService();
                emailService.send();
            }
        }
    }
    
    // better approach using switch case
    public class SimpleFactory{
        public void sendNotification(String msg, String type){
            switch (type) {
                case "SMS":
                    SMSService smsService = new SMSService();
                    smsService.send();
                case "Email":
                    EmailNotificationService emailService = new EmailNotificationService();
                    emailService.send();
                    break;
                default:
                    throw new AssertionError();
            }
        }
    }
    //Better than Simple Factory Pattern

    //1step: Create Product Interface
    public interface Notification{
        public void send(String msg);
    }
    //2step: Create Concrete Products
    class EmailNotification implements Notification{
        @Override
        public void send(String msg){
            System.out.println("Email sent with message: "+ msg);
        }
    }
    class SMSNotification implements Notification{
        @Override
        public void send(String msg){
            System.out.println("Email sent with message: "+ msg);
        }
    }
    //3step: Create Creator Abstract Class
    abstract class NotificationCreator{
        public abstract Notification createNotification();
        public void send(String msg){
            Notification notification = createNotification();
            notification.send(msg);
        }
    }
    //4step: Create Concrete Creators
    class EmailNotifierCreator extends NotificationCreator{
        @Override
        public Notification createNotification(){
            return new EmailNotification();
        }
    }
    class SMSNotifierCreator extends NotificationCreator{
        @Override
        public Notification createNotification(){
            return new SMSNotification();
        }
    }
    //5step: Client Code
    public class Client{
        public void main(String[] args){
            NotificationCreator creator;
            creator=new EmailNotifierCreator();
            creator.send("Hello via Email");
            creator=new SMSNotifierCreator();
            creator.send("Hello via SMS");
        }
    }
}
