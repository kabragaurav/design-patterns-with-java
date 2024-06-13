package behavioral.chain_of_responsibility;

/**
 * @author gauravkabra
 * @since 2024
 */

public class Currency500Dispenser implements CurrencyDispenser {

    @Override
    public void dispense(int amount) {
        while (amount >= 500) {
            System.out.println("dispensing $500 note");
            amount -= 500;
        }
        setNextDispenser(new Currency100Dispenser(), amount);
    }

    @Override
    public void setNextDispenser(CurrencyDispenser dispenser, int amount) {
        dispenser.dispense(amount);
    }
    
}