package Observer.Weather;

import java.util.ArrayList;
import java.util.List;

public class WeatherData implements Subject {
    private int temperature;
    private int humidity;
    private double pressure;
    private final List<Observer> observers = new ArrayList<>();

    @Override
    public void registrerObserver(Observer o) {
        observers.add(o);
    }

    @Override
    public void removeObserver(Observer o) {
        observers.remove(o);
    }

    @Override
    public void nofifyObserver() {
        for (Observer o : observers) {
            o.update(temperature, humidity, pressure);
        }
    }

    public void measurementsChanged() {
        this.nofifyObserver();
    }

    //-------------------------------------------------------------------------

    public void setWeatherData(int temperature, int humidity, double pressure) {
        this.temperature = temperature;
        this.humidity = humidity;
        this.pressure = pressure;
        this.measurementsChanged();
    }

    public int getTemperature() {
        return temperature;
    }

    public int getHumidity() {
        return humidity;
    }

    public double getPressure() {
        return pressure;
    }
}
