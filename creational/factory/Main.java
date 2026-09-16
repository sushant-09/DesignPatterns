package creational.factory;

public class Main {
    public static void main(String[] args){
        Notification email = NotificationFactory.createNotification(NotificationType.EMAIL);
        Notification sms = NotificationFactory.createNotification(NotificationType.SMS);
        Notification push = NotificationFactory.createNotification(NotificationType.PUSH);

        email.send();
        sms.send();
        push.send();
    }
}
