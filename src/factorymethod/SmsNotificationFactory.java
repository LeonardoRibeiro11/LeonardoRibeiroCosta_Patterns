package factorymethod;

public class SmsNotificationFactory  extends NotificationFactory{
    @Override
    public Notification createNotification(){
        return new SMSNotification();
    }
}
