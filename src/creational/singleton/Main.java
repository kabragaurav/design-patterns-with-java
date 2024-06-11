/**
 * 
 * Since logger is singleton, everything goes in single file
 * 
 * @author gauravkabra
 * @since 2024
 */

public class Main {
    public static void main(String[] args) {
        Logger logger = Logger.getLogger();
        logger.writeMessage("Application started");
        method1();
        logger.writeMessage("Application completed");
    }

    private static void method1() {
        Logger logger = Logger.getLogger();
        logger.writeMessage("method1 invoked");
    }
}
