package structural.decorator;

/**
 * @author gauravkabra
 * @since 2024
 */

public class Main {
    public static void main(String[] args) {
        Animal animal = new LivingAnimal();

        LegDecorator legDecorator = new LegDecorator(animal);
        legDecorator.describe();

        WingDecorator wingDecorator = new WingDecorator(animal);
        wingDecorator.describe();

        WingDecorator wingDecorator2 = new WingDecorator(legDecorator);
        wingDecorator2.describe();
    }
}
