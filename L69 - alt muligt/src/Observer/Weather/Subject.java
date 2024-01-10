package Observer.Weather;

public interface Subject {
    void registrerObserver(Observer o);

    void removeObserver (Observer o);

    void nofifyObserver();

}
