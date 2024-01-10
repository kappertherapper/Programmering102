package Observer.Charactars;

import java.util.ArrayList;
import java.util.List;

class Character implements Subject {
    class Stats {
        int health = 100;
        int mana = 30;
        int experience = 0;

        public void setStats(int health, int mana, int experience) {
            this.health = health;
            this.mana = mana;
            this.experience = experience;
            notifyObservers();

        }
        void takeDamage(int damage) {
            health = Math.max(health - damage, 0);
            notifyObservers();
        }

        void useMana(int amount) {
            mana = Math.max(mana - amount, 0);
        }

        void gainExperience(int exp) {
            experience += exp;
        }

        @Override
        public String toString() {
            return "Stats{" +
                    "health=" + health +
                    ", mana=" + mana +
                    ", experience=" + experience +
                    '}';
        }
    }

    private Stats stats;
    private List<Observer> observers;

    public Character() {
        this.stats = new Stats();
        this.observers = new ArrayList<>();
    }

    @Override
    public void addObserver(Observer o) {
        observers.add(o);
    }

    @Override
    public void removeObserver(Observer o) {
        observers.remove(o);
    }

    @Override
    public void notifyObservers() {
        for (Observer o : observers) {
            o.update(stats);
        }
    }

    public Stats getStats() {
        return stats;
    }
}
