public class InAppNotification implements Notification {
@Override
public void send(String recipient, String message) {
System.out.println("[INAPP] To:" + recipient + " | Message: " + message);
}
}