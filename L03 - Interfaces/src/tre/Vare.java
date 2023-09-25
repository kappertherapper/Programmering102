package tre;

public class Vare {
    double price;
    String name;
    String description;
    double VAT = 1.25;

    public Vare(double price, String name, String description) {
        this.price = price;
        this.name = name;
        this.description = description;
    }

    public double getPrice() {
        return price;
    }

    public String getName() {
        return name;
    }

    public double getVAT() {
        return priceWithVAT()-price;
    }

    public double priceWithVAT() {
        return price * VAT;
    }
}
