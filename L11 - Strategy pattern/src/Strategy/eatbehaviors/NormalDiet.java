package Strategy.eatbehaviors;

public class NormalDiet implements Eat{
    @Override
    public void eat() {
        System.out.println("Eating a normal diet");
    }
}
