package behavioral.chain_of_responsibility;

/**
 * @author gauravkabra
 * @since 2024
 */

public class ATM {
    public static void main(String[] args) {
        CurrencyDispenser rootDispenser = new Currency1000Dispenser();
        rootDispenser.dispense(3600);
        rootDispenser.dispense(2140);
    }
}
