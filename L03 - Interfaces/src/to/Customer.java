package to;

public class Customer implements Comparable<Customer> {
    String firstName;
    String lastName;
    int age;

    public Customer(String firstName, String lastName, int age) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public int getAge() {
        return age;
    }

    @Override
    public int compareTo(Customer o) {
        int compare = (this.lastName.compareTo(o.lastName));
        if (compare == 0) {
            compare = this.firstName.compareTo(o.firstName);
        } else {
            compare = Integer.compare(this.age, o.age);
        }
        return compare;
    }
}
