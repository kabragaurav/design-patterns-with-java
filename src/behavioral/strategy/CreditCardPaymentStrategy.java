package behavioral.strategy;

/**
 * @author gauravkabra
 * @since 2024
 */

public class CreditCardPaymentStrategy implements PaymentStrategy {

    private String cardNumber;

    public CreditCardPaymentStrategy(String cardNumber) {
        this.cardNumber = cardNumber;
    }

    @Override
    public void pay(double amount) {
        System.out.println("paid via credit card amount of $" + amount + " with card " + cardNumber);
    }
    
}
