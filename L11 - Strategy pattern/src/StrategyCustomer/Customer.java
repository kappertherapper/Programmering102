package StrategyCustomer;

import java.util.Comparator;

public class Customer implements Comparable<Customer>{
    private String name;
    private int number;
    private static Comparator<Customer> customerComparator = new NumberComparator(); // so i dont have to check for null
    // static sikre at det er den samme de bruger


    public Customer(String name, int number) {
        this.name = name;
        this.number = number;
    }

    //-----------------------------------------------------------------------

    public String getName() {
        return name;
    }

    public int getNumber() {
        return number;
    }

    //-----------------------------------------------------------------------

    public static Comparator<Customer> getCustomerComparator() {
        return customerComparator;
    }
    public static void setCustomerComparator(Comparator<Customer> customerComparator) {
        Customer.customerComparator = customerComparator;
    }

    //-----------------------------------------------------------------------

    @Override
    public String toString() {
        return name + number;
    }

    //-----------------------------------------------------------------------

    @Override
    public int compareTo(Customer o) {
            return customerComparator.compare(this, o);
    }
}

