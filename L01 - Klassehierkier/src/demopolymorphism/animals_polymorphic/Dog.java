package demopolymorphism.animals_polymorphic;

class Dog extends Animal {

    public Dog(int price) {
        super(price);
    }

    @Override
    public void makeSound() {
        System.out.println("Dog: woof");
    }
}
