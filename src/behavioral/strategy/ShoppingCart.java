package behavioral.strategy;

import java.util.ArrayList;
import java.util.List;

/**
 * @author gauravkabra
 * @since 2024
 */

public class ShoppingCart {

    private List<Product> products = new ArrayList<>();
    private double amount;

    public void addToCart(Product p) {
        products.add(p);
        amount += p.getPrice();
    }

    public void pay(PaymentStrategy paymentStrategy) {
        paymentStrategy.pay(amount);
    }
}
