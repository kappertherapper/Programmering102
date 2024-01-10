package Observer.Weather;

public class StatisticsDisplay implements Observer {
    private double maxTemp = 0.0f;
    private double minTemp = 200;
    private double tempSum = 0.0f;
    private int numReadings = 0;

    @Override
    public void update(int temp, int humidity, double pressure) {
        tempSum += temp;
        numReadings++;
        if (temp > maxTemp) maxTemp = temp;
        if (temp < minTemp) minTemp = temp;

        System.out.println("*** Statistics ***");
        System.out.println("Avg/Max/Min temperature = " + (tempSum / numReadings) + "/" + maxTemp + "/" + minTemp);
    }
}
