package behavioral.strategy;

/**
 * @author gauravkabra
 * @since 2024
 */

public class Main {
    public static void main(String[] args) {
        ShoppingCart cart = new ShoppingCart();
        cart.addToCart(new Product("book", 80));
        cart.addToCart(new Product("pencil", 20));
        cart.pay(new CashPaymentStrategy());
    }
}
