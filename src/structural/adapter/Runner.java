package structural.adapter;

/**
 * @author gauravkabra
 * @since 2024
 */

public class Runner {
    public static void main(String[] args) {

        // Using inheritance
        TemperatureAdapterUsingInheritance adapter1 = new TemperatureAdapterUsingInheritance();

        adapter1.setInCelcius(25);
        System.out.println("Temperature in C: " + adapter1.getInCelcius());
        System.out.println("Temperature in F: " + adapter1.getInFahrenheit());

        adapter1.setInFahrenheit(77);
        System.out.println("Temperature in C: " + adapter1.getInCelcius());
        System.out.println("Temperature in F: " + adapter1.getInFahrenheit());


        // using composition
        TemperatureAdapterUsingComposition adapter2 = new TemperatureAdapterUsingComposition();

        adapter2.setInCelcius(25);
        System.out.println("Temperature in C: " + adapter2.getInCelcius());
        System.out.println("Temperature in F: " + adapter2.getInFahrenheit());

        adapter2.setInFahrenheit(77);
        System.out.println("Temperature in C: " + adapter2.getInCelcius());
        System.out.println("Temperature in F: " + adapter2.getInFahrenheit());
    }
}
