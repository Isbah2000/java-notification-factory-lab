public class SMSNotification implements Notification {
@Override
public void send(String recipient, String message) {
// Simulate sending SMS
System.out.println("[SMS] To: " + recipient + " | Message: " + message);
}
}
