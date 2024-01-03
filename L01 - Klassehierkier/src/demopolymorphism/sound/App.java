package demopolymorphism.sound;

public class App {

    public static void main(String[] args) {
        Cat cat = new Cat();
        Dog dog = new Dog();
        Donkey donkey = new Donkey();
        Snake snake = new Snake();

        cat.makeSound();
        dog.makeSound();
        donkey.makeSound();
        snake.makeSound();
    }
}

