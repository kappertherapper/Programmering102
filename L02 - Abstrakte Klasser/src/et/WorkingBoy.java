package et;

public class WorkingBoy extends Employee {
    public WorkingBoy (String name, String adress, double salary, int hours) {
        super(name, adress, salary, hours);
    }

    @Override
    public double weeklySalary() {
        return super.weeklySalary();
    }
}
