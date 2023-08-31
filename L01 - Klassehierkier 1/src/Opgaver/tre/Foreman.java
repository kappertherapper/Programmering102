package Opgaver.tre;

public class Foreman extends Mechanic {
    private String finishLine;
    private double bonusPrWeek;

    public Foreman(String name, String adress, String year, double salary, String finishLine, double bonusPrWeek) {
        super(name, adress, year, salary);
        this.finishLine = finishLine;
        this.bonusPrWeek = bonusPrWeek;
    }

    public double weeklySalary() {
        return super.weeklySalary() + bonusPrWeek;
    }
}
