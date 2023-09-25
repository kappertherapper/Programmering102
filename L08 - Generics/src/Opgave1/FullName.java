package Opgave1;

public class FullName implements Comparable<FullName> {
    String Firstname;
    String Lastname;

    public FullName(String firstname, String lastname) {
        Firstname = firstname;
        Lastname = lastname;
    }

    @Override
    public String toString() {
        return Firstname + " " + Lastname;
    }

    @Override
    public int compareTo(FullName o) {
        int compare = (this.Firstname.compareTo(o.Firstname));
        if (compare == 0) {
            compare = (this.Lastname.compareTo(o.Lastname));
        }
        return compare;
    }
}
