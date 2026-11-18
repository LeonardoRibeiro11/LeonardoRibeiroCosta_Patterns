package factorymethod;

public class Main {
    public static void main(String[] args) {
        String mensagem = "bem vindo ao sistema";

        NotificationFactory emailFactory = new EmailNotificationFactory();
        NotificationService emailService = new NotificationService(emailFactory);
        emailService.sendNotification(mensagem);

        NotificationFactory smsFactory = new SmsNotificationFactory();
        NotificationService smssService = new NotificationService(smsFactory);
        smssService.sendNotification(mensagem);

        NotificationFactory pushFactory = new PushNotificationFactory();
        NotificationService pushService = new NotificationService(pushFactory);
        pushService.sendNotification(mensagem);
    }
}
