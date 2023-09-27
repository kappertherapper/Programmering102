package Strategy.ducks;

import Strategy.flybehaviors.FlyWithWings;
import Strategy.quackbehaviors.Quack;

public class RedheadDuck extends Duck {

    public RedheadDuck() {
        this.setFlyBehavior(new FlyWithWings());
        this.setQuackBehavior(new Quack());
    }

    @Override
    public void display() {
        System.out.println("I'm a real Red Headed duck");
    }
}
