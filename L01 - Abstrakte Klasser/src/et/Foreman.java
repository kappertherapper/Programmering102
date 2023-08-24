package et;

public class Foreman extends Employee {
    private String finishLine;
    private double bonusPrWeek;

    public Foreman(String name, String adress, double salary, String finishLine, double bonusPrWeek) {
        super(name, adress, salary, 37);
        this.finishLine = finishLine;
        this.bonusPrWeek = bonusPrWeek;
    }

    public double weeklySalary() {
        return super.weeklySalary() + bonusPrWeek;
    }
}
