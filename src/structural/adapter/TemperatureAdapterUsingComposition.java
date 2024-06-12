package structural.adapter;


/**
 * @author gauravkabra
 * @since 2024
 */
 
public class TemperatureAdapterUsingComposition implements ITemperatureAdapter {

    private Celsius celsius = new Celsius();

    @Override
    public void setInCelcius(double c) {
        celsius.setTemperature(c);
    }

    @Override
    public void setInFahrenheit(double f) {
        celsius.setTemperature(convertToCelsius(f));
    }

    @Override
    public double getInCelcius() {
        return celsius.getTemperature();
    }

    @Override
    public double getInFahrenheit() {
       return convertToFahrenheit(celsius.getTemperature());
    }

    private double convertToFahrenheit(double c) {
        return 9/5.0 * c + 32;
    }
    
    private double convertToCelsius(double f) {
        return (f-32) * 5/9;
    }

}
