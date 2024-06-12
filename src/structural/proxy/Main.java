package structural.proxy;

/**
 * @author gauravkabra
 * @since 2024
 */

public class Main {
    public static void main(String[] args) {
        ForeignMinistry proxy = new ForeignMinistry();

        // first time actual object returns data
        System.out.println(proxy.getCapital("Rajasthan"));
        // second time cached reponse is returned
        System.out.println(proxy.getCapital("Rajasthan"));
        
        System.out.println(proxy.getCapital("Punjab"));
    }
}
