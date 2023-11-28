package demopolymorphism.animals;

class Cat {
    private int price;

    public int getPrice() {
        return price;
    }

    public Cat(int price) {
        this.price = price;
    }

    public void makeSound() {
        System.out.println("Cat: Meow");
    }

}
