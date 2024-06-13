package structural.decorator;

/**
 * @author gauravkabra
 * @since 2024
 */

public class WingDecorator extends Decorator {

    public WingDecorator(Animal animal) {
        super(animal);
    }

    @Override
    public void describe() {
        animal.describe();
        System.out.println("Got fancy wings");
    }
    
}
