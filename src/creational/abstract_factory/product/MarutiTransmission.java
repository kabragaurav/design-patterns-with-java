package creational.abstract_factory.product;

/**
 * ConcreteProductB1
 * 
 * @author gauravkabra
 * @since 2024
 */

public class MarutiTransmission implements Transmission {

    @Override
    public void makeTransmission() {
        System.out.println("Maruti transmission made");
    }

}
