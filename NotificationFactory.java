public class NotificationFactory {
/**
* Create a Notification object based on type.
* Accepts case-insensitive strings: "EMAIL", "SMS", "PUSH".
* Returns null for unknown types (simple demo behavior).
*/
public Notification getNotification(String type) {
if (type == null) return null;
String key = type.trim().toUpperCase();
switch (key) {
case "EMAIL":
return new EmailNotification();
case "SMS":
return new SMSNotification();
case "PUSH":
return new PushNotification();
default:
return null;
}
}
}
