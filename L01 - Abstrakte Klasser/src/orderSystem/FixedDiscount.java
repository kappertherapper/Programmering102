package orderSystem;

public class FixedDiscount extends Discount {
    int fixedDiscount;
    int discountLimit;

    public FixedDiscount(int fixedDiscount, int discountLimit) {
        this.fixedDiscount = fixedDiscount;
        this.discountLimit = discountLimit;
    }

    public double getDiscount(double price) {
        if (price >= discountLimit) {
            return price - fixedDiscount;
        } else {
            return 0; // No discount if the limit exceeds discountLimit
        }
    }
}
