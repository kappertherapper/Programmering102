package demopolymorphism.animals_polymorphic;

class Cat extends Animal {

    public Cat(int price) {
        super(price);
    }

    @Override
    public void makeSound() {
        System.out.println("Cat: Meow");
    }
}
