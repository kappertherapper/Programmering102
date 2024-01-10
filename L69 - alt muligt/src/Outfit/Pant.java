package Outfit;

public class Pant extends Clothing implements Use {
    public Pant(String brand, String model, String color, int cond, boolean dirty, int wears) {
        super(brand, model, color, cond, dirty, wears);
    }

    @Override
    public void wear() {
        this.cond--;
        System.out.println("Condition lowered: " + cond);
        if (wears >= 10) {
            System.out.println("Your pants are dirty af");
            dirty = true;
        }
    }

    @Override
    public void clean() {
        System.out.println("Pants is now clean");
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
