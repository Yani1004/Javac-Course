package FactoryPattern;

public class EmailMessage implements Message {
    @Override
    public void send() {
        System.out.println("Sending email");
    }
}
