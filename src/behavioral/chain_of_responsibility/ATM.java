package behavioral.chain_of_responsibility;

/**
 * @author gauravkabra
 * @since 2024
 */

public class ATM {
    public static void main(String[] args) {
        CurrencyDispenser dispenser = new Currency1000Dispenser();
        dispenser.dispense(3600);
    }
}
