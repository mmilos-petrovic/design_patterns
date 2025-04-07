package observer_pattern;

public class ClientApp {
    public static void main(String[] args){
        WeatherData weatherData = new WeatherData();
        CurrentConditionDisplay currentConditionDisplay1 = new CurrentConditionDisplay(weatherData);
        CurrentConditionDisplay currentConditionDisplay2 = new CurrentConditionDisplay(weatherData);
        weatherData.setMeasurement(2,3,4);
        weatherData.setMeasurement(3, 5, 11);
    }

}
