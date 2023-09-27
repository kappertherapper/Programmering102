package Strategy.barkbehaviors;

public class Growl implements Bark{
    @Override
    public void bark() {
        System.out.println("Growl! Growl!");
    }
}
