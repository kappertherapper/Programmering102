package Strategy;

import Strategy.dog.Dog;
import Strategy.dog.Labrador;

public class MiniDogSimulator {
    public static void main(String[] args) {
        Dog labrador = new Labrador();
        System.out.println("Labrador");
        labrador.display();
        labrador.performBark();
        labrador.performEat();
        labrador.performBark();
        System.out.println();
    }
}
