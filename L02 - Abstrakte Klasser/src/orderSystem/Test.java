package orderSystem;

import java.time.LocalDate;

public class Test {
    public static void main(String[] args) {
        Product v3 = new Product(1, "990v3", 1699);
        Product v4 = new Product(2, "990v4", 1599);
        Product v5 = new Product(3, "990v5", 1799);
        Product v6 = new Product(4, "990v6", 1999);
        Product toHundredToR = new Product(5, "2002r", 1299);

        Customer regular = new Customer("Frederik", LocalDate.of(1998, 06, 21));
        Customer sneakerhead = new Customer("Kasper", LocalDate.of(1996, 11, 18));


        //Sneakerhead order
        Order et = new Order(1);
        OrderLine sneakerheadOne = new OrderLine(1, 2, v3);
        OrderLine sneakerheadTwo = new OrderLine(2, 1, v4);
        OrderLine sneakerheadThree = new OrderLine(3, 1, toHundredToR);

        et.addOrderLine(sneakerheadOne);
        et.addOrderLine(sneakerheadTwo);
        et.addOrderLine(sneakerheadThree);

        System.out.println("Order: " + et.getNumber());
        System.out.println(et.getOrderLines());
        System.out.println("Order price = " + et.orderPrice());


        sneakerhead.addOrder(et);
        PercentDiscount procent = new PercentDiscount(15);
        double priceAfterDiscount = et.orderPrice()- procent.getDiscount(et.orderPrice());
        System.out.println("Discount = " + procent.getDiscount(et.orderPrice()));
        System.out.println("Price after discount = " + priceAfterDiscount);

        //--------------------------------------------------------------------------------------

        //Regular order
        Order to = new Order(2);
        OrderLine regularOne = new OrderLine(1, 1, v5);
        OrderLine regularTwo = new OrderLine(2, 1, v6);

        to.addOrderLine(regularOne);
        to.addOrderLine(regularTwo);

        System.out.println("Ordre: " + to.getNumber());
        System.out.println(to.getOrderLines());
        System.out.println("Order price = " + to.orderPrice());

        regular.addOrder(to);
        FixedDiscount fixed = new FixedDiscount(250, 1000);
        System.out.println("Price after discount = " + fixed.getDiscount(to.orderPrice()));
    }
}
