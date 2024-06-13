package behavioral.chain_of_responsibility;

/**
 * @author gauravkabra
 * @since 2024
 */

public class Currency1000Dispenser implements CurrencyDispenser {

    @Override
    public void dispense(int amount) {
        while (amount >= 1000) {
            System.out.println("dispensing $1000 note");
            amount -= 1000;
        }
        setNextDispenser(new Currency500Dispenser(), amount);
    }

    @Override
    public void setNextDispenser(CurrencyDispenser dispenser, int amount) {
        dispenser.dispense(amount);
    }
    
}
