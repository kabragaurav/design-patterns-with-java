package behavioral.strategy;

/**
 * @author gauravkabra
 * @since 2024
 */

public class UPIPaymentStrategy implements PaymentStrategy {

    private String vpa;

    public UPIPaymentStrategy(String vpa) {
        this.vpa = vpa;
    }

    @Override
    public void pay(double amount) {
        System.out.println("paid via UPI amount of $" + amount + " with vpa " + vpa);
    }
    
}
