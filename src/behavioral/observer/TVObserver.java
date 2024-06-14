package behavioral.observer;

/**
 * @author gauravkabra
 * @since 2024
 */

class TVObserver implements Observer {
    private String weather;
 
    @Override
    public void update(String weather) {
        this.weather = weather;
        display();
    }
 
    private void display() {
        System.out.println("TV: Weather updated - " + weather);
    }
}
