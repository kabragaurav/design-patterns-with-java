package behavioral.observer;

/**
 * @author gauravkabra
 * @since 2024
 */

public class PhoneObserver implements Observer {
	private String weather;

	@Override
	public void update(String weather) {
		this.weather = weather;
		display();
	}

	private void display() {
		System.out.println("Phone: Weather updated - " + weather);
	}
}

