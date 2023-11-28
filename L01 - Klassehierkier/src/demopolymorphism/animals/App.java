package demopolymorphism.animals;

public class App {

    public static void main(String[] args) {
        Cat cat = new Cat(500);
        Dog dog = new Dog(1000);
        Donkey donkey = new Donkey(3000);
        Snake snake = new Snake(2000);

        cat.makeSound();
        dog.makeSound();
        donkey.makeSound();
        snake.makeSound();

        System.out.println();

        System.out.println(cat.getPrice());
        System.out.println(dog.getPrice());
        System.out.println(donkey.getPrice());
        System.out.println(snake.getPrice());

        int totalPrice = cat.getPrice() + dog.getPrice() + donkey.getPrice() + snake.getPrice();
        System.out.println("Total price: " + totalPrice);
    }
}

