package structural.adapter;

/**
 * @author gauravkabra
 * @since 2024
 */

public class Runner {
    public static void main(String[] args) {

        // Using inheritance
        TemperatureAdapter adapter = new TemperatureAdapter();

        adapter.setInCelcius(25);
        System.out.println("Temperature in C: " + adapter.getInCelcius());
        System.out.println("Temperature in F: " + adapter.getInFahrenheit());

        adapter.setInFahrenheit(77);
        System.out.println("Temperature in C: " + adapter.getInCelcius());
        System.out.println("Temperature in F: " + adapter.getInFahrenheit());


        // using composition
    }
}
