package demopolymorphism.animals;

class Dog {
    private int price;

    public int getPrice() {
        return price;
    }

    public Dog(int price) {
        this.price = price;
    }

    public void makeSound() {
        System.out.println("Dog: woof");
    }
}
