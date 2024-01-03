package demopolymorphism.animals_polymorphic;

class Animal {
    private int price;

    public int getPrice() {
        return price;
    }

    public Animal(int price) {
        this.price = price;
    }

    public void makeSound() {
        System.out.println("Animal: ???");
    }
}
