package Observer.Weather;

public interface Observer {
    void update(int temp, int humidity, double pressure);
}
