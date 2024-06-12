package structural.proxy;

/**
 * RealSubject
 * 
 * @author gauravkabra
 * @since 2024
 */

public class Rajasthan implements State {

    @Override
    public String getCapital(String stateName) {
        return "Jaipur";
    }
    
}
