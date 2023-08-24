package et;

public abstract class Employee {
    private String name;
    private String adress;
    private double salary;
    private int hours;

    public Employee(String name, String adress, double salary, int hours) {
        this.name = name;
        this.adress = adress;
        this.salary = salary;
        this.hours = 37;
    }

    public String getName() {
        return name;
    }

    public double weeklySalary() {
        return salary * hours;
    }
}


