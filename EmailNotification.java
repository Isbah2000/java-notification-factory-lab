public class EmailNotification implements Notification {
@Override
public void send(String recipient, String message) {
// Simulate sending email
System.out.println("[EMAIL] To: " + recipient + " | Message: " + message);
}
}
