package Strategy.ducks;

import Strategy.flybehaviors.FlyNoWay;
import Strategy.quackbehaviors.Quack;

public class ModelDuck extends Duck {
    public ModelDuck() {
        this.setFlyBehavior(new FlyNoWay());
        this.setQuackBehavior(new Quack());
    }

    @Override
    public void display() {
        System.out.println("I'm a model duck");
    }
}
