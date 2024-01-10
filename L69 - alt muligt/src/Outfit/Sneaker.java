package Outfit;

public class Sneaker extends Clothing implements Use{
    String id;

    public Sneaker(String brand, String model, String color, int cond, boolean dirty, int wears, String id) {
        super(brand, model, color, cond, dirty, wears = 0);
        this.id = id;
    }

    public void wear() {
        this.cond--;
        System.out.println(model + " " + color + " is being weared and condition lowered: " + cond);
        wears++;
        if (wears >= 5) {
            System.out.println("Your sneakers are dirty af");
            dirty = true;
        }
    }

    public void clean() {
        System.out.println("Sneaker is now clean");
        dirty = false;
        wears = 0;
    }

    @Override
    public String toString() {
        return brand + "\n" +
                "   Model: " + model + "\n" +
                "   Colorway: " + color + "\n" +
                "   ID: " + id;
    }
}
