package Strategy.dog;

import Strategy.barkbehaviors.Bark;
import Strategy.eatbehaviors.Eat;

public abstract class Dog {
    private Eat eat;
    private Bark bark;


    public Dog() {

    }

    public abstract void display();

    public void performEat() {
        this.eat.eat();
    }
    public void performBark() {
        this.bark.bark();
    }
    public void setEatBehavoir(Eat e) {
        eat = e;
    }
    public void setBarkBehavoir(Bark b) {
        bark = b;
    }




}


