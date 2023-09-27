package Payment;

public class Creditcard implements Payment {
    String name;
    int pincode;
    @Override
    public void pay(double amount) {
        System.out.println("Paid using Creditcard: " + amount);
    }

    public Creditcard(String name, int pincode) {
        this.name = name;
        this.pincode = pincode;
    }
}
