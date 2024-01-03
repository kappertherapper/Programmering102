package Opgaver.fem;

public class Car extends Vehicle{
    private int numDoors;

    public Car(String make, String model, int year, double milage, int numDoors) {
        super(make, model, year, milage);
        this.numDoors = numDoors;
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
        super.performAction(); System.out.print("Honking the horn!");
    }
}
