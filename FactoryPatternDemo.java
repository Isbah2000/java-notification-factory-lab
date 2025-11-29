import java.util.Arrays;
import java.util.List;
public class FactoryPatternDemo {
public static void main(String[] args) {
NotificationFactory factory = new NotificationFactory();
// Simulated notification requests: type, recipient, message
List<String[]> requests = Arrays.asList(
new String[] {"email", "alice@example.com", "Welcome to the course!"},
new String[] {"SMS", "+923001234567", "Class starts at 10:00 AM"},
new String[] {"Push", "device-abc-123", "Assignment due tomorrow"},
new String[] {"fax", "1234", "This will show unknown"},
new String[] {"Inapp", "8232", "This is InApp Notification"}
);
for (String[] req : requests) {
String type = req[0];
String recipient = req[1];
String message = req[2];
Notification notifier = factory.getNotification(type);
System.out.print("Request: " + type + " -> ");
if (notifier != null) {
notifier.send(recipient, message);
} else {
System.out.println("No such notification channel: " + type);
}
}
}
}
