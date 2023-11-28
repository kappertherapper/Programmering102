package demopolymorphism.animals;

class Snake {
    private int price;

    public int getPrice() {
        return price;
    }

    public Snake(int price) {
        this.price = price;
    }

    public void makeSound() {
        System.out.println("Snake: hiss");
    }
}
