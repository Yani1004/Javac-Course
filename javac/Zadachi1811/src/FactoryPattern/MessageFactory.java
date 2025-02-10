package FactoryPattern;

public class MessageFactory {
    public static Message createMessage(String type) {
        switch (type) {
            case "email": return new EmailMessage();
            case "push": return new PushNotification();
            case "sms": return new SMSMessage();
            default: throw new IllegalArgumentException("Unknown message type");

        }
    }
}
