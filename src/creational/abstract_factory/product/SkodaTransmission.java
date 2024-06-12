package creational.abstract_factory.product;

/**
 * ConcreteProductB2
 * 
 * @author gauravkabra
 * @since 2024
 */

public class SkodaTransmission implements Transmission {

    @Override
    public void describeTransmission() {
        System.out.println("Skoda transmission made");
    }

}
