package Observer.Weather;

public class ForecastDisplay implements Observer {
    private double currentPressure = 25.69f;

    public void update(int temp, int humidity, double pressure) {
        double lastPressure = currentPressure;
        currentPressure = pressure;
        System.out.println("*** Forecast *** ");
        if (currentPressure > lastPressure) {
            System.out.println("Improving weather on the way!");
        } else if (currentPressure == lastPressure) {
            System.out.println("More of the same");
        } else if (currentPressure < lastPressure) {
            System.out.println("Watch out for cooler, rainy weather");
        }
    }
}
