package demopolymorphism.animals;

class Donkey {
    private int price;

    public int getPrice() {
        return price;
    }

    public Donkey(int price) {
        this.price = price;
    }

    public void makeSound() {
        System.out.println("Donkey: hee-haw");
    }
}
