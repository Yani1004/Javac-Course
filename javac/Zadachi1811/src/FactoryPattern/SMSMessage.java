package FactoryPattern;

public class SMSMessage implements Message {
    @Override
    public void send() {
        System.out.println("SMS Message");
    }
}
