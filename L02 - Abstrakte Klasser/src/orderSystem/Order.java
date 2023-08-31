package orderSystem;

import java.util.ArrayList;
import java.util.List;

public class Order {
    private final int number;
    private Discount discount;

    // composition 1 --> 0..* OrderLine
    private final List<OrderLine> orderLines = new ArrayList<>();

    public Order(int number) {
        this.number = number;
    }

    public int getNumber() {
        return this.number;
    }

    public ArrayList<OrderLine> getOrderLines() {
        return new ArrayList<>(orderLines);
    }

    public void addOrderLine(OrderLine line) {
        orderLines.add(line);
    }

    public double orderPrice() {
        double orderPrice = 0;
        for (OrderLine orderLine : orderLines) {
            orderPrice += orderLine.orderLinePrice();
        }
        return orderPrice;
    }

    public void setDiscount(Discount discount) {
        this.discount = discount;
    }

    public Discount getDiscount() {
        return this.discount;
    }

    @Override
    public String toString() {
        return "Order: " + number +
                "Orderlines: " + orderLines +
                "Discount: " + discount;
    }
}
