package Outfit;

public class Tshirt extends Clothing implements Use {
    public Tshirt(String brand, String model, String color, int cond, boolean dirty, int wears) {
        super(brand, model, color, cond, dirty, wears);
    }

    @Override
    public void wear() {
        this.cond--;
        System.out.println("Condition lowered: " + cond);
        if (wears >= 3) {
            System.out.println("Your t-shirt are dirty af");
            dirty = true;
        }
    }

    @Override
    public void clean() {
        System.out.println("T-shirt is now clean");
        dirty = false;
        wears = 0;
    }

    @Override
    public String toString() {
        return brand + "\n" +
                "   Model: " + model + "\n" +
                "   Colorway: " + color + "\n";
    }
}
