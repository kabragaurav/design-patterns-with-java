package behavioral.strategy;

/**
 * @author gauravkabra
 * @since 2024
 */

public class CashPaymentStrategy implements PaymentStrategy {

    @Override
    public void pay(double amount) {
        System.out.println("paid via cash amount of $" + amount);
    }
    
}
