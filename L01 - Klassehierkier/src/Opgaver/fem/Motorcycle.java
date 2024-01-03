package Opgaver.fem;

public class Motorcycle extends Vehicle{
    private int engineSize;

    public Motorcycle(String make, String model, int year, double milage, int engineSize) {
        super(make, model, year, milage);
        this.engineSize = engineSize;
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
    }

    @Override
    public void start() {
        super.start();
    }

    @Override
    public void stop() {
        super.stop();
    }

    @Override
    public void performAction() {
        super.performAction();
        System.out.print("Revving the engine!");
    }
}
