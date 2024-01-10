package Observer.Weather;

public class Demo {
    public static void main(String[] args) {
        WeatherData weatherData = new WeatherData();

        CurrentConditionsDisplay currentConditionsDisplay = new CurrentConditionsDisplay();
        ForecastDisplay forecastDisplay = new ForecastDisplay();
        StatisticsDisplay statisticsDisplay = new StatisticsDisplay();

        weatherData.registrerObserver(currentConditionsDisplay);
        weatherData.registrerObserver(forecastDisplay);
        weatherData.registrerObserver(statisticsDisplay);

        weatherData.setWeatherData(80, 65, 30.4f);
        System.out.println();
        weatherData.setWeatherData(82, 70, 29.2f);
        System.out.println();
        weatherData.setWeatherData(78, 90, 29.2f);
    }



}
