package behavioral.observer;

/**
 * @author gauravkabra
 * @since 2024
 */

public class WeatherApp {
	public static void main(String[] args) {
		WeatherStation weatherStation = new WeatherStation();

		Observer phoneDisplay = new PhoneObserver();
		Observer tvDisplay = new TVObserver();

		weatherStation.addObserver(phoneDisplay);
		weatherStation.addObserver(tvDisplay);

		weatherStation.setWeather("Sunny");
	}
}

