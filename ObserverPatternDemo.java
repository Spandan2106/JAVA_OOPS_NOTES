import java.util.ArrayList;
import java.util.List;

// 1. Observer Interface (Subscriber)
interface Observer {
    void update(float temperature, float humidity);
}

// 2. Subject Interface (Publisher)
interface Subject {
    void registerObserver(Observer o);
    void removeObserver(Observer o);
    void notifyObservers();
}

// 3. Concrete Subject
class WeatherStation implements Subject {
    private List<Observer> observers;
    private float temperature;
    private float humidity;

    public WeatherStation() {
        observers = new ArrayList<>();
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
        // Broadcast updates to all registered listeners
        for (Observer o : observers) {
            o.update(temperature, humidity);
        }
    }

    // Business method that triggers notifications
    public void setMeasurements(float temperature, float humidity) {
        this.temperature = temperature;
        this.humidity = humidity;
        notifyObservers(); // Automatic trigger upon state change
    }
}

// 4. Concrete Observer 1: Mobile App Display
class PhoneDisplay implements Observer {
    @Override
    public void update(float temperature, float humidity) {
        System.out.println("[Phone Display] Temp: " + temperature + "°C | Humidity: " + humidity + "%");
    }
}

// 5. Concrete Observer 2: Window LED Display
class WindowDisplay implements Observer {
    @Override
    public void update(float temperature, float humidity) {
        System.out.println("[Window Display] Live Temp: " + temperature + "°C");
    }
}

// 6. Execution Driver
public class ObserverPatternDemo {
    public static void main(String[] args) {
        WeatherStation station = new WeatherStation();

        Observer phone = new PhoneDisplay();
        Observer window = new WindowDisplay();

        // Registering subscribers
        station.registerObserver(phone);
        station.registerObserver(window);

        System.out.println("--- First Weather Update ---");
        station.setMeasurements(29.5f, 65.0f);

        // Dynamic unsubscription at runtime
        station.removeObserver(window);

        System.out.println("\n--- Second Weather Update (After Window Display removed) ---");
        station.setMeasurements(31.0f, 70.0f);
    }
}
