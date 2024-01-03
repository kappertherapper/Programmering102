package demopolymorphism.animals_polymorphic;

class Snake extends Animal {

    public Snake(int price) {
        super(price);
    }

    @Override
    public void makeSound() {
        System.out.println("Snake: hiss");
    }
}
