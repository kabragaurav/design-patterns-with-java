package structural.decorator;

/**
 * @author gauravkabra
 * @since 2024
 */

public class LivingAnimal implements Animal {

    @Override
    public void describe() {
        System.out.println("I am a living animal");
    }
    
}
