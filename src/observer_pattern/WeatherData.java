package observer_pattern;

import java.util.ArrayList;
import java.util.List;

public class WeatherData implements Subject {
    private List<Observer> observers;
    private float temperature;
    private float humidity;
    private float pressure;

    public WeatherData() {
        this.observers = new ArrayList<>();
    }

    public void measurementChanged() {
        notifyObservers();
    }

    @Override
    public void registerObserver(Observer o) {
        observers.add(o);
    }

    @Override
    public void removeObserver(Observer o) {
        observers.remove(o);
    }

    @Override
    public void notifyObservers() {
        for (Observer o : this.observers) {
            o.update(this.temperature, this.humidity, this.pressure);
        }
    }

    public void setMeasurement(float t, float h, float p) {
        this.temperature = t;
        this.humidity = h;
        this.pressure = p;
        this.notifyObservers();
    }
}
