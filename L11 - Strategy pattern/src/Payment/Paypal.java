package Payment;

public class Paypal implements Payment {
    String email;
    String password;
    @Override

    public void pay(double amount) {
        System.out.println("Paid using Paypal: " + amount);
    }

    public Paypal(String email, String password) {
        this.email = email;
        this.password = password;
    }
}
