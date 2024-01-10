package Observer.Charactars;

class HeathBar implements Observer {
    @Override
    public void update(Character.Stats stats) {
        System.out.println("Heathbar updated " + stats.health);
    }
}
