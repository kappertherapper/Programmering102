package ObservableBag;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class ObservableBag implements Bag {
    private final HashMap<String, Integer> items = new HashMap<>();

    @Override
    public void add(String o) {
        int count = this.getCount(o);
        items.put(o, count+1);
        this.notifyObservers(o);

//        if (!items.containsValue(o)) {
//            items.put(o, 1);
//            this.notifyObservers(o);
//        } else {
//            items.put(o, +1);
//            this.notifyObservers(o);
//        }
    }

    @Override
    public void remove(String o) {
        items.remove(o);
        this.notifyObservers(o);
    }

    @Override
    public int getCount(String o) {
        if (items.containsKey(o)) {
            return items.get(o);
        } else {
            return 0;
        }
    }

    public HashMap<String, Integer> getItems() {
        return items;
    }

    private final List<Observer> observers = new ArrayList<>();

    public void addObserver(Observer o) {
        observers.add(o);
    }

    public void removeObserver(Observer o) {
        observers.remove(o);
    }

    public void notifyObservers(String s) {
        for (Observer o : observers) {
            //int count = this.getCount(s);
            o.update(s);
        }
    }
}
