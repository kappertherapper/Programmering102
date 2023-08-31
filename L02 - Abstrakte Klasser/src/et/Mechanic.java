package et;

public class Mechanic extends Employee {
    private String year;
    private double salary;

    public Mechanic(String name, String adress, String year, double salary) {
        super(name, adress, salary, 37);
        this.year = year;
    }
}
