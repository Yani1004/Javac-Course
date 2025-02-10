package AbstractClassPaymentMethods;

public class PayPal extends PaymentMethod {
    private String email;

    public PayPal(String email) {
        this.email = email;
    }

    @Override
    public void processPayment(double amount) {
        System.out.println(" PayPal payment of $" + amount + " email: " + email);
    }
}
