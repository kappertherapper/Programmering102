package Observer.News;

public interface Subject {
    void registrerObserver(Observer o);
    void removeObserver(Observer o);
    void notifyObservers();
}
