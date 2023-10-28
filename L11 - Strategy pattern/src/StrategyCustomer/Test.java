package StrategyCustomer;

import java.util.Comparator;

public class Test {
    public static void main(String[] args) {
        Customer high = new Customer("Henrik", 55);
        Customer mid = new Customer( "Mette", 33);
        Customer low = new Customer("Bent", 11);

        //Lambda
        //Customer.setCustomerComparator((cust1, cust2) -> cust1.getName().compareTo(cust2.getName()));
        //Customer.setCustomerComparator(Comparator.comparing(Customer::getName));

        Customer.setCustomerComparator(new NameComparator());

        int result = high.compareTo(mid);
        System.out.println(result);

        Customer.setCustomerComparator(new NumberComparator());


        int sum = high.compareTo(mid);
        System.out.println(sum);


    }
}
