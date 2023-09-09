package tre;

public class Fødevare extends Vare {
    int durability;
    double VAT = 1.05;

    public Fødevare(double price, String name, String description, int durability) {
        super(price, name, description);
        this.durability = durability;
    }
    public double priceWithVAT() {
        return price * VAT;
    }
}
