package Interface;

public class Demo {
    public static void main(String[] args) {
        Car ford = new Car("Ford", "KA");
        Smartphone iphone = new Smartphone("Apple", "iOS");

        ford.display();
        System.out.println();
        iphone.display();
    }
}
