package creational.factory;

public class NotificationFactory {

    public static Notification createNotification(NotificationType notificationType){
        if(notificationType == NotificationType.PUSH){
            return new EmailNotification();
        }
        else if (notificationType == NotificationType.EMAIL) {
            return new EmailNotification();
        }
        else if (notificationType == NotificationType.SMS){
            return new SmsNotification();
        }
        return null;
    }

}
