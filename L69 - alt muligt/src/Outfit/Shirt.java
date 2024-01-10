package Outfit;

public class Shirt extends Clothing implements Use {
    public Shirt(String brand, String model, String color, int cond, boolean dirty, int wears) {
        super(brand, model, color, cond, dirty, wears);
    }

    @Override
    public void wear() {
        this.cond--;
        System.out.println("Condition lowered: " + cond);
        if (wears >= 8) {
            System.out.println("Your shirt are dirty af");
            dirty = true;
        }
    }

    @Override
    public void clean() {
        System.out.println("Shirt is now clean");
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
