package Strategy.Payment;

public class CreditCard implements PaymentStrategy {
    String name;
    int cardNr;
    int secureNr;
    String expireDate;

    public CreditCard(String name, int cardNr, int secureNr, String expireDate) {
        this.name = name;
        this.cardNr = cardNr;
        this.secureNr = secureNr;
        this.expireDate = expireDate;
    }

    @Override
    public void pay(int amount) {
        System.out.println("Pays " + amount + " kr with credit card");
    }
}
