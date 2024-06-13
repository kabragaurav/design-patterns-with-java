package behavioral.chain_of_responsibility;

/**
 * @author gauravkabra
 * @since 2024
 */

public class Currency100Dispenser implements CurrencyDispenser {

    @Override
    public void dispense(int amount) {
        while (amount >= 100) {
            System.out.println("dispensing $100 note");
            amount -= 100;
        }
        System.out.println("Remaining amount $" + amount);
    }

    @Override
    public void setNextDispenser(CurrencyDispenser dispenser, int amount) {
        // pass
    }
    
}