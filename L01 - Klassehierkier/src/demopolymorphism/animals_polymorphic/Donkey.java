package demopolymorphism.animals_polymorphic;

class Donkey extends Animal {

    public Donkey(int price) {
        super(price);
    }

    @Override
    public void makeSound() {
        System.out.println("Donkey: hee-haw");
    }
}
