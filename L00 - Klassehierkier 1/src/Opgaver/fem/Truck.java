package Opgaver.fem;

public class Truck extends Vehicle{
    double loadCapacity;

    public Truck(String make, String model, int year, double milage, double loadCapacity) {
        super(make, model, year, milage);
        this.loadCapacity = loadCapacity;
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
        System.out.print("Activating hydraulic lift!");
    }
}
