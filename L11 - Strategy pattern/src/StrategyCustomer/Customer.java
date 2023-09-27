package StrategyCustomer;

import java.util.Comparator;

public class Customer implements Comparable<Customer>{
    private String name;
    private int number;
    private static Comparator<Customer> customerComparator;

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
        if (customerComparator != null) {
            return customerComparator.compare(this, o);
        } else {
            return 0;
        }
    }
}

