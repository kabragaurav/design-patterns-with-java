package structural.facade;

/**
 * @author gauravkabra
 * @since 2024
 */

public interface CustomerService {
    boolean getOrderFulfilmentStatus();
    boolean getBillingStatus();
    boolean getShippingStatus();
}
