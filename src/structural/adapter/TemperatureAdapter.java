package structural.adapter;

/**
 * Using inheritance
 * 
 * @author gauravkabra
 * @since 2024
 */

public class TemperatureAdapter extends Celsius implements ITemperatureAdapter {

    @Override
    public void setInCelcius(double c) {
       super.setTemperature(c);
    }

    @Override
    public void setInFahrenheit(double f) {
        super.setTemperature(convertToCelsius(f));
    }

    @Override
    public double getInCelcius() {
        return super.getTemperature();
    }

    @Override
    public double getInFahrenheit() {
       return convertToFahrenheit(super.getTemperature());
    }

    private double convertToFahrenheit(double c) {
        return 9/5.0 * c + 32;
    }
    
    private double convertToCelsius(double f) {
        return (f-32) * 5/9;
    }
}
