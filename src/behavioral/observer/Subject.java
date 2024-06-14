package behavioral.observer;

/**
 * @author gauravkabra
 * @since 2024
 */

public interface Subject {
	void addObserver(Observer observer);
	void removeObserver(Observer observer);
	void notifyObservers();
}
