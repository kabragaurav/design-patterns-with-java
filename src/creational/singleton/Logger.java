import java.io.FileNotFoundException;
import java.io.PrintStream;
import java.time.LocalDateTime;

/**
 * @author gauravkabra
 * @since 2024
 */

public class Logger {
    PrintStream writer;

    // eager initialization - object creation is expensive
    //private static Logger logger = new Logger();

    // lazy initialization
    private static Logger logger;

    private Logger() {
        LocalDateTime now = LocalDateTime.now();
        String name = "logFile_" + now;

        try {
            writer = new PrintStream(name);
            System.out.println(String.format("File %s created", name));
        } catch (FileNotFoundException ex) {
            ex.printStackTrace();
            System.exit(0);
        } 
    }

    synchronized public void writeMessage(String msg) {
        writer.println(msg);
    }

    public static Logger getLogger() {
        if (null == logger) {
            logger = new Logger();
        }
        return logger;
    }
}
