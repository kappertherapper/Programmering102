package Interface;

public class Car implements InformationDisplay {
    String brand;
    String model;

    public Car(String brand, String model) {
        this.brand = brand;
        this.model = model;
    }


    @Override
    public void display() {
        System.out.println("The brand is: " + brand + ", the model is: " + model);
    }
}
