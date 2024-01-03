package Strategy.Payment;

public class Demo {
    public static void main(String[] args) {
        ShoppingCart cart = new ShoppingCart();

        PaymentStrategy creditCard = new CreditCard("Freddy fræk", 69557759, 66, "12/7");
        cart.executePayment(creditCard, 1000);

        PaymentStrategy payPal = new PayPal("bøllebob@gmail.com", "bobHanBygger");
        cart.executePayment(payPal, 800);
    }
}
