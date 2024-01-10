package Observer.Charactars;

public class Demo {
    public static void main(String[] args) {
        Character druid = new Character();

        Observer heathBar = new HeathBar();

        druid.addObserver(heathBar);

        System.out.println("Druid takes damage");
        druid.getStats().takeDamage(20);
    }
}
