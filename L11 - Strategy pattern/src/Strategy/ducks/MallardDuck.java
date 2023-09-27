package Strategy.ducks;

import Strategy.flybehaviors.FlyWithWings;
import Strategy.quackbehaviors.Quack;

public class MallardDuck extends Duck {

	public MallardDuck() {
		this.setQuackBehavior(new Quack());
		this.setFlyBehavior(new FlyWithWings());
	}

	@Override
	public void display() {
		System.out.println("I'm a real Mallard duck");
	}
}
