package Strategy.dog;

import Strategy.barkbehaviors.PlayfullBark;
import Strategy.eatbehaviors.ProteinDiet;

public class Labrador extends Dog {
    public Labrador() {
        this.setBarkBehavoir(new PlayfullBark());
        this.setEatBehavoir(new ProteinDiet());

    }

    @Override
    public void display() {
        System.out.println("i am a cute ass labrador");
    }
}
