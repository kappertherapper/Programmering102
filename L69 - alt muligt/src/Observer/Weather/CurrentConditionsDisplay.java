package Observer.Weather;

public class CurrentConditionsDisplay implements Observer {
    @Override
    public void update(int temp, int humidity, double pressure) {
        System.out.println("*** Current conditions ***");
        System.out.println(temp + "F degrees and " + humidity + "% humidity");
    }
}
