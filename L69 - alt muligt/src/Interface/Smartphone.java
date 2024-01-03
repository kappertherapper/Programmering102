package Interface;

public class Smartphone implements InformationDisplay {
    String manufacturer;
    String operatingSystem;

    public Smartphone(String manufacturer, String operatingSystem) {
        this.manufacturer = manufacturer;
        this.operatingSystem = operatingSystem;
    }

    @Override
    public void display() {
        System.out.println("The manufacturer of the phone is: " + manufacturer +
                            "\n" + "operating system: " + operatingSystem);
    }
}
