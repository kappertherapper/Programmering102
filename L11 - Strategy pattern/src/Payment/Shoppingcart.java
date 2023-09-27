package Payment;

import java.util.ArrayList;

public class Shoppingcart {
    ArrayList<Item> Items = new ArrayList<>();
    private Payment payment;
    private double paymentAmount;

    public double value() {
        double value = 0;
        for (Item i : Items) {
            value += i.getPrice();
        }
        return value;
    }

    public void addItem (Item item) {
        Items.add(item);
    }

    public void setPayment(Payment payment) {
        this.payment = payment;
    }

    public void checkout(int amount) {
        paymentAmount = amount;
        payment.pay(amount);
    }

    public double calculateResult() {
        return paymentAmount - value();
    }
}
