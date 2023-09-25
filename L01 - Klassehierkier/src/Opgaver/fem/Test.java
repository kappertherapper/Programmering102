package Opgaver.fem;

import java.util.ArrayList;

public class Test {
    public static void main(String[] args) {
        Car toyota = new Car("Toyota", "Fingo", 1996, 58291, 4);
        Car ford = new Car("Ford", "Focus", 2010, 21039, 4);

        Motorcycle hally = new Motorcycle("HallyDavidson", "Storcykel", 2009, 19213, 4);
        Motorcycle pug = new Motorcycle("pugmaxi", "Lillecykel", 1986, 29213, 2);

        Truck volvewagen = new Truck("Volvewagen", "Rugbrød", 2020, 6900, 2000);
        Truck mercedes = new Truck("Mercedes", "Lastbil", 1999, 102043, 10000);

        ArrayList<Vehicle> vehicles = new ArrayList<>();
        vehicles.add(toyota);
        vehicles.add(ford);
        vehicles.add(hally);
        vehicles.add(pug);
        vehicles.add(volvewagen);
        vehicles.add(mercedes);

        for (Vehicle vehicle : vehicles) {
            vehicle.start();
            vehicle.stop();
            vehicle.performAction();
            System.out.println();
            System.out.println();

        }
    }
}
