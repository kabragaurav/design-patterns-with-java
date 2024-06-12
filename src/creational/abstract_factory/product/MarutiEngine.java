package creational.abstract_factory.product;

/**
 * ConcreteProductA1
 * 
 * @author gauravkabra
 * @since 2024
 */

public class MarutiEngine implements Engine {
    @Override
    public void makeEngine() {
        System.out.println("Maruti engine made");
    }
}
