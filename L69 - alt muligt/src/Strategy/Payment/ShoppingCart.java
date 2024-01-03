package Strategy.Payment;

public class ShoppingCart {

    public void executePayment(PaymentStrategy strategy, int amount) {
        strategy.pay(amount);
    }
}
