package tre;

public class Spiritus extends Vare{
    int alcoholPercentage;
    double VAT = 1.80;

    public Spiritus(double price, String name, String description, int alcoholPercentage) {
        super(price, name, description);
        this.alcoholPercentage = alcoholPercentage;
    }

    public double priceWithVAT() {
        if (price > 90) {
            VAT = 2.20;
            return price * VAT;
        } else {
            return price * VAT;
        }
    }
}
