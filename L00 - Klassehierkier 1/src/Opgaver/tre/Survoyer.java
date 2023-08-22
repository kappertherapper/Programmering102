package Opgaver.tre;

public class Survoyer extends Mechanic {
    int visions;
    int bonus = 29;

    public Survoyer(String name, String adress, String year, double salary, int visions) {
        super(name, adress, year, salary);
        this.visions = visions;
    }

    public double weeklySalary() {
        return super.weeklySalary() + (visions * bonus);
    }
}
