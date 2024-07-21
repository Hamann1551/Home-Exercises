package badCode.d;

class NotificationService {
    private Notifer notifier;

    public NotificationService(Notifer notifier) {
        this.notifier = notifier;
    }

    void sendNotification(String recipient, String message, String deliveryMethod) {
        if (deliveryMethod.equals("email")) {
            notifier.send(recipient, message);
        }
    }
}
