package structural.decorator;

/**
 * @author gauravkabra
 * @since 2024
 */

public abstract class Decorator implements Animal {
    Animal animal;

    public Decorator(Animal animal) {
        this.animal = animal;
    }

}
