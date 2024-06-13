package structural.decorator;

/**
 * @author gauravkabra
 * @since 2024
 */

public class LegDecorator extends Decorator {

    public LegDecorator(Animal animal) {
        super(animal);
    }

    @Override
    public void describe() {
        animal.describe();
        System.out.println("Got decorated legs");
    }
    
}
