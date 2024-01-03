package Strategy.Payment;

public class PayPal implements PaymentStrategy {
    String email;
    String password;

    public PayPal(String email, String password) {
        this.email = email;
        this.password = password;
    }

    @Override
    public void pay(int amount) {
        System.out.println("Pays " + amount + " kr with Paypal");
    }
}
