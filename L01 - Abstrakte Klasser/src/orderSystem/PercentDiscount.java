package orderSystem;

public class PercentDiscount extends Discount {
    int discountPercentage;
    public PercentDiscount(int discountPercentage) {
        this.discountPercentage = discountPercentage;
    }

    public double getDiscount(double price) {
        return price * (discountPercentage / 100.0);
    }
}
