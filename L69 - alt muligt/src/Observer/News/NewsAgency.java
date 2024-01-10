package Observer.News;

import java.util.ArrayList;
import java.util.List;

public class NewsAgency implements Subject {
    private String news;
    private final List<Observer> observers = new ArrayList<>();

    @Override
    public void registrerObserver(Observer o) {
        observers.add(o);
    }

    @Override
    public void removeObserver(Observer o) {
        observers.remove(o);
    }

    public void setNews(String news) {
        this.news = news;
    }

    @Override
    public void notifyObservers() {
        for (Observer o : observers) {
            o.update(news);
        }
    }
}
