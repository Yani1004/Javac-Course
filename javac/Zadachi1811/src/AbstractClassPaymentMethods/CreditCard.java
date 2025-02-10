package AbstractClassPaymentMethods;

public class CreditCard extends PaymentMethod {
    private String number;
    public CreditCard(String number) {
        this.number = number;
    }

    @Override
    public void processPayment(double amount) {
        System.out.printf("Credit card Number: %s\nAmount :%.2f ", number, amount);
    }
}
