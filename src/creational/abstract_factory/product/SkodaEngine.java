package creational.abstract_factory.product;

/**
 * ConcreteProductA2
 * 
 * @author gauravkabra
 * @since 2024
 */

public class SkodaEngine implements Engine {
    @Override
    public void describeEngine() {
        System.out.println("Skoda engine made");
    }
}
