package Strategy.ducks;

import Strategy.flybehaviors.FlyNoWay;
import Strategy.quackbehaviors.Squeak;

public class RubberDuck extends Duck {

	public RubberDuck() {
		this.setFlyBehavior(new FlyNoWay());
		this.setQuackBehavior(new Squeak());
	}

	@Override
	public void display() {
		System.out.println("I'm a rubber duckie");
	}
}
