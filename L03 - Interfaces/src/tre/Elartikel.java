package tre;

public class Elartikel extends Vare{
    double energyConsumption;
    double VAT = 1.30;

    public Elartikel(double price, String name, String description, double energyConsumption) {
        super(price, name, description);
        this.energyConsumption = energyConsumption;
    }

    public double priceWithVAT() {
        if (price > 3) {
            return price * VAT;
        } else {
            return price;
        }
    }
}
