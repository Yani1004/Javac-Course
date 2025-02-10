package FactoryPattern;

import java.sql.SQLOutput;

public class PushNotification implements Message {
    @Override
    public void send() {
        System.out.println("Push Notification Message");
    }
}
