package to;

import java.util.Arrays;

public class Test {
    public static void main(String[] args) {
        
    }
    public static Customer biggestCustomer(Customer[] customers) {
        Customer biggestCustomer = null;
        for (int i = 0; i < customers.length; i++) {
            if (customers[i].compareTo(biggestCustomer) > 0) {
                biggestCustomer = customers[i]; // Update if the current customer is bigger
            }
        }
        return biggestCustomer;
    }
    public static Customer[] biggerThanCustomer( Customer[] customers, Customer customer) {
        Customer[] biggestCustomers = new Customer[customers.length];
        int count = 0;
        for (int i = 0; i < customers.length; i++) {
            if (customers[i].compareTo(customer) > customer.getFirstName().length()) {
                biggestCustomers[count] = customers[i];
                count++;
            } else if (customers[i].compareTo(customer) > customer.getLastName().length()) {
                biggestCustomers[count] = customers[i];
                count++;
            } else if (customers[i].compareTo(customer) > customer.getAge()) {
                biggestCustomers[count] = customers[i];
                count++;
            }
        }
        return Arrays.copyOf(biggestCustomers, count);
    }
}

