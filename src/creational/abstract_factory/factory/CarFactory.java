package creational.abstract_factory.factory;

import creational.abstract_factory.product.Engine;
import creational.abstract_factory.product.Transmission;

/**
 * AbstractFactory
 * 
 * Note that we can make it abstract class as well, but from Java8, interfaces
 * can also have static methods.
 * 
 * @author gauravkabra
 * @since 2024
 */

public interface CarFactory {
    abstract public Engine createEngine();
    abstract public Transmission createTransmission();

    public static CarFactory getCarFactory(String brand) {
        switch (brand) {
            case "maruti":
                return new MarutiFactory();
            case "skoda":
                return new SkodaFactory();
            default:
                throw new UnsupportedOperationException("unknown brand");
        }
    }
}
