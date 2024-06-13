package structural.facade;

/**
 * @author gauravkabra
 * @since 2024
 */

public class CustomerServiceImpl implements CustomerService {

    @Override
    public boolean getOrderFulfilmentStatus() {
       return new OrderFulfilment().getStatus();
    }

    @Override
    public boolean getBillingStatus() {
        return new BillingService().getStatus();
    }

    @Override
    public boolean getShippingStatus() {
        return new ShippingService().getStatus();
    }
    
}
