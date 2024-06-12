package structural.adapter;

/**
 * @author gauravkabra
 * @since 2024
 */

public interface ITemperatureAdapter {
    void setInCelcius(double c);
    void setInFahrenheit(double f);

    double getInCelcius();
    double getInFahrenheit();
}
