package Outfit;

public class Clothing {
    String brand;
    String model;
    String color;
    int cond;
    boolean dirty;
    int wears;

    public Clothing(String brand, String model, String color, int cond, boolean dirty, int wears) {
        this.brand = brand;
        this.model = model;
        this.color = color;
        this.cond = cond;
        this.dirty = dirty;
        this.wears = wears;
    }

    public Clothing() {
    }

    public void outfit(Tshirt tshirt, Shirt shirt, Pant pants, Sneaker sneakers) {
        System.out.println("Your outfit is: " + "\n \n" +
                "T-shirt: " + tshirt + "\n \n" +
                "Shirt: " + shirt + "\n \n" +
                "Pants: " + pants + "\n \n" +
                "Sneakers: " + sneakers);
    }
}
