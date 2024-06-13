package behavioral.chain_of_responsibility;

/**
 * @author gauravkabra
 * @since 2024
 */

public interface CurrencyDispenser {
    void dispense(int amount);
    void setNextDispenser(CurrencyDispenser dispenser, int amount);
}
