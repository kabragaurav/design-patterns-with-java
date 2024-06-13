package structural.facade;

/**
 * @author gauravkabra
 * @since 2024
 */

public class Client {
    public static void main(String[] args) {
        CustomerService customerService = new CustomerServiceImpl();
        System.out.println(customerService.getBillingStatus());
        System.out.println(customerService.getShippingStatus());
        System.out.println(customerService.getOrderFulfilmentStatus());
    }
}
