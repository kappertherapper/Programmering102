package Payment;

public class App {
    public static void main(String[] args) {
        Shoppingcart cart = new Shoppingcart();
        cart.addItem(new Item("Carls Speciel", 60));
        cart.addItem(new Item("Chips", 10));

        // Pay by Creditcard
        cart.setPayment(new Creditcard("Ingolf julemand", 6969));
        cart.checkout(100);
        System.out.println("difference: " + cart.calculateResult());

        System.out.println();

        // Pay by Paypal
        cart.setPayment(new Paypal("Bøllemis@hotmail.com", "jegharkøbtdinmoridinkælder"));
        cart.checkout(50);
        System.out.println("difference: " + cart.calculateResult());
    }
}
