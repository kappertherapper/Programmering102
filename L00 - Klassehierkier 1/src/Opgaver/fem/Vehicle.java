package Opgaver.fem;

public class Vehicle {
    String make;
    String model;
    int year;
    double milage;

    public Vehicle(String make, String model, int year, double milage) {
        this.make = make;
        this.model = model;
        this.year = year;
        this.milage = milage;
    }

    public void displayInfo() {
        System.out.println(make + model + year + milage);
    }

    public void start() {
        System.out.println("Starting the " + this.getClass().getSimpleName());
        System.out.println("Vroom vroom!");
    }

    public void stop() {
        System.out.println("Stopping the " + this.getClass().getSimpleName());
    }

    public void performAction() {
        System.out.print("Performing " + this.getClass().getSimpleName() + "-specific action: ");
    }
}
