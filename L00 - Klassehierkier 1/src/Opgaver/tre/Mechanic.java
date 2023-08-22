package Opgaver.tre;

public class Mechanic extends Person {
    private String year;
    private double salary;

    public Mechanic(String name, String adress, String year, double salary) {
        super(name, adress);
        this.year = year;
        this.salary = salary;
    }

    public double weeklySalary() {
        return salary * 7;
    }
}
