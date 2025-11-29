public class InAppNotification implements Notification {
@Override
public void send(String recipient) {
System.out.println("UserID:" + recipient);
}
}